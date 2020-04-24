package com.javaniuniu.generator.domain;

import java.util.ArrayList;
import java.util.Arrays;

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

    public String getIndexnum() {
        return indexnum;
    }

    public void setIndexnum(String indexnum) {
        this.indexnum = indexnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuestiontitleslug() {
        return questiontitleslug;
    }

    public void setQuestiontitleslug(String questiontitleslug) {
        this.questiontitleslug = questiontitleslug;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", problemid=").append(problemid);
        sb.append(", cnurl=").append(cnurl);
        sb.append(", date=").append(date);
        sb.append(", enurl=").append(enurl);
        sb.append(", indexnum=").append(indexnum);
        sb.append(", name=").append(name);
        sb.append(", questiontitleslug=").append(questiontitleslug);
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
        Problem other = (Problem) that;
        return (this.getProblemid() == null ? other.getProblemid() == null : this.getProblemid().equals(other.getProblemid()))
            && (this.getCnurl() == null ? other.getCnurl() == null : this.getCnurl().equals(other.getCnurl()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getEnurl() == null ? other.getEnurl() == null : this.getEnurl().equals(other.getEnurl()))
            && (this.getIndexnum() == null ? other.getIndexnum() == null : this.getIndexnum().equals(other.getIndexnum()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getQuestiontitleslug() == null ? other.getQuestiontitleslug() == null : this.getQuestiontitleslug().equals(other.getQuestiontitleslug()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProblemid() == null) ? 0 : getProblemid().hashCode());
        result = prime * result + ((getCnurl() == null) ? 0 : getCnurl().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getEnurl() == null) ? 0 : getEnurl().hashCode());
        result = prime * result + ((getIndexnum() == null) ? 0 : getIndexnum().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getQuestiontitleslug() == null) ? 0 : getQuestiontitleslug().hashCode());
        return result;
    }

    public enum Column {
        problemid("problemID", "problemid", "BIGINT", false),
        cnurl("cnUrl", "cnurl", "VARCHAR", false),
        date("date", "date", "VARCHAR", true),
        enurl("enUrl", "enurl", "VARCHAR", false),
        indexnum("indexNum", "indexnum", "VARCHAR", false),
        name("name", "name", "VARCHAR", true),
        questiontitleslug("questionTitleSlug", "questiontitleslug", "VARCHAR", false);

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