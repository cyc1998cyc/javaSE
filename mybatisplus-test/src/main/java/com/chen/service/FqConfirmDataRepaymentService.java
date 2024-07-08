package com.chen.service;

import com.chen.entity.FqConfirmDataRepayment;
import java.util.List;
public interface FqConfirmDataRepaymentService{


    int deleteByPrimaryKey(String fqConfirmDataRepaymentId);

    int insert(FqConfirmDataRepayment record);

    int insertSelective(FqConfirmDataRepayment record);

    FqConfirmDataRepayment selectByPrimaryKey(String fqConfirmDataRepaymentId);

    int updateByPrimaryKeySelective(FqConfirmDataRepayment record);

    int updateByPrimaryKey(FqConfirmDataRepayment record);

    int updateBatch(List<FqConfirmDataRepayment> list);

    int batchInsert(List<FqConfirmDataRepayment> list);

}
