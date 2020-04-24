package com.javaniuniu.generator.domain;

import java.util.ArrayList;
import java.util.List;

public class ProblemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProblemExample() {
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

    public ProblemExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public ProblemExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public static Criteria newAndCreateCriteria() {
        ProblemExample example = new ProblemExample();
        return example.createCriteria();
    }

    public ProblemExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public ProblemExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
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

        public Criteria andProblemidIsNull() {
            addCriterion("problemID is null");
            return (Criteria) this;
        }

        public Criteria andProblemidIsNotNull() {
            addCriterion("problemID is not null");
            return (Criteria) this;
        }

        public Criteria andProblemidEqualTo(Long value) {
            addCriterion("problemID =", value, "problemid");
            return (Criteria) this;
        }

        public Criteria andProblemidEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("problemID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProblemidNotEqualTo(Long value) {
            addCriterion("problemID <>", value, "problemid");
            return (Criteria) this;
        }

        public Criteria andProblemidNotEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("problemID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProblemidGreaterThan(Long value) {
            addCriterion("problemID >", value, "problemid");
            return (Criteria) this;
        }

        public Criteria andProblemidGreaterThanColumn(Problem.Column column) {
            addCriterion(new StringBuilder("problemID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProblemidGreaterThanOrEqualTo(Long value) {
            addCriterion("problemID >=", value, "problemid");
            return (Criteria) this;
        }

        public Criteria andProblemidGreaterThanOrEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("problemID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProblemidLessThan(Long value) {
            addCriterion("problemID <", value, "problemid");
            return (Criteria) this;
        }

        public Criteria andProblemidLessThanColumn(Problem.Column column) {
            addCriterion(new StringBuilder("problemID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProblemidLessThanOrEqualTo(Long value) {
            addCriterion("problemID <=", value, "problemid");
            return (Criteria) this;
        }

        public Criteria andProblemidLessThanOrEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("problemID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProblemidIn(List<Long> values) {
            addCriterion("problemID in", values, "problemid");
            return (Criteria) this;
        }

        public Criteria andProblemidNotIn(List<Long> values) {
            addCriterion("problemID not in", values, "problemid");
            return (Criteria) this;
        }

        public Criteria andProblemidBetween(Long value1, Long value2) {
            addCriterion("problemID between", value1, value2, "problemid");
            return (Criteria) this;
        }

        public Criteria andProblemidNotBetween(Long value1, Long value2) {
            addCriterion("problemID not between", value1, value2, "problemid");
            return (Criteria) this;
        }

        public Criteria andCnurlIsNull() {
            addCriterion("cnUrl is null");
            return (Criteria) this;
        }

        public Criteria andCnurlIsNotNull() {
            addCriterion("cnUrl is not null");
            return (Criteria) this;
        }

        public Criteria andCnurlEqualTo(String value) {
            addCriterion("cnUrl =", value, "cnurl");
            return (Criteria) this;
        }

        public Criteria andCnurlEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("cnUrl = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCnurlNotEqualTo(String value) {
            addCriterion("cnUrl <>", value, "cnurl");
            return (Criteria) this;
        }

        public Criteria andCnurlNotEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("cnUrl <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCnurlGreaterThan(String value) {
            addCriterion("cnUrl >", value, "cnurl");
            return (Criteria) this;
        }

        public Criteria andCnurlGreaterThanColumn(Problem.Column column) {
            addCriterion(new StringBuilder("cnUrl > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCnurlGreaterThanOrEqualTo(String value) {
            addCriterion("cnUrl >=", value, "cnurl");
            return (Criteria) this;
        }

        public Criteria andCnurlGreaterThanOrEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("cnUrl >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCnurlLessThan(String value) {
            addCriterion("cnUrl <", value, "cnurl");
            return (Criteria) this;
        }

        public Criteria andCnurlLessThanColumn(Problem.Column column) {
            addCriterion(new StringBuilder("cnUrl < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCnurlLessThanOrEqualTo(String value) {
            addCriterion("cnUrl <=", value, "cnurl");
            return (Criteria) this;
        }

        public Criteria andCnurlLessThanOrEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("cnUrl <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCnurlLike(String value) {
            addCriterion("cnUrl like", value, "cnurl");
            return (Criteria) this;
        }

        public Criteria andCnurlNotLike(String value) {
            addCriterion("cnUrl not like", value, "cnurl");
            return (Criteria) this;
        }

        public Criteria andCnurlIn(List<String> values) {
            addCriterion("cnUrl in", values, "cnurl");
            return (Criteria) this;
        }

        public Criteria andCnurlNotIn(List<String> values) {
            addCriterion("cnUrl not in", values, "cnurl");
            return (Criteria) this;
        }

        public Criteria andCnurlBetween(String value1, String value2) {
            addCriterion("cnUrl between", value1, value2, "cnurl");
            return (Criteria) this;
        }

        public Criteria andCnurlNotBetween(String value1, String value2) {
            addCriterion("cnUrl not between", value1, value2, "cnurl");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("`date` is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("`date` is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("`date` =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("`date` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("`date` <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("`date` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("`date` >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanColumn(Problem.Column column) {
            addCriterion(new StringBuilder("`date` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("`date` >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("`date` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("`date` <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanColumn(Problem.Column column) {
            addCriterion(new StringBuilder("`date` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("`date` <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("`date` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("`date` like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("`date` not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("`date` in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("`date` not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("`date` between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("`date` not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andEnurlIsNull() {
            addCriterion("enUrl is null");
            return (Criteria) this;
        }

        public Criteria andEnurlIsNotNull() {
            addCriterion("enUrl is not null");
            return (Criteria) this;
        }

        public Criteria andEnurlEqualTo(String value) {
            addCriterion("enUrl =", value, "enurl");
            return (Criteria) this;
        }

        public Criteria andEnurlEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("enUrl = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnurlNotEqualTo(String value) {
            addCriterion("enUrl <>", value, "enurl");
            return (Criteria) this;
        }

        public Criteria andEnurlNotEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("enUrl <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnurlGreaterThan(String value) {
            addCriterion("enUrl >", value, "enurl");
            return (Criteria) this;
        }

        public Criteria andEnurlGreaterThanColumn(Problem.Column column) {
            addCriterion(new StringBuilder("enUrl > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnurlGreaterThanOrEqualTo(String value) {
            addCriterion("enUrl >=", value, "enurl");
            return (Criteria) this;
        }

        public Criteria andEnurlGreaterThanOrEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("enUrl >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnurlLessThan(String value) {
            addCriterion("enUrl <", value, "enurl");
            return (Criteria) this;
        }

        public Criteria andEnurlLessThanColumn(Problem.Column column) {
            addCriterion(new StringBuilder("enUrl < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnurlLessThanOrEqualTo(String value) {
            addCriterion("enUrl <=", value, "enurl");
            return (Criteria) this;
        }

        public Criteria andEnurlLessThanOrEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("enUrl <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnurlLike(String value) {
            addCriterion("enUrl like", value, "enurl");
            return (Criteria) this;
        }

        public Criteria andEnurlNotLike(String value) {
            addCriterion("enUrl not like", value, "enurl");
            return (Criteria) this;
        }

        public Criteria andEnurlIn(List<String> values) {
            addCriterion("enUrl in", values, "enurl");
            return (Criteria) this;
        }

        public Criteria andEnurlNotIn(List<String> values) {
            addCriterion("enUrl not in", values, "enurl");
            return (Criteria) this;
        }

        public Criteria andEnurlBetween(String value1, String value2) {
            addCriterion("enUrl between", value1, value2, "enurl");
            return (Criteria) this;
        }

        public Criteria andEnurlNotBetween(String value1, String value2) {
            addCriterion("enUrl not between", value1, value2, "enurl");
            return (Criteria) this;
        }

        public Criteria andIndexnumIsNull() {
            addCriterion("indexNum is null");
            return (Criteria) this;
        }

        public Criteria andIndexnumIsNotNull() {
            addCriterion("indexNum is not null");
            return (Criteria) this;
        }

        public Criteria andIndexnumEqualTo(String value) {
            addCriterion("indexNum =", value, "indexnum");
            return (Criteria) this;
        }

        public Criteria andIndexnumEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("indexNum = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIndexnumNotEqualTo(String value) {
            addCriterion("indexNum <>", value, "indexnum");
            return (Criteria) this;
        }

        public Criteria andIndexnumNotEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("indexNum <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIndexnumGreaterThan(String value) {
            addCriterion("indexNum >", value, "indexnum");
            return (Criteria) this;
        }

        public Criteria andIndexnumGreaterThanColumn(Problem.Column column) {
            addCriterion(new StringBuilder("indexNum > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIndexnumGreaterThanOrEqualTo(String value) {
            addCriterion("indexNum >=", value, "indexnum");
            return (Criteria) this;
        }

        public Criteria andIndexnumGreaterThanOrEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("indexNum >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIndexnumLessThan(String value) {
            addCriterion("indexNum <", value, "indexnum");
            return (Criteria) this;
        }

        public Criteria andIndexnumLessThanColumn(Problem.Column column) {
            addCriterion(new StringBuilder("indexNum < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIndexnumLessThanOrEqualTo(String value) {
            addCriterion("indexNum <=", value, "indexnum");
            return (Criteria) this;
        }

        public Criteria andIndexnumLessThanOrEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("indexNum <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIndexnumLike(String value) {
            addCriterion("indexNum like", value, "indexnum");
            return (Criteria) this;
        }

        public Criteria andIndexnumNotLike(String value) {
            addCriterion("indexNum not like", value, "indexnum");
            return (Criteria) this;
        }

        public Criteria andIndexnumIn(List<String> values) {
            addCriterion("indexNum in", values, "indexnum");
            return (Criteria) this;
        }

        public Criteria andIndexnumNotIn(List<String> values) {
            addCriterion("indexNum not in", values, "indexnum");
            return (Criteria) this;
        }

        public Criteria andIndexnumBetween(String value1, String value2) {
            addCriterion("indexNum between", value1, value2, "indexnum");
            return (Criteria) this;
        }

        public Criteria andIndexnumNotBetween(String value1, String value2) {
            addCriterion("indexNum not between", value1, value2, "indexnum");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("`name` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("`name` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanColumn(Problem.Column column) {
            addCriterion(new StringBuilder("`name` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("`name` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanColumn(Problem.Column column) {
            addCriterion(new StringBuilder("`name` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("`name` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleslugIsNull() {
            addCriterion("questionTitleSlug is null");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleslugIsNotNull() {
            addCriterion("questionTitleSlug is not null");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleslugEqualTo(String value) {
            addCriterion("questionTitleSlug =", value, "questiontitleslug");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleslugEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("questionTitleSlug = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQuestiontitleslugNotEqualTo(String value) {
            addCriterion("questionTitleSlug <>", value, "questiontitleslug");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleslugNotEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("questionTitleSlug <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQuestiontitleslugGreaterThan(String value) {
            addCriterion("questionTitleSlug >", value, "questiontitleslug");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleslugGreaterThanColumn(Problem.Column column) {
            addCriterion(new StringBuilder("questionTitleSlug > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQuestiontitleslugGreaterThanOrEqualTo(String value) {
            addCriterion("questionTitleSlug >=", value, "questiontitleslug");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleslugGreaterThanOrEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("questionTitleSlug >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQuestiontitleslugLessThan(String value) {
            addCriterion("questionTitleSlug <", value, "questiontitleslug");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleslugLessThanColumn(Problem.Column column) {
            addCriterion(new StringBuilder("questionTitleSlug < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQuestiontitleslugLessThanOrEqualTo(String value) {
            addCriterion("questionTitleSlug <=", value, "questiontitleslug");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleslugLessThanOrEqualToColumn(Problem.Column column) {
            addCriterion(new StringBuilder("questionTitleSlug <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQuestiontitleslugLike(String value) {
            addCriterion("questionTitleSlug like", value, "questiontitleslug");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleslugNotLike(String value) {
            addCriterion("questionTitleSlug not like", value, "questiontitleslug");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleslugIn(List<String> values) {
            addCriterion("questionTitleSlug in", values, "questiontitleslug");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleslugNotIn(List<String> values) {
            addCriterion("questionTitleSlug not in", values, "questiontitleslug");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleslugBetween(String value1, String value2) {
            addCriterion("questionTitleSlug between", value1, value2, "questiontitleslug");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleslugNotBetween(String value1, String value2) {
            addCriterion("questionTitleSlug not between", value1, value2, "questiontitleslug");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private ProblemExample example;

        protected Criteria(ProblemExample example) {
            super();
            this.example = example;
        }

        public ProblemExample example() {
            return this.example;
        }

        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        @Deprecated
        public interface ICriteriaAdd {
            Criteria add(Criteria add);
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

    public interface ICriteriaWhen {
        void criteria(Criteria criteria);
    }

    public interface IExampleWhen {
        void example(com.javaniuniu.generator.domain.ProblemExample example);
    }
}