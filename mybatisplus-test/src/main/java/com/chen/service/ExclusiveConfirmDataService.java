package com.chen.service;

import java.util.List;
import java.util.Date;
import com.chen.entity.ExclusiveConfirmData;
public interface ExclusiveConfirmDataService{


    int deleteByPrimaryKey(Long exclusiveConfirmDataId,Date createTime);

    int insert(ExclusiveConfirmData record);

    int insertSelective(ExclusiveConfirmData record);

    ExclusiveConfirmData selectByPrimaryKey(Long exclusiveConfirmDataId,Date createTime);

    int updateByPrimaryKeySelective(ExclusiveConfirmData record);

    int updateByPrimaryKey(ExclusiveConfirmData record);

    int updateBatch(List<ExclusiveConfirmData> list);

    int batchInsert(List<ExclusiveConfirmData> list);

}
