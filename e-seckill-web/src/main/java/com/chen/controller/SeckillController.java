package com.chen.controller;

import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeckillController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    /**
     * 1 用户去重
     * 2 库存的预扣减
     * 3 消息放入mq
     * @param goodsId
     * @param userId
     * @return
     */
    @GetMapping("secKill")
    public String doSecKill(Integer goodsId,Integer userId) {

        String uk = userId + "-" + goodsId;

        Boolean flag = redisTemplate.opsForValue().setIfAbsent(uk, "");
        if (flag){
            return "您已参与过该商品的的抢购，请参与其他商品";
        }
        // TODO: 2023/6/7 库存的预扣减

        Long count = redisTemplate.opsForValue().decrement("goodsId:" + goodsId);

        if (count < 0){
            return "该商品已经被抢完，下次早点来！";
        }

        //放mq异步处理
        rocketMQTemplate.asyncSend("seckillTopic", uk, new SendCallback() {
            @Override
            public void onSuccess(SendResult sendResult) {
                System.out.println("发送成功！");
            }

            @Override
            public void onException(Throwable throwable) {
                System.out.println("发送失败："+ throwable.getMessage());
            }
        });


        return "正在拼命抢购中，请稍后在订单中心查看";
    }
}
