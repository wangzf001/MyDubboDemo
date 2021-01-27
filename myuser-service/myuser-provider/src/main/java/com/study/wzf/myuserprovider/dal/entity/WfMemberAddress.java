package com.study.wzf.myuserprovider.dal.entity;

import java.util.Date;

public class WfMemberAddress {
    private Integer id;

    private Integer userid;

    private String recipient;

    private String contact;

    private String city;

    private String address;

    private String postcode;

    private Date updateTime;

    private Byte defaultflag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getDefaultflag() {
        return defaultflag;
    }

    public void setDefaultflag(Byte defaultflag) {
        this.defaultflag = defaultflag;
    }
}