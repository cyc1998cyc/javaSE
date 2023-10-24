package com.chen.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.chen.entity.Goods;
import com.chen.mapper.GoodsMapper;
import com.chen.service.GoodsService;
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService{

    @Override
    public int updateBatch(List<Goods> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<Goods> list) {
        return baseMapper.batchInsert(list);
    }
}
