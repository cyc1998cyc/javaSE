package com.chen.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.chen.mapper.FqConfirmDataRepaymentMapper;
import com.chen.entity.FqConfirmDataRepayment;
import java.util.List;
import com.chen.service.FqConfirmDataRepaymentService;
@Service
public class FqConfirmDataRepaymentServiceImpl implements FqConfirmDataRepaymentService{

    @Resource
    private FqConfirmDataRepaymentMapper fqConfirmDataRepaymentMapper;

    @Override
    public int deleteByPrimaryKey(String fqConfirmDataRepaymentId) {
        return fqConfirmDataRepaymentMapper.deleteByPrimaryKey(fqConfirmDataRepaymentId);
    }

    @Override
    public int insert(FqConfirmDataRepayment record) {
        return fqConfirmDataRepaymentMapper.insert(record);
    }

    @Override
    public int insertSelective(FqConfirmDataRepayment record) {
        return fqConfirmDataRepaymentMapper.insertSelective(record);
    }

    @Override
    public FqConfirmDataRepayment selectByPrimaryKey(String fqConfirmDataRepaymentId) {
        return fqConfirmDataRepaymentMapper.selectByPrimaryKey(fqConfirmDataRepaymentId);
    }

    @Override
    public int updateByPrimaryKeySelective(FqConfirmDataRepayment record) {
        return fqConfirmDataRepaymentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FqConfirmDataRepayment record) {
        return fqConfirmDataRepaymentMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<FqConfirmDataRepayment> list) {
        return fqConfirmDataRepaymentMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<FqConfirmDataRepayment> list) {
        return fqConfirmDataRepaymentMapper.batchInsert(list);
    }

}
