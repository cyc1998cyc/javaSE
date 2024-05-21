package com.chen.mapper;

import com.chen.entity.GeneralConfirmData;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GeneralConfirmDataMapper {
    /**
     * delete by primary key
     * @param generalConfirmDataId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(@Param("generalConfirmDataId") Long generalConfirmDataId, @Param("createTime") Date createTime);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(GeneralConfirmData record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(GeneralConfirmData record);

    /**
     * select by primary key
     * @param generalConfirmDataId primary key
     * @return object by primary key
     */
    GeneralConfirmData selectByPrimaryKey(@Param("generalConfirmDataId") Long generalConfirmDataId, @Param("createTime") Date createTime);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(GeneralConfirmData record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(GeneralConfirmData record);

    int updateBatch(List<GeneralConfirmData> list);

    int batchInsert(@Param("list") List<GeneralConfirmData> list);
}