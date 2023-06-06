package com.chen;

import com.chen.constant.MqConstant;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@SpringBootTest
public class IRetryTest {
    @Test
    public void reTryProducerTest() throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("reTry-producer-test");
        producer.setNamesrvAddr(MqConstant.NAME_SRV_ADDR);
        producer.start();

        //生产者发送消息 重试次数
        producer.setRetryTimesWhenSendFailed(2);
        producer.setRetryTimesWhenSendAsyncFailed(2);

        String key = UUID.randomUUID().toString();
        Message message = new Message("reTryTopic", "vip1", key, "扣减库存666".getBytes());
        producer.send(message);
        System.out.println("发送成功");
        producer.shutdown();

    }

    @Test
    public void repeatConsumer() throws Exception {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("reTry-consumer-test");
        consumer.setNamesrvAddr(MqConstant.NAME_SRV_ADDR);
        consumer.subscribe("reTryTopic", "*");
        //设定充实次数
        consumer.setMaxReconsumeTimes(2);
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
                MessageExt messageExt = list.get(0);
                System.out.println(new Date());
                System.out.println(new String(messageExt.getBody()));
                System.out.println(messageExt.getReconsumeTimes());
                return ConsumeConcurrentlyStatus.RECONSUME_LATER;
            }
        });
        consumer.start();
        System.in.read();


    }
}
