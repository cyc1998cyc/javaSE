package com.chen.mapper;

import com.chen.entity.FqConfirmDataRepayment;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FqConfirmDataRepaymentMapper {
    /**
     * delete by primary key
     * @param fqConfirmDataRepaymentId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String fqConfirmDataRepaymentId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(FqConfirmDataRepayment record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(FqConfirmDataRepayment record);

    /**
     * select by primary key
     * @param fqConfirmDataRepaymentId primary key
     * @return object by primary key
     */
    FqConfirmDataRepayment selectByPrimaryKey(String fqConfirmDataRepaymentId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(FqConfirmDataRepayment record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(FqConfirmDataRepayment record);

    int updateBatch(List<FqConfirmDataRepayment> list);

    int batchInsert(@Param("list") List<FqConfirmDataRepayment> list);
}