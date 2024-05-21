package com.chen.mapper;

import com.chen.entity.ExclusiveConfirmData;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExclusiveConfirmDataMapper {
    /**
     * delete by primary key
     * @param exclusiveConfirmDataId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(@Param("exclusiveConfirmDataId") Long exclusiveConfirmDataId, @Param("createTime") Date createTime);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(ExclusiveConfirmData record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(ExclusiveConfirmData record);

    /**
     * select by primary key
     * @param exclusiveConfirmDataId primary key
     * @return object by primary key
     */
    ExclusiveConfirmData selectByPrimaryKey(@Param("exclusiveConfirmDataId") Long exclusiveConfirmDataId, @Param("createTime") Date createTime);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(ExclusiveConfirmData record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(ExclusiveConfirmData record);

    int updateBatch(List<ExclusiveConfirmData> list);

    int batchInsert(@Param("list") List<ExclusiveConfirmData> list);
}