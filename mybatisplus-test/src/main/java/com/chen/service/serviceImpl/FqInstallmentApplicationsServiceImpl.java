package com.chen.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.chen.mapper.FqInstallmentApplicationsMapper;
import com.chen.entity.FqInstallmentApplications;
import com.chen.service.FqInstallmentApplicationsService;
@Service
public class FqInstallmentApplicationsServiceImpl extends ServiceImpl<FqInstallmentApplicationsMapper, FqInstallmentApplications> implements FqInstallmentApplicationsService{

    @Override
    public int updateBatch(List<FqInstallmentApplications> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<FqInstallmentApplications> list) {
        return baseMapper.batchInsert(list);
    }
}
