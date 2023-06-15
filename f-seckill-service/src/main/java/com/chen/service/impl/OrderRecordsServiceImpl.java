package com.chen.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.chen.mapper.OrderRecordsMapper;
import com.chen.domain.OrderRecords;
import com.chen.service.OrderRecordsService;
@Service
public class OrderRecordsServiceImpl implements OrderRecordsService{

    @Resource
    private OrderRecordsMapper orderRecordsMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return orderRecordsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OrderRecords record) {
        return orderRecordsMapper.insert(record);
    }

    @Override
    public int insertSelective(OrderRecords record) {
        return orderRecordsMapper.insertSelective(record);
    }

    @Override
    public OrderRecords selectByPrimaryKey(Integer id) {
        return orderRecordsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderRecords record) {
        return orderRecordsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderRecords record) {
        return orderRecordsMapper.updateByPrimaryKey(record);
    }

}
