package com.javaniuniu.generator2.model;

import java.util.Date;

public class Upvote {
    private Long upvoteid;

    private String date;

    private String frommemberid;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer status;

    private String tomemberid;

    public Long getUpvoteid() {
        return upvoteid;
    }

    public void setUpvoteid(Long upvoteid) {
        this.upvoteid = upvoteid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getFrommemberid() {
        return frommemberid;
    }

    public void setFrommemberid(String frommemberid) {
        this.frommemberid = frommemberid == null ? null : frommemberid.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTomemberid() {
        return tomemberid;
    }

    public void setTomemberid(String tomemberid) {
        this.tomemberid = tomemberid == null ? null : tomemberid.trim();
    }
}