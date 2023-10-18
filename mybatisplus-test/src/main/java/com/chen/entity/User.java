package com.chen.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * user
 */
@Data
@TableName(value = "`user`")
public class User implements Serializable {
    /**
     * userId
     */
    @TableId(value = "user_id", type = IdType.INPUT)
    private Integer userId;

    /**
     * userName
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * birth
     */
    @TableField(value = "birth")
    @JsonFormat(pattern = "yyyy年MM月dd日 HH:mm:ss", timezone = "Asia/Shanghai")
    private LocalDateTime birth;

    /**
     * salary
     */
    @TableField(value = "salary")
    private BigDecimal salary;

    private static final long serialVersionUID = 1L;
}