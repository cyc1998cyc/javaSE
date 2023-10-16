package com.chen.controller.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private String id;

    private String name;

    private Double score;

    private Date birthday;
}
