package com.chen.service;

import com.chen.entity.GeneralConfirmDataRepayment;
import java.util.List;
public interface GeneralConfirmDataRepaymentService{


    int deleteByPrimaryKey(Long generalConfirmDataRepaymentId);

    int insert(GeneralConfirmDataRepayment record);

    int insertSelective(GeneralConfirmDataRepayment record);

    GeneralConfirmDataRepayment selectByPrimaryKey(Long generalConfirmDataRepaymentId);

    int updateByPrimaryKeySelective(GeneralConfirmDataRepayment record);

    int updateByPrimaryKey(GeneralConfirmDataRepayment record);

    int updateBatch(List<GeneralConfirmDataRepayment> list);

    int batchInsert(List<GeneralConfirmDataRepayment> list);

}
