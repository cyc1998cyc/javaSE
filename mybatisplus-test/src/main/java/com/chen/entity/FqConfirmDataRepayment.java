package com.chen.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class FqConfirmDataRepayment implements Serializable {
    /**
    * id
    */
    private String fqConfirmDataRepaymentId;

    /**
    * 银行号
    */
    private String bank;

    /**
    * 账号 由卡系统产生，唯一标识一个账户
    */
    private String account;

    /**
    * 卡号
    */
    private String cardNbr;

    /**
    * BIN号
    */
    private String cardBin;

    /**
    * 主附卡标志 1:主卡
    */
    private String cardholder;

    /**
    * 分期付款序号 同一帐户从1开始排序
    */
    private String mpNumber;

    /**
    * 记录日期 分期付款申请日期
    */
    private String inpDay;

    /**
    * 记录时间 分期付款申请时间
    */
    private String inpTime;

    /**
    * 授权号 卡系统产生的授权号码
    */
    private String authCode;

    /**
    * 商户号 虚拟商户编号
    */
    private String merchant;

    /**
    * 微索引编号
    */
    private String microRef;

    /**
    * 卡片产品号
    */
    private String product;

    /**
    * 消费日期 分期付款开始的日期
    */
    private String purchDay;

    /**
    * 激活原因描述 分期付款暂停后再激活的原因
    */
    private String reactResn;

    /**
    * 分期付款商品号 分期付款商品编号（PRPRD画面定义）
    */
    private String prodId;

    /**
    * 分期付款利率 分期付款利率（PRPRD画面定义）
    */
    private String intRate;

    /**
    * 罚息金额 提前还款罚息金额。提前还款罚息金额=提前还款罚息收取百分率*剩余未缴利息总额
    */
    private String accelInt;

    /**
    * 提前还款原因  CODES/MPACC
    */
    private String accelResn;

    /**
    * 卡号校验位
    */
    private String checkDig;

    /**
    * 卡片发卡序号
    */
    private String issueNbr;

    /**
    * 首笔利息金额
    */
    private String firstInt;

    /**
    * 每月摊消分期付款金额 分期付款每月摊销的包含本金、利息、费用的金额

    */
    private String mthInstl;

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
    private String mthInt;

    /**
    * 上月分期摊消本金金额  上月分期摊销本金
    */
    private String mthPpl;

    /**
    * 总分期月数
    */
    private String nbrMths;

    /**
    * 总产品金额（本金总金额） 即本金金额
    */
    private String origPurch;

    /**
    * 剩余未还本金 分期待摊本金（提前还款后清零）
    */
    private String remPpl;

    /**
    * 总利息金额
    */
    private String origInt;

    /**
    * 累计已摊消利息
    */
    private String totIntCg;

    /**
    * 剩余未还利息
    */
    private String remInt;

    /**
    * 总费用 分期产生的总费用
    */
    private String origFee;

    /**
    * 剩余未还费用 剩余待摊费用
    */
    private String remFee;

    /**
    * 交易来源 MPMNT画面的申请来源CODES/MPSRC
    */
    private String transSrc;

    /**
    * 前一状态  分期付款的前一个状态
    */
    private String statusPre;

    /**
    * 分期付款状态
    */
    private String status;

    /**
    * 分期付款状态改变日期
    */
    private String statusDay;

    /**
    * 收取商户手续费金额
    */
    private String commAmt;

    /**
    * 状态变动操作员
    */
    private String employee;

    /**
    * 收取持卡人手续费标志 0:一次性收取 1:分期收取 2:单独收取
    */
    private String feeFlag;

    /**
    * 帐单地址类型
    */
    private String addrType;

    /**
    * 分期计划编号
    */
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
    * 地址1 商品分期的送货地址
    */
    private String addr1;

    /**
    * 地址2 原始交易日期为MPUR.ADDR2的1~5位，MPINQ显示时转换成CCYYMMDD的形式 原始交易类型为MPUR.ADDR2的19~22位 原始交易流水为MPUR.ADDR2的23~28位
    */
    private String addr2;

    /**
    * 地址3 商品分期的送货地址
    */
    private String addr3;

    /**
    * 地址4 商品分期的送货地址
    */
    private String addr4;

    /**
    * 已摊销暂不入账本金
    */
    private String resPpl;

    /**
    * 分摊间隔期数
    */
    private String interMths;

    /**
    * 到期日期
    */
    private String paycfDay;

    /**
    * 备注
    */
    private String remark;

    /**
    * 录入来源 D:电话 F:传真 G:代理商 M:邮寄 T:POS机具这个是系统保留值 W:网银 O:其他这个是系统保留值
    */
    private String inpSrc;

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
    private String deduFee;

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
    private String remFeey;

    /**
    * 子额度编号
    */
    private String sublmtNbr;

    /**
    * 分期强制手续费费率
    */
    private String feePcnt;

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
    private String mpIrrYr;

    /**
    * 分期提前还款原因
    */
    private String remark2;

    /**
    * 提前还款本金
    */
    private String remPply;

    /**
    * 提前还款已摊销未入账本金
    */
    private String resPply;

    /**
    * 延期标志
    */
    private String dlyFlag;

    /**
    * 首次分摊日期
    */
    private String fstInstdy;

    /**
    * 分期付款每月手续费
    */
    private String mthFee;

    /**
    * 资金用途
    */
    private String clpps;

    /**
    * 原始交易商户代码
    */
    private String relMerch;

    /**
    * 分期强制手续费费率
    */
    private String feePcntNew;

    /**
    * 现金分期他行卡持卡人姓名
    */
    private String calName;

    /**
    * 剩余利息
    */
    private String remInty;

    /**
    * 合约号
    */
    private String contractno;

    /**
    * 商户贴息
    */
    private String merchFee;

    /**
    * 累计已分摊息费
    */
    private String instIntfe;

    /**
    * 文件导入日期
    */
    private Date txtDate;

    private static final long serialVersionUID = 1L;
}