package com.chen.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.chen.mapper.ExclusiveConfirmDataRepaymentMapper;
import com.chen.entity.ExclusiveConfirmDataRepayment;
import com.chen.service.ExclusiveConfirmDataRepaymentService;
@Service
public class ExclusiveConfirmDataRepaymentServiceImpl implements ExclusiveConfirmDataRepaymentService{

    @Resource
    private ExclusiveConfirmDataRepaymentMapper exclusiveConfirmDataRepaymentMapper;

    @Override
    public int deleteByPrimaryKey(Long exclusiveConfirmDataRepaymentId) {
        return exclusiveConfirmDataRepaymentMapper.deleteByPrimaryKey(exclusiveConfirmDataRepaymentId);
    }

    @Override
    public int insert(ExclusiveConfirmDataRepayment record) {
        return exclusiveConfirmDataRepaymentMapper.insert(record);
    }

    @Override
    public int insertSelective(ExclusiveConfirmDataRepayment record) {
        return exclusiveConfirmDataRepaymentMapper.insertSelective(record);
    }

    @Override
    public ExclusiveConfirmDataRepayment selectByPrimaryKey(Long exclusiveConfirmDataRepaymentId) {
        return exclusiveConfirmDataRepaymentMapper.selectByPrimaryKey(exclusiveConfirmDataRepaymentId);
    }

    @Override
    public int updateByPrimaryKeySelective(ExclusiveConfirmDataRepayment record) {
        return exclusiveConfirmDataRepaymentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ExclusiveConfirmDataRepayment record) {
        return exclusiveConfirmDataRepaymentMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<ExclusiveConfirmDataRepayment> list) {
        return exclusiveConfirmDataRepaymentMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<ExclusiveConfirmDataRepayment> list) {
        return exclusiveConfirmDataRepaymentMapper.batchInsert(list);
    }

}
