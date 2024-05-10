package com.chen.service;

import com.chen.entity.GeneralConfirmDataRepayment;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface GeneralConfirmDataRepaymentService extends IService<GeneralConfirmDataRepayment>{


    int updateBatch(List<GeneralConfirmDataRepayment> list);

    int batchInsert(List<GeneralConfirmDataRepayment> list);

}
