package com.chen.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.chen.mapper.EasyConfirmDataRepaymentMapper;
import com.chen.entity.EasyConfirmDataRepayment;
import com.chen.service.EasyConfirmDataRepaymentService;
@Service
public class EasyConfirmDataRepaymentServiceImpl extends ServiceImpl<EasyConfirmDataRepaymentMapper, EasyConfirmDataRepayment> implements EasyConfirmDataRepaymentService{

    @Override
    public int updateBatch(List<EasyConfirmDataRepayment> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<EasyConfirmDataRepayment> list) {
        return baseMapper.batchInsert(list);
    }
}
