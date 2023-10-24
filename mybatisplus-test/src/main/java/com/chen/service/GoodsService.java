package com.chen.service;

import java.util.List;
import com.chen.entity.Goods;
import com.baomidou.mybatisplus.extension.service.IService;
public interface GoodsService extends IService<Goods>{


    int updateBatch(List<Goods> list);

    int batchInsert(List<Goods> list);

}
