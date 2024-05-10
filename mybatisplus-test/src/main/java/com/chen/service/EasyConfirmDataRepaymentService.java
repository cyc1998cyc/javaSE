package com.chen.service;

import java.util.List;
import com.chen.entity.EasyConfirmDataRepayment;
public interface EasyConfirmDataRepaymentService{


    int deleteByPrimaryKey(Long easyConfirmDataRepaymentId);

    int insert(EasyConfirmDataRepayment record);

    int insertSelective(EasyConfirmDataRepayment record);

    EasyConfirmDataRepayment selectByPrimaryKey(Long easyConfirmDataRepaymentId);

    int updateByPrimaryKeySelective(EasyConfirmDataRepayment record);

    int updateByPrimaryKey(EasyConfirmDataRepayment record);

    int updateBatch(List<EasyConfirmDataRepayment> list);

    int batchInsert(List<EasyConfirmDataRepayment> list);

}
