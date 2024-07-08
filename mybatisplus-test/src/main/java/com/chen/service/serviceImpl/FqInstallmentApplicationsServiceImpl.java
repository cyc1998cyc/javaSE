package com.chen.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.chen.mapper.FqInstallmentApplicationsMapper;
import com.chen.entity.FqInstallmentApplications;
import com.chen.service.FqInstallmentApplicationsService;
@Service
public class FqInstallmentApplicationsServiceImpl implements FqInstallmentApplicationsService{

    @Resource
    private FqInstallmentApplicationsMapper fqInstallmentApplicationsMapper;

    @Override
    public int deleteByPrimaryKey(String fqInstallmentApplicationsId) {
        return fqInstallmentApplicationsMapper.deleteByPrimaryKey(fqInstallmentApplicationsId);
    }

    @Override
    public int insert(FqInstallmentApplications record) {
        return fqInstallmentApplicationsMapper.insert(record);
    }

    @Override
    public int insertSelective(FqInstallmentApplications record) {
        return fqInstallmentApplicationsMapper.insertSelective(record);
    }

    @Override
    public FqInstallmentApplications selectByPrimaryKey(String fqInstallmentApplicationsId) {
        return fqInstallmentApplicationsMapper.selectByPrimaryKey(fqInstallmentApplicationsId);
    }

    @Override
    public int updateByPrimaryKeySelective(FqInstallmentApplications record) {
        return fqInstallmentApplicationsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FqInstallmentApplications record) {
        return fqInstallmentApplicationsMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<FqInstallmentApplications> list) {
        return fqInstallmentApplicationsMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<FqInstallmentApplications> list) {
        return fqInstallmentApplicationsMapper.batchInsert(list);
    }

}
