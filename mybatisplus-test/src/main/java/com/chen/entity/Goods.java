package com.chen.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
    * goods
    */
@Data
@TableName(value = "goods")
public class Goods implements Serializable {
    /**
     * 商品id
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 商品名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 商品价格
     */
    @TableField(value = "price")
    private BigDecimal price;

    /**
     * 商品数量
     */
    @TableField(value = "num")
    private Integer num;

    private static final long serialVersionUID = 1L;
}