package com.chen.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.chen.mapper.GeneralConfirmDataRepaymentMapper;
import com.chen.entity.GeneralConfirmDataRepayment;
import java.util.List;
import com.chen.service.GeneralConfirmDataRepaymentService;
@Service
public class GeneralConfirmDataRepaymentServiceImpl implements GeneralConfirmDataRepaymentService{

    @Resource
    private GeneralConfirmDataRepaymentMapper generalConfirmDataRepaymentMapper;

    @Override
    public int deleteByPrimaryKey(Long generalConfirmDataRepaymentId) {
        return generalConfirmDataRepaymentMapper.deleteByPrimaryKey(generalConfirmDataRepaymentId);
    }

    @Override
    public int insert(GeneralConfirmDataRepayment record) {
        return generalConfirmDataRepaymentMapper.insert(record);
    }

    @Override
    public int insertSelective(GeneralConfirmDataRepayment record) {
        return generalConfirmDataRepaymentMapper.insertSelective(record);
    }

    @Override
    public GeneralConfirmDataRepayment selectByPrimaryKey(Long generalConfirmDataRepaymentId) {
        return generalConfirmDataRepaymentMapper.selectByPrimaryKey(generalConfirmDataRepaymentId);
    }

    @Override
    public int updateByPrimaryKeySelective(GeneralConfirmDataRepayment record) {
        return generalConfirmDataRepaymentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GeneralConfirmDataRepayment record) {
        return generalConfirmDataRepaymentMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<GeneralConfirmDataRepayment> list) {
        return generalConfirmDataRepaymentMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<GeneralConfirmDataRepayment> list) {
        return generalConfirmDataRepaymentMapper.batchInsert(list);
    }

}
