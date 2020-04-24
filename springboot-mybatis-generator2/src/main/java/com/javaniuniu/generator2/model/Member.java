package com.javaniuniu.generator2.model;

public class Member {
    private Long memberid;

    private Double acceptancerate;

    private Integer acceptedsubmission;

    private String address;

    private String avatar;

    private String cnurl;

    private String date;

    private String enurl;

    private String gmtCreate;

    private String gmtModified;

    private String platform;

    private Integer solvedquestion;

    private Integer status;

    private Integer submissioncount;

    private Integer totalchecked;

    private String username;

    private String website;

    public Long getMemberid() {
        return memberid;
    }

    public void setMemberid(Long memberid) {
        this.memberid = memberid;
    }

    public Double getAcceptancerate() {
        return acceptancerate;
    }

    public void setAcceptancerate(Double acceptancerate) {
        this.acceptancerate = acceptancerate;
    }

    public Integer getAcceptedsubmission() {
        return acceptedsubmission;
    }

    public void setAcceptedsubmission(Integer acceptedsubmission) {
        this.acceptedsubmission = acceptedsubmission;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getCnurl() {
        return cnurl;
    }

    public void setCnurl(String cnurl) {
        this.cnurl = cnurl == null ? null : cnurl.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getEnurl() {
        return enurl;
    }

    public void setEnurl(String enurl) {
        this.enurl = enurl == null ? null : enurl.trim();
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate == null ? null : gmtCreate.trim();
    }

    public String getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified == null ? null : gmtModified.trim();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public Integer getSolvedquestion() {
        return solvedquestion;
    }

    public void setSolvedquestion(Integer solvedquestion) {
        this.solvedquestion = solvedquestion;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSubmissioncount() {
        return submissioncount;
    }

    public void setSubmissioncount(Integer submissioncount) {
        this.submissioncount = submissioncount;
    }

    public Integer getTotalchecked() {
        return totalchecked;
    }

    public void setTotalchecked(Integer totalchecked) {
        this.totalchecked = totalchecked;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }
}