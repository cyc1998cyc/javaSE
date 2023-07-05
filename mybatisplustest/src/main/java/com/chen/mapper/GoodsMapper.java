package com.chen.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.entity.Goods;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsMapper extends BaseMapper<Goods> {
    int updateBatch(List<Goods> list);

    int batchInsert(@Param("list") List<Goods> list);
}