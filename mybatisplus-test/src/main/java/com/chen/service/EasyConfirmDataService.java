package com.chen.service;

import java.util.List;
import com.chen.entity.EasyConfirmData;
import java.util.Date;
public interface EasyConfirmDataService{


    int deleteByPrimaryKey(Long easyConfirmDataId,Date createTime);

    int insert(EasyConfirmData record);

    int insertSelective(EasyConfirmData record);

    EasyConfirmData selectByPrimaryKey(Long easyConfirmDataId,Date createTime);

    int updateByPrimaryKeySelective(EasyConfirmData record);

    int updateByPrimaryKey(EasyConfirmData record);

    int updateBatch(List<EasyConfirmData> list);

    int batchInsert(List<EasyConfirmData> list);

}
