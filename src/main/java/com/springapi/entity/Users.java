package com.springapi.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Users)实体类
 *
 * @author makejava
 * @since 2024-11-26 13:46:40
 */
public class Users implements Serializable {
    private static final long serialVersionUID = -23019295549432026L;
/**
     * id
     */
    private Integer id;
/**
     * 姓名
     */
    private String name;
/**
     * 电话
     */
    private Integer phone;
/**
     * 地址
     */
    private String address;
/**
     * 国家
     */
    private String country;
/**
     * 省份
     */
    private String province;
/**
     * 城市
     */
    private String city1;
/**
     * 县区
     */
    private String city2;
/**
     * vip等级
     */
    private String vip;
/**
     * 积分
     */
    private Integer points;
/**
     * vip到期时间
     */
    private Date vipenddate;
/**
     * 生日
     */
    private Date birthday;
/**
     * 权限
     */
    private String permission;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity1() {
        return city1;
    }

    public void setCity1(String city1) {
        this.city1 = city1;
    }

    public String getCity2() {
        return city2;
    }

    public void setCity2(String city2) {
        this.city2 = city2;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Date getVipenddate() {
        return vipenddate;
    }

    public void setVipenddate(Date vipenddate) {
        this.vipenddate = vipenddate;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

}

