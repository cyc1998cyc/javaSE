package com.chen.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FqInstallmentApplicationsMapper {
    /**
     * delete by primary key
     * @param fqInstallmentApplicationsId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long fqInstallmentApplicationsId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(FqInstallmentApplications record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(FqInstallmentApplications record);

    /**
     * select by primary key
     * @param fqInstallmentApplicationsId primary key
     * @return object by primary key
     */
    FqInstallmentApplications selectByPrimaryKey(Long fqInstallmentApplicationsId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(FqInstallmentApplications record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(FqInstallmentApplications record);

    int updateBatch(List<FqInstallmentApplications> list);

    int batchInsert(@Param("list") List<FqInstallmentApplications> list);
}