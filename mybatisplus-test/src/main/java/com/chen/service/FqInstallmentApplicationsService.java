package com.chen.service;

import java.util.List;
import com.chen.entity.FqInstallmentApplications;
import com.baomidou.mybatisplus.extension.service.IService;
public interface FqInstallmentApplicationsService extends IService<FqInstallmentApplications>{


    int updateBatch(List<FqInstallmentApplications> list);

    int batchInsert(List<FqInstallmentApplications> list);

}
