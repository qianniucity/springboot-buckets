package com.javaniuniu.generator2.model;

import java.util.ArrayList;
import java.util.List;

public class CheckdayinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckdayinfoExample() {
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

        public Criteria andInfoidIsNull() {
            addCriterion("infoId is null");
            return (Criteria) this;
        }

        public Criteria andInfoidIsNotNull() {
            addCriterion("infoId is not null");
            return (Criteria) this;
        }

        public Criteria andInfoidEqualTo(Long value) {
            addCriterion("infoId =", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotEqualTo(Long value) {
            addCriterion("infoId <>", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidGreaterThan(Long value) {
            addCriterion("infoId >", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidGreaterThanOrEqualTo(Long value) {
            addCriterion("infoId >=", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLessThan(Long value) {
            addCriterion("infoId <", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLessThanOrEqualTo(Long value) {
            addCriterion("infoId <=", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidIn(List<Long> values) {
            addCriterion("infoId in", values, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotIn(List<Long> values) {
            addCriterion("infoId not in", values, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidBetween(Long value1, Long value2) {
            addCriterion("infoId between", value1, value2, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotBetween(Long value1, Long value2) {
            addCriterion("infoId not between", value1, value2, "infoid");
            return (Criteria) this;
        }

        public Criteria andCheckdaysinthelastyearIsNull() {
            addCriterion("checkDaysInTheLastYear is null");
            return (Criteria) this;
        }

        public Criteria andCheckdaysinthelastyearIsNotNull() {
            addCriterion("checkDaysInTheLastYear is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdaysinthelastyearEqualTo(Integer value) {
            addCriterion("checkDaysInTheLastYear =", value, "checkdaysinthelastyear");
            return (Criteria) this;
        }

        public Criteria andCheckdaysinthelastyearNotEqualTo(Integer value) {
            addCriterion("checkDaysInTheLastYear <>", value, "checkdaysinthelastyear");
            return (Criteria) this;
        }

        public Criteria andCheckdaysinthelastyearGreaterThan(Integer value) {
            addCriterion("checkDaysInTheLastYear >", value, "checkdaysinthelastyear");
            return (Criteria) this;
        }

        public Criteria andCheckdaysinthelastyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkDaysInTheLastYear >=", value, "checkdaysinthelastyear");
            return (Criteria) this;
        }

        public Criteria andCheckdaysinthelastyearLessThan(Integer value) {
            addCriterion("checkDaysInTheLastYear <", value, "checkdaysinthelastyear");
            return (Criteria) this;
        }

        public Criteria andCheckdaysinthelastyearLessThanOrEqualTo(Integer value) {
            addCriterion("checkDaysInTheLastYear <=", value, "checkdaysinthelastyear");
            return (Criteria) this;
        }

        public Criteria andCheckdaysinthelastyearIn(List<Integer> values) {
            addCriterion("checkDaysInTheLastYear in", values, "checkdaysinthelastyear");
            return (Criteria) this;
        }

        public Criteria andCheckdaysinthelastyearNotIn(List<Integer> values) {
            addCriterion("checkDaysInTheLastYear not in", values, "checkdaysinthelastyear");
            return (Criteria) this;
        }

        public Criteria andCheckdaysinthelastyearBetween(Integer value1, Integer value2) {
            addCriterion("checkDaysInTheLastYear between", value1, value2, "checkdaysinthelastyear");
            return (Criteria) this;
        }

        public Criteria andCheckdaysinthelastyearNotBetween(Integer value1, Integer value2) {
            addCriterion("checkDaysInTheLastYear not between", value1, value2, "checkdaysinthelastyear");
            return (Criteria) this;
        }

        public Criteria andCheckedIsNull() {
            addCriterion("checked is null");
            return (Criteria) this;
        }

        public Criteria andCheckedIsNotNull() {
            addCriterion("checked is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedEqualTo(Integer value) {
            addCriterion("checked =", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotEqualTo(Integer value) {
            addCriterion("checked <>", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThan(Integer value) {
            addCriterion("checked >", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThanOrEqualTo(Integer value) {
            addCriterion("checked >=", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedLessThan(Integer value) {
            addCriterion("checked <", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedLessThanOrEqualTo(Integer value) {
            addCriterion("checked <=", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedIn(List<Integer> values) {
            addCriterion("checked in", values, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotIn(List<Integer> values) {
            addCriterion("checked not in", values, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedBetween(Integer value1, Integer value2) {
            addCriterion("checked between", value1, value2, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotBetween(Integer value1, Integer value2) {
            addCriterion("checked not between", value1, value2, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeIsNull() {
            addCriterion("checkedTime is null");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeIsNotNull() {
            addCriterion("checkedTime is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeEqualTo(String value) {
            addCriterion("checkedTime =", value, "checkedtime");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeNotEqualTo(String value) {
            addCriterion("checkedTime <>", value, "checkedtime");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeGreaterThan(String value) {
            addCriterion("checkedTime >", value, "checkedtime");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeGreaterThanOrEqualTo(String value) {
            addCriterion("checkedTime >=", value, "checkedtime");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeLessThan(String value) {
            addCriterion("checkedTime <", value, "checkedtime");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeLessThanOrEqualTo(String value) {
            addCriterion("checkedTime <=", value, "checkedtime");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeLike(String value) {
            addCriterion("checkedTime like", value, "checkedtime");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeNotLike(String value) {
            addCriterion("checkedTime not like", value, "checkedtime");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeIn(List<String> values) {
            addCriterion("checkedTime in", values, "checkedtime");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeNotIn(List<String> values) {
            addCriterion("checkedTime not in", values, "checkedtime");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeBetween(String value1, String value2) {
            addCriterion("checkedTime between", value1, value2, "checkedtime");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeNotBetween(String value1, String value2) {
            addCriterion("checkedTime not between", value1, value2, "checkedtime");
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

        public Criteria andSolvedproblemnumberoftodayIsNull() {
            addCriterion("solvedProblemNumberOfToday is null");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemnumberoftodayIsNotNull() {
            addCriterion("solvedProblemNumberOfToday is not null");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemnumberoftodayEqualTo(Integer value) {
            addCriterion("solvedProblemNumberOfToday =", value, "solvedproblemnumberoftoday");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemnumberoftodayNotEqualTo(Integer value) {
            addCriterion("solvedProblemNumberOfToday <>", value, "solvedproblemnumberoftoday");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemnumberoftodayGreaterThan(Integer value) {
            addCriterion("solvedProblemNumberOfToday >", value, "solvedproblemnumberoftoday");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemnumberoftodayGreaterThanOrEqualTo(Integer value) {
            addCriterion("solvedProblemNumberOfToday >=", value, "solvedproblemnumberoftoday");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemnumberoftodayLessThan(Integer value) {
            addCriterion("solvedProblemNumberOfToday <", value, "solvedproblemnumberoftoday");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemnumberoftodayLessThanOrEqualTo(Integer value) {
            addCriterion("solvedProblemNumberOfToday <=", value, "solvedproblemnumberoftoday");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemnumberoftodayIn(List<Integer> values) {
            addCriterion("solvedProblemNumberOfToday in", values, "solvedproblemnumberoftoday");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemnumberoftodayNotIn(List<Integer> values) {
            addCriterion("solvedProblemNumberOfToday not in", values, "solvedproblemnumberoftoday");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemnumberoftodayBetween(Integer value1, Integer value2) {
            addCriterion("solvedProblemNumberOfToday between", value1, value2, "solvedproblemnumberoftoday");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemnumberoftodayNotBetween(Integer value1, Integer value2) {
            addCriterion("solvedProblemNumberOfToday not between", value1, value2, "solvedproblemnumberoftoday");
            return (Criteria) this;
        }

        public Criteria andSubmissionoftodayIsNull() {
            addCriterion("submissionOfToday is null");
            return (Criteria) this;
        }

        public Criteria andSubmissionoftodayIsNotNull() {
            addCriterion("submissionOfToday is not null");
            return (Criteria) this;
        }

        public Criteria andSubmissionoftodayEqualTo(Integer value) {
            addCriterion("submissionOfToday =", value, "submissionoftoday");
            return (Criteria) this;
        }

        public Criteria andSubmissionoftodayNotEqualTo(Integer value) {
            addCriterion("submissionOfToday <>", value, "submissionoftoday");
            return (Criteria) this;
        }

        public Criteria andSubmissionoftodayGreaterThan(Integer value) {
            addCriterion("submissionOfToday >", value, "submissionoftoday");
            return (Criteria) this;
        }

        public Criteria andSubmissionoftodayGreaterThanOrEqualTo(Integer value) {
            addCriterion("submissionOfToday >=", value, "submissionoftoday");
            return (Criteria) this;
        }

        public Criteria andSubmissionoftodayLessThan(Integer value) {
            addCriterion("submissionOfToday <", value, "submissionoftoday");
            return (Criteria) this;
        }

        public Criteria andSubmissionoftodayLessThanOrEqualTo(Integer value) {
            addCriterion("submissionOfToday <=", value, "submissionoftoday");
            return (Criteria) this;
        }

        public Criteria andSubmissionoftodayIn(List<Integer> values) {
            addCriterion("submissionOfToday in", values, "submissionoftoday");
            return (Criteria) this;
        }

        public Criteria andSubmissionoftodayNotIn(List<Integer> values) {
            addCriterion("submissionOfToday not in", values, "submissionoftoday");
            return (Criteria) this;
        }

        public Criteria andSubmissionoftodayBetween(Integer value1, Integer value2) {
            addCriterion("submissionOfToday between", value1, value2, "submissionoftoday");
            return (Criteria) this;
        }

        public Criteria andSubmissionoftodayNotBetween(Integer value1, Integer value2) {
            addCriterion("submissionOfToday not between", value1, value2, "submissionoftoday");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(String value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(String value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(String value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(String value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(String value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLike(String value) {
            addCriterion("updateTime like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotLike(String value) {
            addCriterion("updateTime not like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<String> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<String> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(String value1, String value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(String value1, String value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpvotenumberIsNull() {
            addCriterion("upvoteNumber is null");
            return (Criteria) this;
        }

        public Criteria andUpvotenumberIsNotNull() {
            addCriterion("upvoteNumber is not null");
            return (Criteria) this;
        }

        public Criteria andUpvotenumberEqualTo(Integer value) {
            addCriterion("upvoteNumber =", value, "upvotenumber");
            return (Criteria) this;
        }

        public Criteria andUpvotenumberNotEqualTo(Integer value) {
            addCriterion("upvoteNumber <>", value, "upvotenumber");
            return (Criteria) this;
        }

        public Criteria andUpvotenumberGreaterThan(Integer value) {
            addCriterion("upvoteNumber >", value, "upvotenumber");
            return (Criteria) this;
        }

        public Criteria andUpvotenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("upvoteNumber >=", value, "upvotenumber");
            return (Criteria) this;
        }

        public Criteria andUpvotenumberLessThan(Integer value) {
            addCriterion("upvoteNumber <", value, "upvotenumber");
            return (Criteria) this;
        }

        public Criteria andUpvotenumberLessThanOrEqualTo(Integer value) {
            addCriterion("upvoteNumber <=", value, "upvotenumber");
            return (Criteria) this;
        }

        public Criteria andUpvotenumberIn(List<Integer> values) {
            addCriterion("upvoteNumber in", values, "upvotenumber");
            return (Criteria) this;
        }

        public Criteria andUpvotenumberNotIn(List<Integer> values) {
            addCriterion("upvoteNumber not in", values, "upvotenumber");
            return (Criteria) this;
        }

        public Criteria andUpvotenumberBetween(Integer value1, Integer value2) {
            addCriterion("upvoteNumber between", value1, value2, "upvotenumber");
            return (Criteria) this;
        }

        public Criteria andUpvotenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("upvoteNumber not between", value1, value2, "upvotenumber");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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