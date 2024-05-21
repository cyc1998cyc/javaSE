package com.chen.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
    * 专享办理申请表
    */
@Data
public class ExclusiveConfirmData implements Serializable {
    private Long exclusiveConfirmDataId;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 白名单
    */
    private Integer whiteId;

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
    * 操作类型
    */
    private String oprtTp;

    /**
    * 申请时间
    */
    private Date applyTime;

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
    * 优惠类型01 02 03 04 08
    */
    private String instlType;

    /**
    * 渠道编号
    */
    private String txnSrc;

    private String seqNo1;

    private String seqNo2;

    private String seqNo4;

    private String seqNo3;

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
    * 额度
    */
    private String quota;

    /**
    * 详情
    */
    private String detail;

    /**
    * 0 审核中 1 成功 2 失败 3撤销
    */
    private Integer status;

    /**
    * 抵扣金额
    */
    private String ddctnAmt;

    /**
    * 发卡日期
    */
    private Date bankCardDate;

    /**
    * 分期产品手续费
    */
    private String agngPdPcdrFee;

    /**
    * 手续费费率
    */
    private String pcdrFeeFeeRt;

    /**
    * 每期手续费
    */
    private String eachPrdFee;

    private static final long serialVersionUID = 1L;
}