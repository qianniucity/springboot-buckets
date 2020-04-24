package com.javaniuniu.generator2.model;

public class Problem {
    private Long problemid;

    private String cnurl;

    private String date;

    private String enurl;

    private String indexnum;

    private String name;

    private String questiontitleslug;

    public Long getProblemid() {
        return problemid;
    }

    public void setProblemid(Long problemid) {
        this.problemid = problemid;
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

    public String getIndexnum() {
        return indexnum;
    }

    public void setIndexnum(String indexnum) {
        this.indexnum = indexnum == null ? null : indexnum.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getQuestiontitleslug() {
        return questiontitleslug;
    }

    public void setQuestiontitleslug(String questiontitleslug) {
        this.questiontitleslug = questiontitleslug == null ? null : questiontitleslug.trim();
    }
}