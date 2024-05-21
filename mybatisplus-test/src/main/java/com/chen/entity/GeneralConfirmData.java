package com.chen.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
    * 总账办理申请表
    */
@Data
public class GeneralConfirmData implements Serializable {
    /**
    * id
    */
    private Long generalConfirmDataId;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 证件号
    */
    private String idNo;

    /**
    * 证件类型
    */
    private String idTp;

    /**
    * 卡号
    */
    private String crdNo;

    /**
    * 申请时间
    */
    private String applyTime;

    /**
    * 分期计划编号
    */
    private String crdtAplyNo;

    /**
    * 分期期数
    */
    private String stgsNum;

    /**
    * 分期金额
    */
    private String stgsAmt;

    /**
    * 币种
    */
    private String ccy;

    /**
    * 每月还款额
    */
    private String mthlylyPymntAmt;

    /**
    * 手续费
    */
    private String fee;

    /**
    * 分期申请证书编号
    */
    private String stgsAplctnFrmNo;

    /**
    * 强制手续费折扣系数
    */
    private String frcFeeRtDsctCfcnt;

    /**
    * 渠道编号
    */
    private String txnSrc;

    /**
    * 第三方流水号(dy cf )
    */
    private String dyRequestNo;

    /**
    * 0 审核中 1 成功 2 失败 3撤销
    */
    private Short status;

    private String seqNo1;

    private String seqNo2;

    private String seqNo3;

    private String seqNo4;

    /**
    * 优惠类型01 02 03 04 08
    */
    private String instlType;

    /**
    * 原手续费率
    */
    private String rateNum;

    /**
    * 年化利率
    */
    private String anlintrstrat;

    /**
    * 原手续费
    */
    private String oriFee;

    /**
    * 抵扣金额
    */
    private String ddctnAmt;

    /**
    * 发卡日期
    */
    private Date bankCardDate;

    /**
    * 每期手续费
    */
    private String eachPrdFee;

    /**
    * 分期产品手续费
    */
    private String agngPdPcdrFee;

    /**
    * 手续费费率
    */
    private String pcdrFeeFeeRt;

    /**
    * 剩余未还款额
    */
    private String rmanNotRpymntQt;

    /**
    * 申请分期⾦额的已出账单部分
    */
    private String alrdyBllPrt;

    /**
    * 申请分期⾦额的未出账单部分
    */
    private String notBllPrt;

    private static final long serialVersionUID = 1L;
}