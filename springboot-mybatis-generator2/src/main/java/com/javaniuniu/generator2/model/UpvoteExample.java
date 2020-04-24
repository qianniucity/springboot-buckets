package com.javaniuniu.generator2.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UpvoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UpvoteExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUpvoteidIsNull() {
            addCriterion("upvoteID is null");
            return (Criteria) this;
        }

        public Criteria andUpvoteidIsNotNull() {
            addCriterion("upvoteID is not null");
            return (Criteria) this;
        }

        public Criteria andUpvoteidEqualTo(Long value) {
            addCriterion("upvoteID =", value, "upvoteid");
            return (Criteria) this;
        }

        public Criteria andUpvoteidNotEqualTo(Long value) {
            addCriterion("upvoteID <>", value, "upvoteid");
            return (Criteria) this;
        }

        public Criteria andUpvoteidGreaterThan(Long value) {
            addCriterion("upvoteID >", value, "upvoteid");
            return (Criteria) this;
        }

        public Criteria andUpvoteidGreaterThanOrEqualTo(Long value) {
            addCriterion("upvoteID >=", value, "upvoteid");
            return (Criteria) this;
        }

        public Criteria andUpvoteidLessThan(Long value) {
            addCriterion("upvoteID <", value, "upvoteid");
            return (Criteria) this;
        }

        public Criteria andUpvoteidLessThanOrEqualTo(Long value) {
            addCriterion("upvoteID <=", value, "upvoteid");
            return (Criteria) this;
        }

        public Criteria andUpvoteidIn(List<Long> values) {
            addCriterion("upvoteID in", values, "upvoteid");
            return (Criteria) this;
        }

        public Criteria andUpvoteidNotIn(List<Long> values) {
            addCriterion("upvoteID not in", values, "upvoteid");
            return (Criteria) this;
        }

        public Criteria andUpvoteidBetween(Long value1, Long value2) {
            addCriterion("upvoteID between", value1, value2, "upvoteid");
            return (Criteria) this;
        }

        public Criteria andUpvoteidNotBetween(Long value1, Long value2) {
            addCriterion("upvoteID not between", value1, value2, "upvoteid");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andFrommemberidIsNull() {
            addCriterion("fromMemberId is null");
            return (Criteria) this;
        }

        public Criteria andFrommemberidIsNotNull() {
            addCriterion("fromMemberId is not null");
            return (Criteria) this;
        }

        public Criteria andFrommemberidEqualTo(String value) {
            addCriterion("fromMemberId =", value, "frommemberid");
            return (Criteria) this;
        }

        public Criteria andFrommemberidNotEqualTo(String value) {
            addCriterion("fromMemberId <>", value, "frommemberid");
            return (Criteria) this;
        }

        public Criteria andFrommemberidGreaterThan(String value) {
            addCriterion("fromMemberId >", value, "frommemberid");
            return (Criteria) this;
        }

        public Criteria andFrommemberidGreaterThanOrEqualTo(String value) {
            addCriterion("fromMemberId >=", value, "frommemberid");
            return (Criteria) this;
        }

        public Criteria andFrommemberidLessThan(String value) {
            addCriterion("fromMemberId <", value, "frommemberid");
            return (Criteria) this;
        }

        public Criteria andFrommemberidLessThanOrEqualTo(String value) {
            addCriterion("fromMemberId <=", value, "frommemberid");
            return (Criteria) this;
        }

        public Criteria andFrommemberidLike(String value) {
            addCriterion("fromMemberId like", value, "frommemberid");
            return (Criteria) this;
        }

        public Criteria andFrommemberidNotLike(String value) {
            addCriterion("fromMemberId not like", value, "frommemberid");
            return (Criteria) this;
        }

        public Criteria andFrommemberidIn(List<String> values) {
            addCriterion("fromMemberId in", values, "frommemberid");
            return (Criteria) this;
        }

        public Criteria andFrommemberidNotIn(List<String> values) {
            addCriterion("fromMemberId not in", values, "frommemberid");
            return (Criteria) this;
        }

        public Criteria andFrommemberidBetween(String value1, String value2) {
            addCriterion("fromMemberId between", value1, value2, "frommemberid");
            return (Criteria) this;
        }

        public Criteria andFrommemberidNotBetween(String value1, String value2) {
            addCriterion("fromMemberId not between", value1, value2, "frommemberid");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTomemberidIsNull() {
            addCriterion("toMemberId is null");
            return (Criteria) this;
        }

        public Criteria andTomemberidIsNotNull() {
            addCriterion("toMemberId is not null");
            return (Criteria) this;
        }

        public Criteria andTomemberidEqualTo(String value) {
            addCriterion("toMemberId =", value, "tomemberid");
            return (Criteria) this;
        }

        public Criteria andTomemberidNotEqualTo(String value) {
            addCriterion("toMemberId <>", value, "tomemberid");
            return (Criteria) this;
        }

        public Criteria andTomemberidGreaterThan(String value) {
            addCriterion("toMemberId >", value, "tomemberid");
            return (Criteria) this;
        }

        public Criteria andTomemberidGreaterThanOrEqualTo(String value) {
            addCriterion("toMemberId >=", value, "tomemberid");
            return (Criteria) this;
        }

        public Criteria andTomemberidLessThan(String value) {
            addCriterion("toMemberId <", value, "tomemberid");
            return (Criteria) this;
        }

        public Criteria andTomemberidLessThanOrEqualTo(String value) {
            addCriterion("toMemberId <=", value, "tomemberid");
            return (Criteria) this;
        }

        public Criteria andTomemberidLike(String value) {
            addCriterion("toMemberId like", value, "tomemberid");
            return (Criteria) this;
        }

        public Criteria andTomemberidNotLike(String value) {
            addCriterion("toMemberId not like", value, "tomemberid");
            return (Criteria) this;
        }

        public Criteria andTomemberidIn(List<String> values) {
            addCriterion("toMemberId in", values, "tomemberid");
            return (Criteria) this;
        }

        public Criteria andTomemberidNotIn(List<String> values) {
            addCriterion("toMemberId not in", values, "tomemberid");
            return (Criteria) this;
        }

        public Criteria andTomemberidBetween(String value1, String value2) {
            addCriterion("toMemberId between", value1, value2, "tomemberid");
            return (Criteria) this;
        }

        public Criteria andTomemberidNotBetween(String value1, String value2) {
            addCriterion("toMemberId not between", value1, value2, "tomemberid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}