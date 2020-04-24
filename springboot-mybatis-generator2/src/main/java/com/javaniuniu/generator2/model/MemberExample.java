package com.javaniuniu.generator2.model;

import java.util.ArrayList;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        public Criteria andMemberidIsNull() {
            addCriterion("memberId is null");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNotNull() {
            addCriterion("memberId is not null");
            return (Criteria) this;
        }

        public Criteria andMemberidEqualTo(Long value) {
            addCriterion("memberId =", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotEqualTo(Long value) {
            addCriterion("memberId <>", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThan(Long value) {
            addCriterion("memberId >", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThanOrEqualTo(Long value) {
            addCriterion("memberId >=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThan(Long value) {
            addCriterion("memberId <", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThanOrEqualTo(Long value) {
            addCriterion("memberId <=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidIn(List<Long> values) {
            addCriterion("memberId in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotIn(List<Long> values) {
            addCriterion("memberId not in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidBetween(Long value1, Long value2) {
            addCriterion("memberId between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotBetween(Long value1, Long value2) {
            addCriterion("memberId not between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andAcceptancerateIsNull() {
            addCriterion("acceptanceRate is null");
            return (Criteria) this;
        }

        public Criteria andAcceptancerateIsNotNull() {
            addCriterion("acceptanceRate is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptancerateEqualTo(Double value) {
            addCriterion("acceptanceRate =", value, "acceptancerate");
            return (Criteria) this;
        }

        public Criteria andAcceptancerateNotEqualTo(Double value) {
            addCriterion("acceptanceRate <>", value, "acceptancerate");
            return (Criteria) this;
        }

        public Criteria andAcceptancerateGreaterThan(Double value) {
            addCriterion("acceptanceRate >", value, "acceptancerate");
            return (Criteria) this;
        }

        public Criteria andAcceptancerateGreaterThanOrEqualTo(Double value) {
            addCriterion("acceptanceRate >=", value, "acceptancerate");
            return (Criteria) this;
        }

        public Criteria andAcceptancerateLessThan(Double value) {
            addCriterion("acceptanceRate <", value, "acceptancerate");
            return (Criteria) this;
        }

        public Criteria andAcceptancerateLessThanOrEqualTo(Double value) {
            addCriterion("acceptanceRate <=", value, "acceptancerate");
            return (Criteria) this;
        }

        public Criteria andAcceptancerateIn(List<Double> values) {
            addCriterion("acceptanceRate in", values, "acceptancerate");
            return (Criteria) this;
        }

        public Criteria andAcceptancerateNotIn(List<Double> values) {
            addCriterion("acceptanceRate not in", values, "acceptancerate");
            return (Criteria) this;
        }

        public Criteria andAcceptancerateBetween(Double value1, Double value2) {
            addCriterion("acceptanceRate between", value1, value2, "acceptancerate");
            return (Criteria) this;
        }

        public Criteria andAcceptancerateNotBetween(Double value1, Double value2) {
            addCriterion("acceptanceRate not between", value1, value2, "acceptancerate");
            return (Criteria) this;
        }

        public Criteria andAcceptedsubmissionIsNull() {
            addCriterion("acceptedSubmission is null");
            return (Criteria) this;
        }

        public Criteria andAcceptedsubmissionIsNotNull() {
            addCriterion("acceptedSubmission is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptedsubmissionEqualTo(Integer value) {
            addCriterion("acceptedSubmission =", value, "acceptedsubmission");
            return (Criteria) this;
        }

        public Criteria andAcceptedsubmissionNotEqualTo(Integer value) {
            addCriterion("acceptedSubmission <>", value, "acceptedsubmission");
            return (Criteria) this;
        }

        public Criteria andAcceptedsubmissionGreaterThan(Integer value) {
            addCriterion("acceptedSubmission >", value, "acceptedsubmission");
            return (Criteria) this;
        }

        public Criteria andAcceptedsubmissionGreaterThanOrEqualTo(Integer value) {
            addCriterion("acceptedSubmission >=", value, "acceptedsubmission");
            return (Criteria) this;
        }

        public Criteria andAcceptedsubmissionLessThan(Integer value) {
            addCriterion("acceptedSubmission <", value, "acceptedsubmission");
            return (Criteria) this;
        }

        public Criteria andAcceptedsubmissionLessThanOrEqualTo(Integer value) {
            addCriterion("acceptedSubmission <=", value, "acceptedsubmission");
            return (Criteria) this;
        }

        public Criteria andAcceptedsubmissionIn(List<Integer> values) {
            addCriterion("acceptedSubmission in", values, "acceptedsubmission");
            return (Criteria) this;
        }

        public Criteria andAcceptedsubmissionNotIn(List<Integer> values) {
            addCriterion("acceptedSubmission not in", values, "acceptedsubmission");
            return (Criteria) this;
        }

        public Criteria andAcceptedsubmissionBetween(Integer value1, Integer value2) {
            addCriterion("acceptedSubmission between", value1, value2, "acceptedsubmission");
            return (Criteria) this;
        }

        public Criteria andAcceptedsubmissionNotBetween(Integer value1, Integer value2) {
            addCriterion("acceptedSubmission not between", value1, value2, "acceptedsubmission");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
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

        public Criteria andCnurlNotEqualTo(String value) {
            addCriterion("cnUrl <>", value, "cnurl");
            return (Criteria) this;
        }

        public Criteria andCnurlGreaterThan(String value) {
            addCriterion("cnUrl >", value, "cnurl");
            return (Criteria) this;
        }

        public Criteria andCnurlGreaterThanOrEqualTo(String value) {
            addCriterion("cnUrl >=", value, "cnurl");
            return (Criteria) this;
        }

        public Criteria andCnurlLessThan(String value) {
            addCriterion("cnUrl <", value, "cnurl");
            return (Criteria) this;
        }

        public Criteria andCnurlLessThanOrEqualTo(String value) {
            addCriterion("cnUrl <=", value, "cnurl");
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

        public Criteria andEnurlNotEqualTo(String value) {
            addCriterion("enUrl <>", value, "enurl");
            return (Criteria) this;
        }

        public Criteria andEnurlGreaterThan(String value) {
            addCriterion("enUrl >", value, "enurl");
            return (Criteria) this;
        }

        public Criteria andEnurlGreaterThanOrEqualTo(String value) {
            addCriterion("enUrl >=", value, "enurl");
            return (Criteria) this;
        }

        public Criteria andEnurlLessThan(String value) {
            addCriterion("enUrl <", value, "enurl");
            return (Criteria) this;
        }

        public Criteria andEnurlLessThanOrEqualTo(String value) {
            addCriterion("enUrl <=", value, "enurl");
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

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(String value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(String value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(String value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(String value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(String value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(String value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLike(String value) {
            addCriterion("gmt_create like", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotLike(String value) {
            addCriterion("gmt_create not like", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<String> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<String> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(String value1, String value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(String value1, String value2) {
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

        public Criteria andGmtModifiedEqualTo(String value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(String value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(String value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(String value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(String value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(String value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLike(String value) {
            addCriterion("gmt_modified like", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotLike(String value) {
            addCriterion("gmt_modified not like", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<String> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<String> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(String value1, String value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(String value1, String value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("platform like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("platform not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andSolvedquestionIsNull() {
            addCriterion("solvedQuestion is null");
            return (Criteria) this;
        }

        public Criteria andSolvedquestionIsNotNull() {
            addCriterion("solvedQuestion is not null");
            return (Criteria) this;
        }

        public Criteria andSolvedquestionEqualTo(Integer value) {
            addCriterion("solvedQuestion =", value, "solvedquestion");
            return (Criteria) this;
        }

        public Criteria andSolvedquestionNotEqualTo(Integer value) {
            addCriterion("solvedQuestion <>", value, "solvedquestion");
            return (Criteria) this;
        }

        public Criteria andSolvedquestionGreaterThan(Integer value) {
            addCriterion("solvedQuestion >", value, "solvedquestion");
            return (Criteria) this;
        }

        public Criteria andSolvedquestionGreaterThanOrEqualTo(Integer value) {
            addCriterion("solvedQuestion >=", value, "solvedquestion");
            return (Criteria) this;
        }

        public Criteria andSolvedquestionLessThan(Integer value) {
            addCriterion("solvedQuestion <", value, "solvedquestion");
            return (Criteria) this;
        }

        public Criteria andSolvedquestionLessThanOrEqualTo(Integer value) {
            addCriterion("solvedQuestion <=", value, "solvedquestion");
            return (Criteria) this;
        }

        public Criteria andSolvedquestionIn(List<Integer> values) {
            addCriterion("solvedQuestion in", values, "solvedquestion");
            return (Criteria) this;
        }

        public Criteria andSolvedquestionNotIn(List<Integer> values) {
            addCriterion("solvedQuestion not in", values, "solvedquestion");
            return (Criteria) this;
        }

        public Criteria andSolvedquestionBetween(Integer value1, Integer value2) {
            addCriterion("solvedQuestion between", value1, value2, "solvedquestion");
            return (Criteria) this;
        }

        public Criteria andSolvedquestionNotBetween(Integer value1, Integer value2) {
            addCriterion("solvedQuestion not between", value1, value2, "solvedquestion");
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

        public Criteria andSubmissioncountIsNull() {
            addCriterion("submissionCount is null");
            return (Criteria) this;
        }

        public Criteria andSubmissioncountIsNotNull() {
            addCriterion("submissionCount is not null");
            return (Criteria) this;
        }

        public Criteria andSubmissioncountEqualTo(Integer value) {
            addCriterion("submissionCount =", value, "submissioncount");
            return (Criteria) this;
        }

        public Criteria andSubmissioncountNotEqualTo(Integer value) {
            addCriterion("submissionCount <>", value, "submissioncount");
            return (Criteria) this;
        }

        public Criteria andSubmissioncountGreaterThan(Integer value) {
            addCriterion("submissionCount >", value, "submissioncount");
            return (Criteria) this;
        }

        public Criteria andSubmissioncountGreaterThanOrEqualTo(Integer value) {
            addCriterion("submissionCount >=", value, "submissioncount");
            return (Criteria) this;
        }

        public Criteria andSubmissioncountLessThan(Integer value) {
            addCriterion("submissionCount <", value, "submissioncount");
            return (Criteria) this;
        }

        public Criteria andSubmissioncountLessThanOrEqualTo(Integer value) {
            addCriterion("submissionCount <=", value, "submissioncount");
            return (Criteria) this;
        }

        public Criteria andSubmissioncountIn(List<Integer> values) {
            addCriterion("submissionCount in", values, "submissioncount");
            return (Criteria) this;
        }

        public Criteria andSubmissioncountNotIn(List<Integer> values) {
            addCriterion("submissionCount not in", values, "submissioncount");
            return (Criteria) this;
        }

        public Criteria andSubmissioncountBetween(Integer value1, Integer value2) {
            addCriterion("submissionCount between", value1, value2, "submissioncount");
            return (Criteria) this;
        }

        public Criteria andSubmissioncountNotBetween(Integer value1, Integer value2) {
            addCriterion("submissionCount not between", value1, value2, "submissioncount");
            return (Criteria) this;
        }

        public Criteria andTotalcheckedIsNull() {
            addCriterion("totalChecked is null");
            return (Criteria) this;
        }

        public Criteria andTotalcheckedIsNotNull() {
            addCriterion("totalChecked is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcheckedEqualTo(Integer value) {
            addCriterion("totalChecked =", value, "totalchecked");
            return (Criteria) this;
        }

        public Criteria andTotalcheckedNotEqualTo(Integer value) {
            addCriterion("totalChecked <>", value, "totalchecked");
            return (Criteria) this;
        }

        public Criteria andTotalcheckedGreaterThan(Integer value) {
            addCriterion("totalChecked >", value, "totalchecked");
            return (Criteria) this;
        }

        public Criteria andTotalcheckedGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalChecked >=", value, "totalchecked");
            return (Criteria) this;
        }

        public Criteria andTotalcheckedLessThan(Integer value) {
            addCriterion("totalChecked <", value, "totalchecked");
            return (Criteria) this;
        }

        public Criteria andTotalcheckedLessThanOrEqualTo(Integer value) {
            addCriterion("totalChecked <=", value, "totalchecked");
            return (Criteria) this;
        }

        public Criteria andTotalcheckedIn(List<Integer> values) {
            addCriterion("totalChecked in", values, "totalchecked");
            return (Criteria) this;
        }

        public Criteria andTotalcheckedNotIn(List<Integer> values) {
            addCriterion("totalChecked not in", values, "totalchecked");
            return (Criteria) this;
        }

        public Criteria andTotalcheckedBetween(Integer value1, Integer value2) {
            addCriterion("totalChecked between", value1, value2, "totalchecked");
            return (Criteria) this;
        }

        public Criteria andTotalcheckedNotBetween(Integer value1, Integer value2) {
            addCriterion("totalChecked not between", value1, value2, "totalchecked");
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

        public Criteria andWebsiteIsNull() {
            addCriterion("website is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("website is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("website =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("website <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("website >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("website >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("website <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("website <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("website like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("website not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("website in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("website not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("website between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("website not between", value1, value2, "website");
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