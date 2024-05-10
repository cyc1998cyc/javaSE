package com.chen.service;

import java.util.List;
import com.chen.entity.FqInstallmentApplications;
public interface FqInstallmentApplicationsService{


    int deleteByPrimaryKey(Long fqInstallmentApplicationsId);

    int insert(FqInstallmentApplications record);

    int insertSelective(FqInstallmentApplications record);

    FqInstallmentApplications selectByPrimaryKey(Long fqInstallmentApplicationsId);

    int updateByPrimaryKeySelective(FqInstallmentApplications record);

    int updateByPrimaryKey(FqInstallmentApplications record);

    int updateBatch(List<FqInstallmentApplications> list);

    int batchInsert(List<FqInstallmentApplications> list);

}
