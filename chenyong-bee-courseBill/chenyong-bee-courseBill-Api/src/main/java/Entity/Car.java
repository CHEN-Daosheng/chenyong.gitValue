package com.cbest.bee.member.api.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* Author wenfeng
* Date  2019-07-25
*/
@Data
public class Car implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String license;
    private int carTypeId;
    private String vin;
    private String etc;
    private String phone;
    private String creator;
    private Date createTime;
    private String gprsId;
    private String carBelongType;
    private Group group;
    private Customer customer;

}