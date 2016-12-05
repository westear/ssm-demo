package com.westear.ssm.model.manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VisitUrlInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VisitUrlInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andVisitUrlIsNull() {
            addCriterion("VISIT_URL is null");
            return (Criteria) this;
        }

        public Criteria andVisitUrlIsNotNull() {
            addCriterion("VISIT_URL is not null");
            return (Criteria) this;
        }

        public Criteria andVisitUrlEqualTo(String value) {
            addCriterion("VISIT_URL =", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlNotEqualTo(String value) {
            addCriterion("VISIT_URL <>", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlGreaterThan(String value) {
            addCriterion("VISIT_URL >", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_URL >=", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlLessThan(String value) {
            addCriterion("VISIT_URL <", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlLessThanOrEqualTo(String value) {
            addCriterion("VISIT_URL <=", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlLike(String value) {
            addCriterion("VISIT_URL like", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlNotLike(String value) {
            addCriterion("VISIT_URL not like", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlIn(List<String> values) {
            addCriterion("VISIT_URL in", values, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlNotIn(List<String> values) {
            addCriterion("VISIT_URL not in", values, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlBetween(String value1, String value2) {
            addCriterion("VISIT_URL between", value1, value2, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlNotBetween(String value1, String value2) {
            addCriterion("VISIT_URL not between", value1, value2, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIsNull() {
            addCriterion("VISIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIsNotNull() {
            addCriterion("VISIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeEqualTo(Date value) {
            addCriterion("VISIT_TIME =", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotEqualTo(Date value) {
            addCriterion("VISIT_TIME <>", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeGreaterThan(Date value) {
            addCriterion("VISIT_TIME >", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("VISIT_TIME >=", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLessThan(Date value) {
            addCriterion("VISIT_TIME <", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLessThanOrEqualTo(Date value) {
            addCriterion("VISIT_TIME <=", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIn(List<Date> values) {
            addCriterion("VISIT_TIME in", values, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotIn(List<Date> values) {
            addCriterion("VISIT_TIME not in", values, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeBetween(Date value1, Date value2) {
            addCriterion("VISIT_TIME between", value1, value2, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotBetween(Date value1, Date value2) {
            addCriterion("VISIT_TIME not between", value1, value2, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitIpIsNull() {
            addCriterion("VISIT_IP is null");
            return (Criteria) this;
        }

        public Criteria andVisitIpIsNotNull() {
            addCriterion("VISIT_IP is not null");
            return (Criteria) this;
        }

        public Criteria andVisitIpEqualTo(String value) {
            addCriterion("VISIT_IP =", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpNotEqualTo(String value) {
            addCriterion("VISIT_IP <>", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpGreaterThan(String value) {
            addCriterion("VISIT_IP >", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_IP >=", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpLessThan(String value) {
            addCriterion("VISIT_IP <", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpLessThanOrEqualTo(String value) {
            addCriterion("VISIT_IP <=", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpLike(String value) {
            addCriterion("VISIT_IP like", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpNotLike(String value) {
            addCriterion("VISIT_IP not like", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpIn(List<String> values) {
            addCriterion("VISIT_IP in", values, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpNotIn(List<String> values) {
            addCriterion("VISIT_IP not in", values, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpBetween(String value1, String value2) {
            addCriterion("VISIT_IP between", value1, value2, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpNotBetween(String value1, String value2) {
            addCriterion("VISIT_IP not between", value1, value2, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitCountryIsNull() {
            addCriterion("VISIT_COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andVisitCountryIsNotNull() {
            addCriterion("VISIT_COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andVisitCountryEqualTo(String value) {
            addCriterion("VISIT_COUNTRY =", value, "visitCountry");
            return (Criteria) this;
        }

        public Criteria andVisitCountryNotEqualTo(String value) {
            addCriterion("VISIT_COUNTRY <>", value, "visitCountry");
            return (Criteria) this;
        }

        public Criteria andVisitCountryGreaterThan(String value) {
            addCriterion("VISIT_COUNTRY >", value, "visitCountry");
            return (Criteria) this;
        }

        public Criteria andVisitCountryGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_COUNTRY >=", value, "visitCountry");
            return (Criteria) this;
        }

        public Criteria andVisitCountryLessThan(String value) {
            addCriterion("VISIT_COUNTRY <", value, "visitCountry");
            return (Criteria) this;
        }

        public Criteria andVisitCountryLessThanOrEqualTo(String value) {
            addCriterion("VISIT_COUNTRY <=", value, "visitCountry");
            return (Criteria) this;
        }

        public Criteria andVisitCountryLike(String value) {
            addCriterion("VISIT_COUNTRY like", value, "visitCountry");
            return (Criteria) this;
        }

        public Criteria andVisitCountryNotLike(String value) {
            addCriterion("VISIT_COUNTRY not like", value, "visitCountry");
            return (Criteria) this;
        }

        public Criteria andVisitCountryIn(List<String> values) {
            addCriterion("VISIT_COUNTRY in", values, "visitCountry");
            return (Criteria) this;
        }

        public Criteria andVisitCountryNotIn(List<String> values) {
            addCriterion("VISIT_COUNTRY not in", values, "visitCountry");
            return (Criteria) this;
        }

        public Criteria andVisitCountryBetween(String value1, String value2) {
            addCriterion("VISIT_COUNTRY between", value1, value2, "visitCountry");
            return (Criteria) this;
        }

        public Criteria andVisitCountryNotBetween(String value1, String value2) {
            addCriterion("VISIT_COUNTRY not between", value1, value2, "visitCountry");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNull() {
            addCriterion("LEAVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("LEAVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(Date value) {
            addCriterion("LEAVE_TIME =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(Date value) {
            addCriterion("LEAVE_TIME <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(Date value) {
            addCriterion("LEAVE_TIME >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LEAVE_TIME >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(Date value) {
            addCriterion("LEAVE_TIME <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(Date value) {
            addCriterion("LEAVE_TIME <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<Date> values) {
            addCriterion("LEAVE_TIME in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<Date> values) {
            addCriterion("LEAVE_TIME not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(Date value1, Date value2) {
            addCriterion("LEAVE_TIME between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(Date value1, Date value2) {
            addCriterion("LEAVE_TIME not between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andVisitCountIsNull() {
            addCriterion("VISIT_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andVisitCountIsNotNull() {
            addCriterion("VISIT_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andVisitCountEqualTo(Long value) {
            addCriterion("VISIT_COUNT =", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountNotEqualTo(Long value) {
            addCriterion("VISIT_COUNT <>", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountGreaterThan(Long value) {
            addCriterion("VISIT_COUNT >", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountGreaterThanOrEqualTo(Long value) {
            addCriterion("VISIT_COUNT >=", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountLessThan(Long value) {
            addCriterion("VISIT_COUNT <", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountLessThanOrEqualTo(Long value) {
            addCriterion("VISIT_COUNT <=", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountIn(List<Long> values) {
            addCriterion("VISIT_COUNT in", values, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountNotIn(List<Long> values) {
            addCriterion("VISIT_COUNT not in", values, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountBetween(Long value1, Long value2) {
            addCriterion("VISIT_COUNT between", value1, value2, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountNotBetween(Long value1, Long value2) {
            addCriterion("VISIT_COUNT not between", value1, value2, "visitCount");
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