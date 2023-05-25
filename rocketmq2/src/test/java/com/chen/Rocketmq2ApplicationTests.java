package com.chen;

import com.chen.constant.MqConstant;
import org.apache.rocketmq.client.consumer.DefaultLitePullConsumer;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class Rocketmq2ApplicationTests {


    /**
     * 发消息
     */
    @Test
    void contextLoads() throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
        //创建一个生产者
        DefaultMQProducer defaultMQProducer = new DefaultMQProducer("test-producer-group");
        //链接namesrv
        defaultMQProducer.setNamesrvAddr(MqConstant.NAME_SRV_ADDR);
        //启动
        defaultMQProducer.start();

        for (int i = 0; i < 10; i++) {
            //创建一个消息
            Message message = new Message("testTopic", "我是一个消息".getBytes());

            SendResult result = defaultMQProducer.send(message);

            System.out.println(result.getSendStatus());
        }


        defaultMQProducer.shutdown();

    }

    @Test
    void simpleTestConsumer() throws Exception {

        //创建一个消费者
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("test-producer-group");
        //链接mqnamesrv
        consumer.setNamesrvAddr(MqConstant.NAME_SRV_ADDR);
        //订阅主题 * 表示这个主题中所有的消息
        consumer.subscribe("testTopic", "*");

        //设置监听器
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
                //这个就是消费的方法
                System.out.println("我是消费者");
                System.out.println(list.get(0).toString());
                System.out.println("消息内容：" + new String(list.get(0).getBody()));
                System.out.println("消费上下文:" + consumeConcurrentlyContext);
                //CONSUME_SUCCESS 成功的表示消息队列从mq出
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });

        consumer.start();
        System.in.read();
    }

    @Test
    public void asyncProducer() throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("async-producer-group");
        producer.setNamesrvAddr(MqConstant.NAME_SRV_ADDR);
        producer.start();
        Message message = new Message("asyncTopic", "我是一个异步消息".getBytes());
        producer.send(message, new SendCallback() {
            @Override
            public void onSuccess(SendResult sendResult) {
                System.out.println("发送成功");
            }

            @Override
            public void onException(Throwable throwable) {
                System.out.println("发送失败" + throwable.getMessage());
            }
        });

        System.out.println("我先执行");
        System.in.read();
    }

    @Test
    public void oneWayProducer() throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("oneway-producer-group");
        producer.setNamesrvAddr(MqConstant.NAME_SRV_ADDR);
        producer.start();
        Message message = new Message("one|way-Topic", "日志xxx".getBytes());
        producer.sendOneway(message);
        System.out.println("发送成功");
        producer.shutdown();

    }

    @Test
    public void DmsTest() throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("ms-producer-group");
        producer.setNamesrvAddr(MqConstant.NAME_SRV_ADDR);
        producer.start();
        Message message = new Message("orderMsTopic", "订单号，座位号".getBytes());
        message.setDelayTimeLevel(3);
        producer.send(message);
        System.out.println("发送时间" + new Date());
        producer.shutdown();

    }

    @Test
    public void msConsumweTest() throws Exception {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("ms-producer-group");
        consumer.setNamesrvAddr(MqConstant.NAME_SRV_ADDR);
        consumer.subscribe("orderMsTopic", "*");
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
                System.out.println("收到消息了" + new Date());
                System.out.println(new String(list.get(0).getBody()));
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });

        consumer.start();
        System.in.read();

    }


    @Test
    public void banchProducerTest() throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("banch-producer-group");
        producer.setNamesrvAddr(MqConstant.NAME_SRV_ADDR);
        producer.start();

        List<Message> messages = Arrays.asList(
                new Message("banchTopic", "我是一组消息的A消息".getBytes()),
                new Message("banchTopic", "我是一组消息的B消息".getBytes()),
                new Message("banchTopic", "我是一组消息的C消息".getBytes())
        );

        producer.send(messages);
        System.out.println("发送成功");
        producer.shutdown();

    }

    @Test
    public void banchConsumweTest() throws Exception {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("banch-producer-group");
        consumer.setNamesrvAddr(MqConstant.NAME_SRV_ADDR);
        consumer.subscribe("banchTopic", "*");
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
                System.out.println("收到消息了" + new Date());
                System.out.println(list.size());
                System.out.println(new String(list.get(0).getBody()));
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });

        consumer.start();
        System.in.read();

    }

    @Test
    public void tagProducerTest() throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("tag-producer-test");
        producer.setNamesrvAddr(MqConstant.NAME_SRV_ADDR);
        producer.start();
        Message message = new Message("tagTopic", "vip1", "我是vip1的文章".getBytes());
        Message message2 = new Message("tagTopic", "vip2", "我是vip2的文章".getBytes());
        producer.send(message);
        producer.send(message2);
        System.out.println("发送成功");
        producer.shutdown();

    }

    @Test
    public void tagConsumer1() throws Exception {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("tag-consumer-test-a");
        consumer.setNamesrvAddr(MqConstant.NAME_SRV_ADDR);
        consumer.subscribe("tagTopic", "vip1");
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
                System.out.println("我是vip1的消费者，正在消费消息" + new String(list.get(0).getBody()));
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });
        consumer.start();
        System.in.read();


    }

    @Test
    public void tagConsumer2() throws Exception {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("tag-consumer-test-b");
        consumer.setNamesrvAddr(MqConstant.NAME_SRV_ADDR);
        consumer.subscribe("tagTopic", "vip1 || vip2");
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
                System.out.println("我是vip2的消费者，正在消费消息" + new String(list.get(0).getBody()));
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });
        consumer.start();
        System.in.read();


    }

    @Test
    public void keyProducerTest() throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("key-producer-test");
        producer.setNamesrvAddr(MqConstant.NAME_SRV_ADDR);
        producer.start();
        String key = UUID.randomUUID().toString();
        Message message = new Message("keyTopic", "vip1", key, "我是vip1的文章".getBytes());
        producer.send(message);
        System.out.println("发送成功");
        System.out.println(key);
        producer.shutdown();

    }

    @Test
    public void keyConsumer() throws Exception {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("key-consumer-test-b");
        consumer.setNamesrvAddr(MqConstant.NAME_SRV_ADDR);
        consumer.subscribe("keyTopic", "*");
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
                MessageExt messageExt = list.get(0);
                System.out.println("业务标志："+messageExt.getKeys());
                System.out.println("我是vip2的消费者，正在消费消息" + new String(list.get(0).getBody()));
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });
        consumer.start();
        System.in.read();


    }


}
