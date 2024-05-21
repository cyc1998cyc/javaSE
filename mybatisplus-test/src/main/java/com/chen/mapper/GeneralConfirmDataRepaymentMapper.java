package com.chen.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GeneralConfirmDataRepaymentMapper {
    /**
     * delete by primary key
     * @param generalConfirmDataRepaymentId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long generalConfirmDataRepaymentId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(GeneralConfirmDataRepayment record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(GeneralConfirmDataRepayment record);

    /**
     * select by primary key
     * @param generalConfirmDataRepaymentId primary key
     * @return object by primary key
     */
    GeneralConfirmDataRepayment selectByPrimaryKey(Long generalConfirmDataRepaymentId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(GeneralConfirmDataRepayment record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(GeneralConfirmDataRepayment record);

    int updateBatch(List<GeneralConfirmDataRepayment> list);

    int batchInsert(@Param("list") List<GeneralConfirmDataRepayment> list);
}