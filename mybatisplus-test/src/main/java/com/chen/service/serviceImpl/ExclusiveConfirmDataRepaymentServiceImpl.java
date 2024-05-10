package com.chen.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.chen.mapper.ExclusiveConfirmDataRepaymentMapper;
import com.chen.entity.ExclusiveConfirmDataRepayment;
import com.chen.service.ExclusiveConfirmDataRepaymentService;
@Service
public class ExclusiveConfirmDataRepaymentServiceImpl extends ServiceImpl<ExclusiveConfirmDataRepaymentMapper, ExclusiveConfirmDataRepayment> implements ExclusiveConfirmDataRepaymentService{

    @Override
    public int updateBatch(List<ExclusiveConfirmDataRepayment> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<ExclusiveConfirmDataRepayment> list) {
        return baseMapper.batchInsert(list);
    }
}
