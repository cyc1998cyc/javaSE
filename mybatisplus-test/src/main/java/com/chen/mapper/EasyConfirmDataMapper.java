package com.chen.mapper;

import com.chen.entity.EasyConfirmData;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EasyConfirmDataMapper {
    /**
     * delete by primary key
     * @param easyConfirmDataId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(@Param("easyConfirmDataId") Long easyConfirmDataId, @Param("createTime") Date createTime);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(EasyConfirmData record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(EasyConfirmData record);

    /**
     * select by primary key
     * @param easyConfirmDataId primary key
     * @return object by primary key
     */
    EasyConfirmData selectByPrimaryKey(@Param("easyConfirmDataId") Long easyConfirmDataId, @Param("createTime") Date createTime);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(EasyConfirmData record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(EasyConfirmData record);

    int updateBatch(List<EasyConfirmData> list);

    int batchInsert(@Param("list") List<EasyConfirmData> list);
}