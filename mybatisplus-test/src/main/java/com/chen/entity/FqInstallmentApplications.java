package com.chen.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * 分期付款申请
    */
@Data
public class FqInstallmentApplications implements Serializable {
    /**
    * id
    */
    private Long fqInstallmentApplicationsId;

    /**
    * 卡号
    */
    private String cardNbr;

    /**
    * 证件号码
    */
    private String custrNbr;

    private String account;

    /**
    * 信用卡类别 1:主卡；2:附卡
    */
    private String cardholder;

    /**
    * 微索引编号
    */
    private String microNo;

    /**
    * 商品编号
    */
    private String prodId;

    /**
    * 分期付款金额
    */
    private BigDecimal mpAmt;

    /**
    * 每月分摊金额
    */
    private BigDecimal mpInstl;

    /**
    * 分期期数
    */
    private String nbrMths;

    /**
    * 申请状态
    */
    private String mpauSts;

    /**
    * 状态变动日期
    */
    private String statusDay;

    /**
    * 拒绝原因代码
    */
    private String deccanRea;

    /**
    * 授权日期
    */
    private String authDay;

    /**
    * 授权操作员
    */
    private String authEmp;

    /**
    * 授权时间
    */
    private String authTime;

    /**
    * 请款的日期
    */
    private String matchDay;

    /**
    * 录入日期
    */
    private String preauthDy;

    /**
    * 录入时间
    */
    private String preauthTm;

    /**
    * 录入操作员
    */
    private String inpEmpno;

    /**
    * 币种
    */
    private String currNum;

    /**
    * 分期手续费红包金额
    */
    private BigDecimal deduFee;

    /**
    * 申请件编号日期位
    */
    private String appSdayNew;

    /**
    * 分期流水号
    */
    private String chanelno;

    /**
    * 分期强制手续费率
    */
    private BigDecimal feePcnt;

    /**
    * 手续费率强制折扣系数
    */
    private BigDecimal feepcntPn;

    /**
    * 未出账单转账单分期金额
    */
    private BigDecimal balMpAmt;

    /**
    * 未出账单转账单分期金额符号位
    */
    private String balMpAmtFlg;

    /**
    * 文件导入日期
    */
    private Date txtDate;

    private static final long serialVersionUID = 1L;
}