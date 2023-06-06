package com.chen;

import com.alibaba.fastjson.JSON;
import com.chen.model.MsgModel;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.apache.rocketmq.spring.support.RocketMQHeaders;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class RocketmqTestApplicationTests {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @Test
    void contextLoads() {

//        //同步消息
//        rocketMQTemplate.syncSend("bootTestTopic","我是boot的一个消息");
//
//        //异步消息
//        rocketMQTemplate.asyncSend("bootTestTopic", "我是boot的一个一部消息", new SendCallback() {
//            @Override
//            public void onSuccess(SendResult sendResult) {
//                System.out.println("发送成功");
//            }
//
//            @Override
//            public void onException(Throwable throwable) {
//                System.out.println("失败" + throwable.getMessage());
//
//            }
//        });
//
//        //单项消息
//        rocketMQTemplate.sendOneWay("bootOneWayTopic","单项消息");
//
//        //延迟消息
//        Message<String> msg = MessageBuilder.withPayload("我是一个延迟消息").build();
//        rocketMQTemplate.syncSend("bootMsgTopic",msg,3000,3);

        //顺序消息 发送者需要将一组消息发送到同一个队列里

        List<MsgModel> models = Arrays.asList(
                new MsgModel("qwer", 1, "下单"),
                new MsgModel("qwer", 2, "下单"),
                new MsgModel("qwer", 1, "下单"),
                new MsgModel("qwer", 1, "下单"),
                new MsgModel("qwer", 1, "下单"),
                new MsgModel("qwer", 1, "下单")
        );

        models.forEach(msgModel -> {
            //发送
            rocketMQTemplate.syncSendOrderly("bootOrderTopic", JSON.toJSONString(msgModel), msgModel.getOrderSn());
        });
    }

    @Test
    public void tagKeyTest() {
        rocketMQTemplate.syncSend("bootTagTopic:TagA", "我是一个带tag的消息");

        Message<String> message = MessageBuilder.withPayload("我是一个带key的消息").setHeader(RocketMQHeaders.KEYS, "213456").build();

        rocketMQTemplate.syncSend("bootTagTopic:TagA", message);

    }

    /**
     * 测试集群模式
     */
    @Test
    public void testModel() throws Exception {
        for (int i = 0; i < 10; i++) {
            rocketMQTemplate.syncSend("modelTopic","我是第"+ i+"个消息");
        }

    }

}
