package com.chen.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.entity.ExclusiveConfirmDataRepayment;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExclusiveConfirmDataRepaymentMapper extends BaseMapper<ExclusiveConfirmDataRepayment> {
    int updateBatch(List<ExclusiveConfirmDataRepayment> list);

    int batchInsert(@Param("list") List<ExclusiveConfirmDataRepayment> list);
}