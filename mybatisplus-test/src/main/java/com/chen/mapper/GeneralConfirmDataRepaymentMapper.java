package com.chen.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.entity.GeneralConfirmDataRepayment;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GeneralConfirmDataRepaymentMapper extends BaseMapper<GeneralConfirmDataRepayment> {
    int updateBatch(List<GeneralConfirmDataRepayment> list);

    int batchInsert(@Param("list") List<GeneralConfirmDataRepayment> list);
}