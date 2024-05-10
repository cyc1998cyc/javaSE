package com.chen.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * 分期付款申请
    */
@Data
@TableName(value = "fq_installment_applications")
public class FqInstallmentApplications implements Serializable {
    /**
     * id
     */
    @TableId(value = "fq_installment_applications_id", type = IdType.INPUT)
    private Long fqInstallmentApplicationsId;

    /**
     * 卡号
     */
    @TableField(value = "card_nbr")
    private String cardNbr;

    /**
     * 证件号码
     */
    @TableField(value = "custr_nbr")
    private String custrNbr;

    @TableField(value = "account")
    private String account;

    /**
     * 信用卡类别 1:主卡；2:附卡
     */
    @TableField(value = "cardholder")
    private String cardholder;

    /**
     * 微索引编号
     */
    @TableField(value = "micro_no")
    private String microNo;

    /**
     * 商品编号
     */
    @TableField(value = "prod_id")
    private String prodId;

    /**
     * 分期付款金额
     */
    @TableField(value = "mp_amt")
    private BigDecimal mpAmt;

    /**
     * 每月分摊金额
     */
    @TableField(value = "mp_instl")
    private BigDecimal mpInstl;

    /**
     * 分期期数
     */
    @TableField(value = "nbr_mths")
    private String nbrMths;

    /**
     * 申请状态
     */
    @TableField(value = "mpau_sts")
    private String mpauSts;

    /**
     * 状态变动日期
     */
    @TableField(value = "status_day")
    private String statusDay;

    /**
     * 拒绝原因代码
     */
    @TableField(value = "deccan_rea")
    private String deccanRea;

    /**
     * 授权日期
     */
    @TableField(value = "auth_day")
    private String authDay;

    /**
     * 授权操作员
     */
    @TableField(value = "auth_emp")
    private String authEmp;

    /**
     * 授权时间
     */
    @TableField(value = "auth_time")
    private String authTime;

    /**
     * 请款的日期
     */
    @TableField(value = "match_day")
    private String matchDay;

    /**
     * 录入日期
     */
    @TableField(value = "preauth_dy")
    private String preauthDy;

    /**
     * 录入时间
     */
    @TableField(value = "preauth_tm")
    private String preauthTm;

    /**
     * 录入操作员
     */
    @TableField(value = "inp_empno")
    private String inpEmpno;

    /**
     * 币种
     */
    @TableField(value = "curr_num")
    private String currNum;

    /**
     * 分期手续费红包金额
     */
    @TableField(value = "dedu_fee")
    private BigDecimal deduFee;

    /**
     * 申请件编号日期位
     */
    @TableField(value = "app_sday_new")
    private String appSdayNew;

    /**
     * 分期流水号
     */
    @TableField(value = "chanelno")
    private String chanelno;

    /**
     * 分期强制手续费率
     */
    @TableField(value = "fee_pcnt")
    private BigDecimal feePcnt;

    /**
     * 手续费率强制折扣系数
     */
    @TableField(value = "feepcnt_pn")
    private BigDecimal feepcntPn;

    /**
     * 未出账单转账单分期金额
     */
    @TableField(value = "bal_mp_amt")
    private BigDecimal balMpAmt;

    /**
     * 未出账单转账单分期金额符号位
     */
    @TableField(value = "bal_mp_amt_flg")
    private String balMpAmtFlg;

    /**
     * 文件导入日期
     */
    @TableField(value = "txt_date")
    private Date txtDate;

    private static final long serialVersionUID = 1L;
}