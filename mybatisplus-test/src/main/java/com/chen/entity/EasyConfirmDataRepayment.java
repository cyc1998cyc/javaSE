package com.chen.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class EasyConfirmDataRepayment implements Serializable {
    /**
     * id
     */
    private Long easyConfirmDataRepaymentId;

    /**
     * 银行号
     */
    private String bank;

    /**
     * 账号 由卡系统产生，唯一标识一个账户
     */
    private String xaccount;

    /**
     * 卡号
     */
    private String cardNbr;

    /**
     * 主附卡标志 1:主卡
     */
    private String cardholder;

    /**
     * 记录日期 分期付款申请日期
     */
    private String inpDay;

    /**
     * 记录时间 分期付款申请时间
     */
    private String inpTime;

    /**
     * 微索引编号
     */
    private String microRef;

    /**
     * 消费日期 分期付款开始的日期
     */
    private String purchDay;

    /**
     * 分期付款商品号 分期付款商品编号（PRPRD画面定义）
     */
    private String prodId;

    /**
     * 分期付款利率 分期付款利率（PRPRD画面定义）
     */
    private BigDecimal intRate;

    /**
     * 罚息金额 提前还款罚息金额。提前还款罚息金额=提前还款罚息收取百分率*剩余未缴利息总额
     */
    private BigDecimal accelInt;

    /**
     * 首笔利息金额
     */
    private BigDecimal firstInt;

    /**
     * 每月摊消分期付款金额 分期付款每月摊销的包含本金、利息、费用的金额
     */
    private BigDecimal mthInstl;

    /**
     * 已分期摊消期数 已经摊销的期数合计
     */
    private String instlCnt;

    /**
     * 上次分期摊消日期
     */
    private String lstInstdy;

    /**
     * 上月分期摊消利息金额 上月分期摊销（含提前还款）的利息
     */
    private BigDecimal mthInt;

    /**
     * 上月分期摊消本金金额  上月分期摊销本金
     */
    private BigDecimal mthPpl;

    /**
     * 总分期月数
     */
    private String nbrMths;

    /**
     * 总产品金额（本金总金额） 即本金金额
     */
    private BigDecimal origPurch;

    /**
     * 剩余未还本金 分期待摊本金（提前还款后清零）
     */
    private BigDecimal remPpl;

    /**
     * 总利息金额
     */
    private BigDecimal origInt;

    /**
     * 累计已摊消利息
     */
    private BigDecimal totIntCg;

    /**
     * 剩余未还利息
     */
    private BigDecimal remInt;

    /**
     * 总费用 分期产生的总费用
     */
    private BigDecimal origFee;

    /**
     * 剩余未还费用 剩余待摊费用
     */
    private BigDecimal remFee;

    /**
     * 交易来源 MPMNT画面的申请来源CODES/MPSRC
     */
    private String transSrc;

    /**
     * 分期付款状态
     */
    private String status;

    /**
     * 分期付款状态改变日期
     */
    private String statusDay;

    /**
     * 状态变动操作员
     */
    private String employee;

    /**
     * 分期计划编号
     */
    private String credpId;

    /**
     * 分期付款类型 "A:灵活分期
     * B:余额转移
     * C:信用计划
     * H:银联POS分期
     * L:大额分期
     * M:邮购分期
     * P:自行POS分期
     * S:深圳银联POS分期
     * Y:余额/帐单分期
     * D:自动分期"
     */
    private String mpType;

    /**
     * 暂停期数 分期付款暂停的期数
     */
    private String pauseNbrs;

    /**
     * 延期月份
     */
    private String delayMth;

    /**
     * 币种
     */
    private String currNum;

    /**
     * 已摊销暂不入账本金
     */
    private BigDecimal resPpl;

    /**
     * 分摊间隔期数
     */
    private String interMths;

    /**
     * 到期日期
     */
    private String paycfDay;

    /**
     * 上次延期天数
     */
    private String priDldy;

    /**
     * 延期天数
     */
    private String dlyDays;

    /**
     * 记录变更日期
     */
    private String etlDay;

    /**
     * 分期手续费红包金额
     */
    private BigDecimal deduFee;

    /**
     * 申请件编号日期位
     */
    private String appSdayNew;

    /**
     * 打标日期
     */
    private String markDay;

    /**
     * 剩余费用
     */
    private BigDecimal remFeey;

    /**
     * 分期强制手续费费率
     */
    private BigDecimal feePcnt;

    /**
     * 单独收取期数
     */
    private String feeMths;

    /**
     * 分期流水号
     */
    private String chanelno;

    /**
     * 分期年化利率
     */
    private BigDecimal mpIrrYr;

    /**
     * 提前还款本金
     */
    private BigDecimal remPply;

    /**
     * 提前还款已摊销未入账本金
     */
    private BigDecimal resPply;

    /**
     * 首次分摊日期
     */
    private String fstInstdy;

    /**
     * 分期付款每月手续费
     */
    private BigDecimal mthFee;

    /**
     * 分期强制手续费费率
     */
    private BigDecimal feePcntNew;

    /**
     * 剩余利息
     */
    private BigDecimal remInty;

    /**
     * 累计已分摊息费
     */
    private BigDecimal instIntfe;

    /**
     * 文件导入日期
     */
    private Date txtDate;

    private static final long serialVersionUID = 1L;
}