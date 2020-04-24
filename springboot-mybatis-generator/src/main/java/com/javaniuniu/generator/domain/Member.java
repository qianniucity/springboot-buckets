package com.javaniuniu.generator.domain;

import java.util.ArrayList;
import java.util.Arrays;

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
        this.address = address;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getCnurl() {
        return cnurl;
    }

    public void setCnurl(String cnurl) {
        this.cnurl = cnurl;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEnurl() {
        return enurl;
    }

    public void setEnurl(String enurl) {
        this.enurl = enurl;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
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
        this.username = username;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", memberid=").append(memberid);
        sb.append(", acceptancerate=").append(acceptancerate);
        sb.append(", acceptedsubmission=").append(acceptedsubmission);
        sb.append(", address=").append(address);
        sb.append(", avatar=").append(avatar);
        sb.append(", cnurl=").append(cnurl);
        sb.append(", date=").append(date);
        sb.append(", enurl=").append(enurl);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", platform=").append(platform);
        sb.append(", solvedquestion=").append(solvedquestion);
        sb.append(", status=").append(status);
        sb.append(", submissioncount=").append(submissioncount);
        sb.append(", totalchecked=").append(totalchecked);
        sb.append(", username=").append(username);
        sb.append(", website=").append(website);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Member other = (Member) that;
        return (this.getMemberid() == null ? other.getMemberid() == null : this.getMemberid().equals(other.getMemberid()))
            && (this.getAcceptancerate() == null ? other.getAcceptancerate() == null : this.getAcceptancerate().equals(other.getAcceptancerate()))
            && (this.getAcceptedsubmission() == null ? other.getAcceptedsubmission() == null : this.getAcceptedsubmission().equals(other.getAcceptedsubmission()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getCnurl() == null ? other.getCnurl() == null : this.getCnurl().equals(other.getCnurl()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getEnurl() == null ? other.getEnurl() == null : this.getEnurl().equals(other.getEnurl()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
            && (this.getSolvedquestion() == null ? other.getSolvedquestion() == null : this.getSolvedquestion().equals(other.getSolvedquestion()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSubmissioncount() == null ? other.getSubmissioncount() == null : this.getSubmissioncount().equals(other.getSubmissioncount()))
            && (this.getTotalchecked() == null ? other.getTotalchecked() == null : this.getTotalchecked().equals(other.getTotalchecked()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getWebsite() == null ? other.getWebsite() == null : this.getWebsite().equals(other.getWebsite()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMemberid() == null) ? 0 : getMemberid().hashCode());
        result = prime * result + ((getAcceptancerate() == null) ? 0 : getAcceptancerate().hashCode());
        result = prime * result + ((getAcceptedsubmission() == null) ? 0 : getAcceptedsubmission().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getCnurl() == null) ? 0 : getCnurl().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getEnurl() == null) ? 0 : getEnurl().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getSolvedquestion() == null) ? 0 : getSolvedquestion().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSubmissioncount() == null) ? 0 : getSubmissioncount().hashCode());
        result = prime * result + ((getTotalchecked() == null) ? 0 : getTotalchecked().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getWebsite() == null) ? 0 : getWebsite().hashCode());
        return result;
    }

    public enum Column {
        memberid("memberId", "memberid", "BIGINT", false),
        acceptancerate("acceptanceRate", "acceptancerate", "DOUBLE", false),
        acceptedsubmission("acceptedSubmission", "acceptedsubmission", "INTEGER", false),
        address("address", "address", "VARCHAR", false),
        avatar("avatar", "avatar", "VARCHAR", false),
        cnurl("cnUrl", "cnurl", "VARCHAR", false),
        date("date", "date", "VARCHAR", true),
        enurl("enUrl", "enurl", "VARCHAR", false),
        gmtCreate("gmt_create", "gmtCreate", "VARCHAR", false),
        gmtModified("gmt_modified", "gmtModified", "VARCHAR", false),
        platform("platform", "platform", "VARCHAR", false),
        solvedquestion("solvedQuestion", "solvedquestion", "INTEGER", false),
        status("status", "status", "INTEGER", true),
        submissioncount("submissionCount", "submissioncount", "INTEGER", false),
        totalchecked("totalChecked", "totalchecked", "INTEGER", false),
        username("username", "username", "VARCHAR", false),
        website("website", "website", "VARCHAR", false);

        private static final String BEGINNING_DELIMITER = "`";

        private static final String ENDING_DELIMITER = "`";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public static Column[] all() {
            return Column.values();
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}