package com.javaniuniu.generator2.model;

public class Checkdayinfo {
    private Long infoid;

    private Integer checkdaysinthelastyear;

    private Integer checked;

    private String checkedtime;

    private String date;

    private Integer solvedproblemnumberoftoday;

    private Integer submissionoftoday;

    private String updatetime;

    private Integer upvotenumber;

    private String username;

    public Long getInfoid() {
        return infoid;
    }

    public void setInfoid(Long infoid) {
        this.infoid = infoid;
    }

    public Integer getCheckdaysinthelastyear() {
        return checkdaysinthelastyear;
    }

    public void setCheckdaysinthelastyear(Integer checkdaysinthelastyear) {
        this.checkdaysinthelastyear = checkdaysinthelastyear;
    }

    public Integer getChecked() {
        return checked;
    }

    public void setChecked(Integer checked) {
        this.checked = checked;
    }

    public String getCheckedtime() {
        return checkedtime;
    }

    public void setCheckedtime(String checkedtime) {
        this.checkedtime = checkedtime == null ? null : checkedtime.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public Integer getSolvedproblemnumberoftoday() {
        return solvedproblemnumberoftoday;
    }

    public void setSolvedproblemnumberoftoday(Integer solvedproblemnumberoftoday) {
        this.solvedproblemnumberoftoday = solvedproblemnumberoftoday;
    }

    public Integer getSubmissionoftoday() {
        return submissionoftoday;
    }

    public void setSubmissionoftoday(Integer submissionoftoday) {
        this.submissionoftoday = submissionoftoday;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
    }

    public Integer getUpvotenumber() {
        return upvotenumber;
    }

    public void setUpvotenumber(Integer upvotenumber) {
        this.upvotenumber = upvotenumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}