package com.chen.config;

import com.chen.domain.Goods;
import com.chen.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * 同步mysql数据到redis中
 */

@Component
public class DataSync {

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @PostConstruct
    public void initData(){
        List<Goods> goodsList = goodsMapper.selectSeckillGoods();

        if (goodsList.isEmpty()){
            return;
        }

        for (Goods goods : goodsList) {
            redisTemplate.opsForValue().set("goodsId:"+goods.getId(),goods.getStocks().toString());
        }
    }

}
