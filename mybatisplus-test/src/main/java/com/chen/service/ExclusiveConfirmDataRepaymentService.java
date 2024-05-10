package com.chen.service;

import java.util.List;
import com.chen.entity.ExclusiveConfirmDataRepayment;
import com.baomidou.mybatisplus.extension.service.IService;
public interface ExclusiveConfirmDataRepaymentService extends IService<ExclusiveConfirmDataRepayment>{


    int updateBatch(List<ExclusiveConfirmDataRepayment> list);

    int batchInsert(List<ExclusiveConfirmDataRepayment> list);

}
