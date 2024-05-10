package com.chen.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.chen.mapper.EasyConfirmDataRepaymentMapper;
import com.chen.entity.EasyConfirmDataRepayment;
import com.chen.service.EasyConfirmDataRepaymentService;
@Service
public class EasyConfirmDataRepaymentServiceImpl implements EasyConfirmDataRepaymentService{

    @Resource
    private EasyConfirmDataRepaymentMapper easyConfirmDataRepaymentMapper;

    @Override
    public int deleteByPrimaryKey(Long easyConfirmDataRepaymentId) {
        return easyConfirmDataRepaymentMapper.deleteByPrimaryKey(easyConfirmDataRepaymentId);
    }

    @Override
    public int insert(EasyConfirmDataRepayment record) {
        return easyConfirmDataRepaymentMapper.insert(record);
    }

    @Override
    public int insertSelective(EasyConfirmDataRepayment record) {
        return easyConfirmDataRepaymentMapper.insertSelective(record);
    }

    @Override
    public EasyConfirmDataRepayment selectByPrimaryKey(Long easyConfirmDataRepaymentId) {
        return easyConfirmDataRepaymentMapper.selectByPrimaryKey(easyConfirmDataRepaymentId);
    }

    @Override
    public int updateByPrimaryKeySelective(EasyConfirmDataRepayment record) {
        return easyConfirmDataRepaymentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(EasyConfirmDataRepayment record) {
        return easyConfirmDataRepaymentMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<EasyConfirmDataRepayment> list) {
        return easyConfirmDataRepaymentMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<EasyConfirmDataRepayment> list) {
        return easyConfirmDataRepaymentMapper.batchInsert(list);
    }

}
