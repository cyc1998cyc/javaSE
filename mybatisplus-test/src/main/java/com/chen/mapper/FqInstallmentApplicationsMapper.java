package com.chen.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.entity.FqInstallmentApplications;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FqInstallmentApplicationsMapper extends BaseMapper<FqInstallmentApplications> {
    int updateBatch(List<FqInstallmentApplications> list);

    int batchInsert(@Param("list") List<FqInstallmentApplications> list);
}