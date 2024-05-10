package com.chen.mapper;

import com.chen.entity.EasyConfirmDataRepayment;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EasyConfirmDataRepaymentMapper {
    /**
     * delete by primary key
     * @param easyConfirmDataRepaymentId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long easyConfirmDataRepaymentId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(EasyConfirmDataRepayment record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(EasyConfirmDataRepayment record);

    /**
     * select by primary key
     * @param easyConfirmDataRepaymentId primary key
     * @return object by primary key
     */
    EasyConfirmDataRepayment selectByPrimaryKey(Long easyConfirmDataRepaymentId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(EasyConfirmDataRepayment record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(EasyConfirmDataRepayment record);

    int updateBatch(List<EasyConfirmDataRepayment> list);

    int batchInsert(@Param("list") List<EasyConfirmDataRepayment> list);
}