package com.chen.service;

import java.util.List;
import com.chen.entity.EasyConfirmDataRepayment;
import com.baomidou.mybatisplus.extension.service.IService;
public interface EasyConfirmDataRepaymentService extends IService<EasyConfirmDataRepayment>{


    int updateBatch(List<EasyConfirmDataRepayment> list);

    int batchInsert(List<EasyConfirmDataRepayment> list);

}
