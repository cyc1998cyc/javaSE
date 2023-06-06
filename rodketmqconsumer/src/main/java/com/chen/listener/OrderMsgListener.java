package com.chen.listener;

import com.alibaba.fastjson.JSON;
import com.chen.model.MsgModel;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.spring.annotation.ConsumeMode;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

@Component
@RocketMQMessageListener(topic = "bootOrderTopic",
        consumerGroup = "boot-order-consumer-group",
        consumeMode = ConsumeMode.ORDERLY,
        maxReconsumeTimes = 5)
public class OrderMsgListener implements RocketMQListener<MessageExt> {
    @Override
    public void onMessage(MessageExt messageExt) {
        MsgModel msgModel = JSON.parseObject(new String(messageExt.getBody()), MsgModel.class);
        System.out.println(msgModel);
    }
}
