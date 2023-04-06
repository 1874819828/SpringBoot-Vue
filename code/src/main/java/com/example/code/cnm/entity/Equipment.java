package com.example.code.cnm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author lz
 * @since 2023-04-06
 */
public class Equipment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer userId;

    private LocalDateTime creatTime;

    private LocalDateTime updateTime;

    private String name;

    private Integer typeId;

    private Integer num;

    private Integer rent;

    /**
     * 地址
     */
    private String address;

    /**
     * 机龄
     */
    private Integer years;

    /**
     * 有效工作时间
     */
    private Integer hours;

    private String imgurl;

    private String desc;

    private Boolean leaseStatus;

    private Integer viewNums;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public LocalDateTime getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(LocalDateTime creatTime) {
        this.creatTime = creatTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getRent() {
        return rent;
    }

    public void setRent(Integer rent) {
        this.rent = rent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Boolean getLeaseStatus() {
        return leaseStatus;
    }

    public void setLeaseStatus(Boolean leaseStatus) {
        this.leaseStatus = leaseStatus;
    }

    public Integer getViewNums() {
        return viewNums;
    }

    public void setViewNums(Integer viewNums) {
        this.viewNums = viewNums;
    }

    @Override
    public String toString() {
        return "Equipment{" +
        "id = " + id +
        ", userId = " + userId +
        ", creatTime = " + creatTime +
        ", updateTime = " + updateTime +
        ", name = " + name +
        ", typeId = " + typeId +
        ", num = " + num +
        ", rent = " + rent +
        ", address = " + address +
        ", years = " + years +
        ", hours = " + hours +
        ", imgurl = " + imgurl +
        ", desc = " + desc +
        ", leaseStatus = " + leaseStatus +
        ", viewNums = " + viewNums +
        "}";
    }
}
