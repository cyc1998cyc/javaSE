package com.chen.service;

import java.util.List;
import com.chen.entity.FqRcvCardNoList;
public interface FqRcvCardNoListService{


    int deleteByPrimaryKey(Integer id);

    int insert(FqRcvCardNoList record);

    int insertSelective(FqRcvCardNoList record);

    FqRcvCardNoList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FqRcvCardNoList record);

    int updateByPrimaryKey(FqRcvCardNoList record);

    int updateBatch(List<FqRcvCardNoList> list);

    int batchInsert(List<FqRcvCardNoList> list);

}
