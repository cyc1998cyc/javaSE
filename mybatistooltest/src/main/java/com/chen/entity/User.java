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
    private Date birth;

    /**
     * salary
     */
    @TableField(value = "salary")
    private BigDecimal salary;

    private static final long serialVersionUID = 1L;
}