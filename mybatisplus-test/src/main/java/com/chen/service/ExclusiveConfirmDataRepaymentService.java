package com.chen.service;

import java.util.List;
import com.chen.entity.ExclusiveConfirmDataRepayment;
public interface ExclusiveConfirmDataRepaymentService{


    int deleteByPrimaryKey(Long exclusiveConfirmDataRepaymentId);

    int insert(ExclusiveConfirmDataRepayment record);

    int insertSelective(ExclusiveConfirmDataRepayment record);

    ExclusiveConfirmDataRepayment selectByPrimaryKey(Long exclusiveConfirmDataRepaymentId);

    int updateByPrimaryKeySelective(ExclusiveConfirmDataRepayment record);

    int updateByPrimaryKey(ExclusiveConfirmDataRepayment record);

    int updateBatch(List<ExclusiveConfirmDataRepayment> list);

    int batchInsert(List<ExclusiveConfirmDataRepayment> list);

}
