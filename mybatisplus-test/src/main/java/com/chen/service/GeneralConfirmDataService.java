package com.chen.service;

import java.util.List;
import java.util.Date;
import com.chen.entity.GeneralConfirmData;
public interface GeneralConfirmDataService{


    int deleteByPrimaryKey(Long generalConfirmDataId,Date createTime);

    int insert(GeneralConfirmData record);

    int insertSelective(GeneralConfirmData record);

    GeneralConfirmData selectByPrimaryKey(Long generalConfirmDataId,Date createTime);

    int updateByPrimaryKeySelective(GeneralConfirmData record);

    int updateByPrimaryKey(GeneralConfirmData record);

    int updateBatch(List<GeneralConfirmData> list);

    int batchInsert(List<GeneralConfirmData> list);

}
