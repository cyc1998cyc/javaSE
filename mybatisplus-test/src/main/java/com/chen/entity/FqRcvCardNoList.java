package com.chen.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
    * 客户借记卡列表
    */
@Data
public class FqRcvCardNoList implements Serializable {
    /**
    * 主键ID
    */
    private Integer id;

    /**
    * 借记卡
    */
    private String rcvCardNo;

    /**
    * 身份证
    */
    private String idNo;

    /**
    * 银行名
    */
    private String bankName;

    /**
    * 银行代码
    */
    private String bankCode;

    /**
    * 生成时间
    */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}