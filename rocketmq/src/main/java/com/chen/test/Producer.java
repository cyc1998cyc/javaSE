package com.chen.test;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.io.UnsupportedEncodingException;

/**
 * @author cyc
 * @createTime 2023/5/6 18:10
 * @description
 */

public class Producer {
    public static void main(String[] args) throws MQClientException, UnsupportedEncodingException, RemotingException, InterruptedException, MQBrokerException {
        //创建一个生产者，指定生产者组为sanyouProducer
        DefaultMQProducer producer = new DefaultMQProducer("sanyouProducer");

        producer.setNamesrvAddr("192.168.5.133:9876");

        producer.setSendMsgTimeout(60000);

        producer.start();

        Message msg = new Message("sanyouTopic", "TagA", "三友的java日记 ".getBytes(RemotingHelper.DEFAULT_CHARSET));

        for (int i = 0; i < 1000; i++) {

            SendResult sendResult = producer.send(msg);
        }


        //System.out.printf("%s%n", sendResult);

        producer.shutdown();

    }

}
