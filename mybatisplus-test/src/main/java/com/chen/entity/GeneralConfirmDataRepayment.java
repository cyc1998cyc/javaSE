package com.chen.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
@TableName(value = "general_confirm_data_repayment")
public class GeneralConfirmDataRepayment implements Serializable {
    /**
     * id
     */
    @TableId(value = "general_confirm_data_repayment_id", type = IdType.INPUT)
    private Long generalConfirmDataRepaymentId;

    /**
     * 银行号
     */
    @TableField(value = "bank")
    private String bank;

    /**
     * 账号 由卡系统产生，唯一标识一个账户
     */
    @TableField(value = "xaccount")
    private String xaccount;

    /**
     * 卡号
     */
    @TableField(value = "card_nbr")
    private String cardNbr;

    /**
     * 主附卡标志 1:主卡
     */
    @TableField(value = "cardholder")
    private String cardholder;

    /**
     * 记录日期 分期付款申请日期
     */
    @TableField(value = "inp_day")
    private String inpDay;

    /**
     * 记录时间 分期付款申请时间
     */
    @TableField(value = "inp_time")
    private String inpTime;

    /**
     * 微索引编号
     */
    @TableField(value = "micro_ref")
    private String microRef;

    /**
     * 消费日期 分期付款开始的日期
     */
    @TableField(value = "purch_day")
    private String purchDay;

    /**
     * 分期付款商品号 分期付款商品编号（PRPRD画面定义）
     */
    @TableField(value = "prod_id")
    private String prodId;

    /**
     * 分期付款利率 分期付款利率（PRPRD画面定义）
     */
    @TableField(value = "int_rate")
    private BigDecimal intRate;

    /**
     * 罚息金额 提前还款罚息金额。提前还款罚息金额=提前还款罚息收取百分率*剩余未缴利息总额
     */
    @TableField(value = "accel_int")
    private BigDecimal accelInt;

    /**
     * 首笔利息金额
     */
    @TableField(value = "first_int")
    private BigDecimal firstInt;

    /**
     * 每月摊消分期付款金额 分期付款每月摊销的包含本金、利息、费用的金额

     */
    @TableField(value = "mth_instl")
    private BigDecimal mthInstl;

    /**
     * 已分期摊消期数 已经摊销的期数合计
     */
    @TableField(value = "instl_cnt")
    private String instlCnt;

    /**
     * 上次分期摊消日期
     */
    @TableField(value = "lst_instdy")
    private String lstInstdy;

    /**
     * 上月分期摊消利息金额 上月分期摊销（含提前还款）的利息
     */
    @TableField(value = "mth_int")
    private BigDecimal mthInt;

    /**
     * 上月分期摊消本金金额  上月分期摊销本金
     */
    @TableField(value = "mth_ppl")
    private BigDecimal mthPpl;

    /**
     * 总分期月数
     */
    @TableField(value = "nbr_mths")
    private String nbrMths;

    /**
     * 总产品金额（本金总金额） 即本金金额
     */
    @TableField(value = "orig_purch")
    private BigDecimal origPurch;

    /**
     * 剩余未还本金 分期待摊本金（提前还款后清零）
     */
    @TableField(value = "rem_ppl")
    private BigDecimal remPpl;

    /**
     * 总利息金额
     */
    @TableField(value = "orig_int")
    private BigDecimal origInt;

    /**
     * 累计已摊消利息
     */
    @TableField(value = "tot_int_cg")
    private BigDecimal totIntCg;

    /**
     * 剩余未还利息
     */
    @TableField(value = "rem_int")
    private BigDecimal remInt;

    /**
     * 总费用 分期产生的总费用
     */
    @TableField(value = "orig_fee")
    private BigDecimal origFee;

    /**
     * 剩余未还费用 剩余待摊费用
     */
    @TableField(value = "rem_fee")
    private BigDecimal remFee;

    /**
     * 交易来源 MPMNT画面的申请来源CODES/MPSRC
     */
    @TableField(value = "trans_src")
    private String transSrc;

    /**
     * 分期付款状态
     */
    @TableField(value = "`status`")
    private String status;

    /**
     * 分期付款状态改变日期
     */
    @TableField(value = "status_day")
    private String statusDay;

    /**
     * 状态变动操作员
     */
    @TableField(value = "employee")
    private String employee;

    /**
     * 分期计划编号
     */
    @TableField(value = "credp_id")
    private String credpId;

    /**
     * 分期付款类型 "A:灵活分期
B:余额转移
C:信用计划
H:银联POS分期
L:大额分期
M:邮购分期
P:自行POS分期
S:深圳银联POS分期
Y:余额/帐单分期
D:自动分期"
     */
    @TableField(value = "mp_type")
    private String mpType;

    /**
     * 暂停期数 分期付款暂停的期数
     */
    @TableField(value = "pause_nbrs")
    private String pauseNbrs;

    /**
     * 延期月份
     */
    @TableField(value = "delay_mth")
    private String delayMth;

    /**
     * 币种
     */
    @TableField(value = "curr_num")
    private String currNum;

    /**
     * 已摊销暂不入账本金
     */
    @TableField(value = "res_ppl")
    private BigDecimal resPpl;

    /**
     * 分摊间隔期数
     */
    @TableField(value = "inter_mths")
    private String interMths;

    /**
     * 到期日期
     */
    @TableField(value = "paycf_day")
    private String paycfDay;

    /**
     * 上次延期天数
     */
    @TableField(value = "pri_dldy")
    private String priDldy;

    /**
     * 延期天数
     */
    @TableField(value = "dly_days")
    private String dlyDays;

    /**
     * 记录变更日期
     */
    @TableField(value = "etl_day")
    private String etlDay;

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
     * 打标日期
     */
    @TableField(value = "mark_day")
    private String markDay;

    /**
     * 剩余费用
     */
    @TableField(value = "rem_feey")
    private BigDecimal remFeey;

    /**
     * 分期强制手续费费率
     */
    @TableField(value = "fee_pcnt")
    private BigDecimal feePcnt;

    /**
     * 单独收取期数
     */
    @TableField(value = "fee_mths")
    private String feeMths;

    /**
     * 分期流水号
     */
    @TableField(value = "chanelno")
    private String chanelno;

    /**
     * 分期年化利率
     */
    @TableField(value = "mp_irr_yr")
    private BigDecimal mpIrrYr;

    /**
     * 提前还款本金
     */
    @TableField(value = "rem_pply")
    private BigDecimal remPply;

    /**
     * 提前还款已摊销未入账本金
     */
    @TableField(value = "res_pply")
    private BigDecimal resPply;

    /**
     * 首次分摊日期
     */
    @TableField(value = "fst_instdy")
    private String fstInstdy;

    /**
     * 分期付款每月手续费
     */
    @TableField(value = "mth_fee")
    private BigDecimal mthFee;

    /**
     * 分期强制手续费费率
     */
    @TableField(value = "fee_pcnt_new")
    private BigDecimal feePcntNew;

    /**
     * 剩余利息
     */
    @TableField(value = "rem_inty")
    private BigDecimal remInty;

    /**
     * 累计已分摊息费
     */
    @TableField(value = "inst_intfe")
    private BigDecimal instIntfe;

    /**
     * 文件导入日期
     */
    @TableField(value = "txt_date")
    private Date txtDate;

    private static final long serialVersionUID = 1L;
}