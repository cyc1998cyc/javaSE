package com.chen.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
    * t_area
    */
@Data
@TableName(value = "t_area")
public class TArea implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ExcelProperty(index = 1,value = "城市id")
    private String id;

    /**
     * areaName
     */
    @TableField(value = "area_name")
    @ExcelProperty(index = 2,value = "城市名称")
    private String areaName;

    /**
     * parentId
     */
    @TableField(value = "parent_id")
    @ExcelProperty(index = 3,value = "父亲id")
    private String parentId;

    /**
     * parentName
     */
    @TableField(value = "parent_name")
    @ExcelProperty(index = 4,value = "父亲名称")
    private String parentName;

    /**
     * level
     */
    @ExcelIgnore
    @TableField(value = "`level`")
    private String level;

    private static final long serialVersionUID = 1L;
}