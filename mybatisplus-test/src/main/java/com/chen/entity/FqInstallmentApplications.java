package com.chen.entity;

import java.io.Serializable;
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
    private String fqInstallmentApplicationsId;

    /**
    * 银行号
    */
    private String bank;

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
    * BIN号 卡号前6位
    */
    private String cardBin;

    /**
    * 申请来源  D:电话 F:传真 G:代理商 M:邮寄 T:POS机具这个是系统保留值 W:网银 X:短信 Z:联机消费转按日贷 O:其他这个是系统保留值
    */
    private String inpSrc;

    /**
    * 持卡人姓名
    */
    private String name;

    /**
    * 家庭电话区号
    */
    private String hmtelArea;

    /**
    * 家庭电话
    */
    private String homePhone;

    /**
    * 手机
    */
    private String moPhone;

    /**
    * 信用卡类别 1:主卡；2:附卡
    */
    private String cardholder;

    /**
    * 卡片有效期 YYMM
    */
    private String expiryDte;

    /**
    * 保留字段1 
    */
    private String reserve1;

    /**
    * 商户代码
    */
    private String merchant;

    /**
    * 微索引编号
    */
    private String microNo;

    /**
    * 商品编号
    */
    private String prodId;

    /**
    * 商品定购数量
    */
    private String prodNbr;

    /**
    * 分期付款金额
    */
    private String mpAmt;

    /**
    * 每月分摊金额
    */
    private String mpInstl;

    /**
    * 分期期数
    */
    private String nbrMths;

    /**
    * 代领人标志  1:代领人领取 0:非代领人领取 2:使用合作方帐号
    */
    private String agentFlag;

    /**
    * 代领人证件号码
    */
    private String agentIdno;

    /**
    * 代领人证件类型
    */
    private String agentIdtp;

    /**
    * 代领人姓名
    */
    private String agentName;

    /**
    * 代领人联系电话
    */
    private String agentPhon;

    /**
    * 送货地址类型 0:不送货 1:账单地址 2:其他地址 3:按日贷款、现金贷款日间划款，已出划款文件 4:现金类大额分期，占大额额度，待出划款文件 5:现金类大额分期，已出划款文件
    */
    private String addrFlag;

    /**
    * 送货地址类型
    */
    private String addrType;

    /**
    * 送货地址1 邮购分期:送货地址1 借贷通:申请日+到期日+最终费率+总费用 灵活分期:EVENT.DES_LINE1 按日贷款:推荐人编号 POS/大额分期:商品编号/名称账单分期:1~11位记录消费余额，12~22位记录取现余额
    */
    private String address1;

    /**
    * 送货地址2 邮购分期:送货地址2 现金分期/现金类大额分期:转入银行卡卡号+有效期（当为信用卡时） 按日贷款:转入银行卡卡号 信用计划&灵活分期:原始交易发生日期+入账日期+发生时间+交易类型+流水号 账单分期:第1位表示账单分期余额类型，1消费余额，2取现余额，3消费+取现，4账单余额，5消费+分期 自动分期:消费/取现标志位+消费金额+取现金额
    */
    private String address2;

    /**
    * 送货地址3 邮购分期:送货地址3 现金分期/按日贷款/现金类大额分期:转入银行卡行号 账单分期:1~11位记录分期余额，12~22位记录费用余额
    */
    private String address3;

    /**
    * 送货地址4 邮购分期:送货地址4 现金分期/按日贷款/现金类大额分期:转入银行卡名称
    */
    private String address4;

    /**
    * 送货地址5 邮购分期:送货地址5 现金分期/按日贷款:收款人地址
    */
    private String address5;

    /**
    * 邮编
    */
    private String postCode;

    private String intRate;

    /**
    * 是否需要发票 0:不需要发票；1:需要发票；2:第三方支付渠道标志（购易贷）3:非第三方支付渠道标志（购易贷）
    */
    private String invocFlag;

    /**
    * 发票抬头
    */
    private String invocHead;

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
    * 授权核准代码 授权核准代码 A_ 核准 D_决绝 C_取消
    */
    private String deccanCd;

    /**
    * 授权代码
    */
    private String authCode;

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
    * 授权响应码
    */
    private String authResp;

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
    * 检查备注 每位表示一个项目检查结果 姓名检查 家庭电话检查 手机检查 持卡人类别检查 有效期检查
    */
    private String checkDemo;

    /**
    * 原始申请数量
    */
    private String origNbr;

    /**
    * 授权消息
    */
    private String message;

    /**
    * 币种
    */
    private String currNum;

    /**
    * 备注
    */
    private String remark;

    /**
    * 分期手续费红包金额
    */
    private String deduFee;

    /**
    * 申请件编号日期位
    */
    private String appSdayNew;

    /**
    * 资金用途
    */
    private String clpps;

    /**
    * 商户补贴手续费费率
    */
    private String merchPcnt;

    /**
    * 商户补贴手续费
    */
    private String merchFee;

    /**
    * 子额度编号
    */
    private String sublmtNbr;

    /**
    * 分期流水号
    */
    private String chanelno;

    /**
    * IP地址
    */
    private String ipAddr;

    /**
    * MAC地址
    */
    private String macAddr;

    /**
    * 手机号
    */
    private String phoneNbr;

    /**
    * 设备信息
    */
    private String devceAddr;

    /**
    * 对公账号
    */
    private String busnsAcc;

    /**
    * 对公单位名称
    */
    private String busnsName;

    /**
    * 分期强制手续费率
    */
    private String feePcnt;

    /**
    * 手续费率强制折扣系数
    */
    private String feepcntPn;

    /**
    * 现金分期他行卡持卡人姓名
    */
    private String calName;

    /**
    * 合约号
    */
    private String contractno;

    /**
    * 未出账单转账单分期金额
    */
    private String balMpAmt;

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