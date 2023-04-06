package com.example.code.cnm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author lz
 * @since 2023-04-06
 */
public class Demand implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer userId;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private LocalDate publish;

    private String name;

    private Integer typeId;

    private Integer nums;

    private String address;

    private LocalDate start;

    private LocalDate end;

    private String payMethod;

    private Boolean state;

    private String invoice;

    private Boolean driver;

    private String desc;

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

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public LocalDate getPublish() {
        return publish;
    }

    public void setPublish(LocalDate publish) {
        this.publish = publish;
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

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public Boolean getDriver() {
        return driver;
    }

    public void setDriver(Boolean driver) {
        this.driver = driver;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Demand{" +
        "id = " + id +
        ", userId = " + userId +
        ", createTime = " + createTime +
        ", updateTime = " + updateTime +
        ", publish = " + publish +
        ", name = " + name +
        ", typeId = " + typeId +
        ", nums = " + nums +
        ", address = " + address +
        ", start = " + start +
        ", end = " + end +
        ", payMethod = " + payMethod +
        ", state = " + state +
        ", invoice = " + invoice +
        ", driver = " + driver +
        ", desc = " + desc +
        "}";
    }
}
