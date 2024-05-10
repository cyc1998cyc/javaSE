package com.chen.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chen.mapper.GeneralConfirmDataRepaymentMapper;
import com.chen.entity.GeneralConfirmDataRepayment;
import java.util.List;
import com.chen.service.GeneralConfirmDataRepaymentService;
@Service
public class GeneralConfirmDataRepaymentServiceImpl extends ServiceImpl<GeneralConfirmDataRepaymentMapper, GeneralConfirmDataRepayment> implements GeneralConfirmDataRepaymentService{

    @Override
    public int updateBatch(List<GeneralConfirmDataRepayment> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<GeneralConfirmDataRepayment> list) {
        return baseMapper.batchInsert(list);
    }
}
