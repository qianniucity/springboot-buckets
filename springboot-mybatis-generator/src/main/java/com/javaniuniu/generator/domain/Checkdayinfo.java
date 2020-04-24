package com.javaniuniu.generator.domain;

import java.util.ArrayList;
import java.util.Arrays;

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
        this.checkedtime = checkedtime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
        this.updatetime = updatetime;
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
        this.username = username;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", infoid=").append(infoid);
        sb.append(", checkdaysinthelastyear=").append(checkdaysinthelastyear);
        sb.append(", checked=").append(checked);
        sb.append(", checkedtime=").append(checkedtime);
        sb.append(", date=").append(date);
        sb.append(", solvedproblemnumberoftoday=").append(solvedproblemnumberoftoday);
        sb.append(", submissionoftoday=").append(submissionoftoday);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", upvotenumber=").append(upvotenumber);
        sb.append(", username=").append(username);
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
        Checkdayinfo other = (Checkdayinfo) that;
        return (this.getInfoid() == null ? other.getInfoid() == null : this.getInfoid().equals(other.getInfoid()))
            && (this.getCheckdaysinthelastyear() == null ? other.getCheckdaysinthelastyear() == null : this.getCheckdaysinthelastyear().equals(other.getCheckdaysinthelastyear()))
            && (this.getChecked() == null ? other.getChecked() == null : this.getChecked().equals(other.getChecked()))
            && (this.getCheckedtime() == null ? other.getCheckedtime() == null : this.getCheckedtime().equals(other.getCheckedtime()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getSolvedproblemnumberoftoday() == null ? other.getSolvedproblemnumberoftoday() == null : this.getSolvedproblemnumberoftoday().equals(other.getSolvedproblemnumberoftoday()))
            && (this.getSubmissionoftoday() == null ? other.getSubmissionoftoday() == null : this.getSubmissionoftoday().equals(other.getSubmissionoftoday()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getUpvotenumber() == null ? other.getUpvotenumber() == null : this.getUpvotenumber().equals(other.getUpvotenumber()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInfoid() == null) ? 0 : getInfoid().hashCode());
        result = prime * result + ((getCheckdaysinthelastyear() == null) ? 0 : getCheckdaysinthelastyear().hashCode());
        result = prime * result + ((getChecked() == null) ? 0 : getChecked().hashCode());
        result = prime * result + ((getCheckedtime() == null) ? 0 : getCheckedtime().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getSolvedproblemnumberoftoday() == null) ? 0 : getSolvedproblemnumberoftoday().hashCode());
        result = prime * result + ((getSubmissionoftoday() == null) ? 0 : getSubmissionoftoday().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getUpvotenumber() == null) ? 0 : getUpvotenumber().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return result;
    }

    public enum Column {
        infoid("infoId", "infoid", "BIGINT", false),
        checkdaysinthelastyear("checkDaysInTheLastYear", "checkdaysinthelastyear", "INTEGER", false),
        checked("checked", "checked", "INTEGER", true),
        checkedtime("checkedTime", "checkedtime", "VARCHAR", false),
        date("date", "date", "VARCHAR", true),
        solvedproblemnumberoftoday("solvedProblemNumberOfToday", "solvedproblemnumberoftoday", "INTEGER", false),
        submissionoftoday("submissionOfToday", "submissionoftoday", "INTEGER", false),
        updatetime("updateTime", "updatetime", "VARCHAR", false),
        upvotenumber("upvoteNumber", "upvotenumber", "INTEGER", false),
        username("username", "username", "VARCHAR", false);

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