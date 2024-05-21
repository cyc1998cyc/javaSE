package com.chen.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExclusiveConfirmDataRepaymentMapper {
    /**
     * delete by primary key
     * @param exclusiveConfirmDataRepaymentId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long exclusiveConfirmDataRepaymentId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(ExclusiveConfirmDataRepayment record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(ExclusiveConfirmDataRepayment record);

    /**
     * select by primary key
     * @param exclusiveConfirmDataRepaymentId primary key
     * @return object by primary key
     */
    ExclusiveConfirmDataRepayment selectByPrimaryKey(Long exclusiveConfirmDataRepaymentId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(ExclusiveConfirmDataRepayment record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(ExclusiveConfirmDataRepayment record);

    int updateBatch(List<ExclusiveConfirmDataRepayment> list);

    int batchInsert(@Param("list") List<ExclusiveConfirmDataRepayment> list);
}