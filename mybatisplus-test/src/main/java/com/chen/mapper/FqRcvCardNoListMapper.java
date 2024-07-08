package com.chen.mapper;

import com.chen.entity.FqRcvCardNoList;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FqRcvCardNoListMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(FqRcvCardNoList record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(FqRcvCardNoList record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    FqRcvCardNoList selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(FqRcvCardNoList record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(FqRcvCardNoList record);

    int updateBatch(List<FqRcvCardNoList> list);

    int batchInsert(@Param("list") List<FqRcvCardNoList> list);
}