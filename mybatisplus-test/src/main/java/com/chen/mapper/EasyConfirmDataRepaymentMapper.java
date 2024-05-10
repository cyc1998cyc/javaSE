package com.chen.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.entity.EasyConfirmDataRepayment;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EasyConfirmDataRepaymentMapper extends BaseMapper<EasyConfirmDataRepayment> {
    int updateBatch(List<EasyConfirmDataRepayment> list);

    int batchInsert(@Param("list") List<EasyConfirmDataRepayment> list);
}