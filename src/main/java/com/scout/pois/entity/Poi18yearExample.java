package com.scout.pois.entity;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Poi18yearExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    public Poi18yearExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table poi18year
     *
     * @mbg.generated
     */
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

        public Criteria andPidIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("PID like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("PID not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("PID not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPoinameIsNull() {
            addCriterion("POINAME is null");
            return (Criteria) this;
        }

        public Criteria andPoinameIsNotNull() {
            addCriterion("POINAME is not null");
            return (Criteria) this;
        }

        public Criteria andPoinameEqualTo(String value) {
            addCriterion("POINAME =", value, "poiname");
            return (Criteria) this;
        }

        public Criteria andPoinameNotEqualTo(String value) {
            addCriterion("POINAME <>", value, "poiname");
            return (Criteria) this;
        }

        public Criteria andPoinameGreaterThan(String value) {
            addCriterion("POINAME >", value, "poiname");
            return (Criteria) this;
        }

        public Criteria andPoinameGreaterThanOrEqualTo(String value) {
            addCriterion("POINAME >=", value, "poiname");
            return (Criteria) this;
        }

        public Criteria andPoinameLessThan(String value) {
            addCriterion("POINAME <", value, "poiname");
            return (Criteria) this;
        }

        public Criteria andPoinameLessThanOrEqualTo(String value) {
            addCriterion("POINAME <=", value, "poiname");
            return (Criteria) this;
        }

        public Criteria andPoinameLike(String value) {
            addCriterion("POINAME like", value, "poiname");
            return (Criteria) this;
        }

        public Criteria andPoinameNotLike(String value) {
            addCriterion("POINAME not like", value, "poiname");
            return (Criteria) this;
        }

        public Criteria andPoinameIn(List<String> values) {
            addCriterion("POINAME in", values, "poiname");
            return (Criteria) this;
        }

        public Criteria andPoinameNotIn(List<String> values) {
            addCriterion("POINAME not in", values, "poiname");
            return (Criteria) this;
        }

        public Criteria andPoinameBetween(String value1, String value2) {
            addCriterion("POINAME between", value1, value2, "poiname");
            return (Criteria) this;
        }

        public Criteria andPoinameNotBetween(String value1, String value2) {
            addCriterion("POINAME not between", value1, value2, "poiname");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Double value) {
            addCriterion("LONGITUDE =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Double value) {
            addCriterion("LONGITUDE <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Double value) {
            addCriterion("LONGITUDE >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("LONGITUDE >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Double value) {
            addCriterion("LONGITUDE <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("LONGITUDE <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Double> values) {
            addCriterion("LONGITUDE in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Double> values) {
            addCriterion("LONGITUDE not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Double value1, Double value2) {
            addCriterion("LONGITUDE between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("LONGITUDE not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Double value) {
            addCriterion("LATITUDE =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Double value) {
            addCriterion("LATITUDE <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Double value) {
            addCriterion("LATITUDE >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("LATITUDE >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Double value) {
            addCriterion("LATITUDE <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("LATITUDE <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Double> values) {
            addCriterion("LATITUDE in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Double> values) {
            addCriterion("LATITUDE not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Double value1, Double value2) {
            addCriterion("LATITUDE between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("LATITUDE not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("CONTACT =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("CONTACT <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("CONTACT >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("CONTACT <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("CONTACT <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("CONTACT like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("CONTACT not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("CONTACT in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("CONTACT not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("CONTACT between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("CONTACT not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNull() {
            addCriterion("FULLNAME is null");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNotNull() {
            addCriterion("FULLNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFullnameEqualTo(String value) {
            addCriterion("FULLNAME =", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotEqualTo(String value) {
            addCriterion("FULLNAME <>", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThan(String value) {
            addCriterion("FULLNAME >", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("FULLNAME >=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThan(String value) {
            addCriterion("FULLNAME <", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThanOrEqualTo(String value) {
            addCriterion("FULLNAME <=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLike(String value) {
            addCriterion("FULLNAME like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotLike(String value) {
            addCriterion("FULLNAME not like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameIn(List<String> values) {
            addCriterion("FULLNAME in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotIn(List<String> values) {
            addCriterion("FULLNAME not in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameBetween(String value1, String value2) {
            addCriterion("FULLNAME between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotBetween(String value1, String value2) {
            addCriterion("FULLNAME not between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNull() {
            addCriterion("CLASSNAME is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("CLASSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("CLASSNAME =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("CLASSNAME <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("CLASSNAME >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSNAME >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("CLASSNAME <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("CLASSNAME <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("CLASSNAME like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("CLASSNAME not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("CLASSNAME in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("CLASSNAME not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("CLASSNAME between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("CLASSNAME not between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameIsNull() {
            addCriterion("SUBCLASSNAME is null");
            return (Criteria) this;
        }

        public Criteria andSubclassnameIsNotNull() {
            addCriterion("SUBCLASSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSubclassnameEqualTo(String value) {
            addCriterion("SUBCLASSNAME =", value, "subclassname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameNotEqualTo(String value) {
            addCriterion("SUBCLASSNAME <>", value, "subclassname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameGreaterThan(String value) {
            addCriterion("SUBCLASSNAME >", value, "subclassname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameGreaterThanOrEqualTo(String value) {
            addCriterion("SUBCLASSNAME >=", value, "subclassname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameLessThan(String value) {
            addCriterion("SUBCLASSNAME <", value, "subclassname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameLessThanOrEqualTo(String value) {
            addCriterion("SUBCLASSNAME <=", value, "subclassname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameLike(String value) {
            addCriterion("SUBCLASSNAME like", value, "subclassname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameNotLike(String value) {
            addCriterion("SUBCLASSNAME not like", value, "subclassname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameIn(List<String> values) {
            addCriterion("SUBCLASSNAME in", values, "subclassname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameNotIn(List<String> values) {
            addCriterion("SUBCLASSNAME not in", values, "subclassname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameBetween(String value1, String value2) {
            addCriterion("SUBCLASSNAME between", value1, value2, "subclassname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameNotBetween(String value1, String value2) {
            addCriterion("SUBCLASSNAME not between", value1, value2, "subclassname");
            return (Criteria) this;
        }

        public Criteria andKindnameIsNull() {
            addCriterion("KINDNAME is null");
            return (Criteria) this;
        }

        public Criteria andKindnameIsNotNull() {
            addCriterion("KINDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andKindnameEqualTo(String value) {
            addCriterion("KINDNAME =", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameNotEqualTo(String value) {
            addCriterion("KINDNAME <>", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameGreaterThan(String value) {
            addCriterion("KINDNAME >", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameGreaterThanOrEqualTo(String value) {
            addCriterion("KINDNAME >=", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameLessThan(String value) {
            addCriterion("KINDNAME <", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameLessThanOrEqualTo(String value) {
            addCriterion("KINDNAME <=", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameLike(String value) {
            addCriterion("KINDNAME like", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameNotLike(String value) {
            addCriterion("KINDNAME not like", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameIn(List<String> values) {
            addCriterion("KINDNAME in", values, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameNotIn(List<String> values) {
            addCriterion("KINDNAME not in", values, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameBetween(String value1, String value2) {
            addCriterion("KINDNAME between", value1, value2, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameNotBetween(String value1, String value2) {
            addCriterion("KINDNAME not between", value1, value2, "kindname");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("`STATE` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`STATE` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("`STATE` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("`STATE` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("`STATE` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("`STATE` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("`STATE` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("`STATE` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("`STATE` like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("`STATE` not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("`STATE` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("`STATE` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("`STATE` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("`STATE` not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andChainnameIsNull() {
            addCriterion("CHAINNAME is null");
            return (Criteria) this;
        }

        public Criteria andChainnameIsNotNull() {
            addCriterion("CHAINNAME is not null");
            return (Criteria) this;
        }

        public Criteria andChainnameEqualTo(String value) {
            addCriterion("CHAINNAME =", value, "chainname");
            return (Criteria) this;
        }

        public Criteria andChainnameNotEqualTo(String value) {
            addCriterion("CHAINNAME <>", value, "chainname");
            return (Criteria) this;
        }

        public Criteria andChainnameGreaterThan(String value) {
            addCriterion("CHAINNAME >", value, "chainname");
            return (Criteria) this;
        }

        public Criteria andChainnameGreaterThanOrEqualTo(String value) {
            addCriterion("CHAINNAME >=", value, "chainname");
            return (Criteria) this;
        }

        public Criteria andChainnameLessThan(String value) {
            addCriterion("CHAINNAME <", value, "chainname");
            return (Criteria) this;
        }

        public Criteria andChainnameLessThanOrEqualTo(String value) {
            addCriterion("CHAINNAME <=", value, "chainname");
            return (Criteria) this;
        }

        public Criteria andChainnameLike(String value) {
            addCriterion("CHAINNAME like", value, "chainname");
            return (Criteria) this;
        }

        public Criteria andChainnameNotLike(String value) {
            addCriterion("CHAINNAME not like", value, "chainname");
            return (Criteria) this;
        }

        public Criteria andChainnameIn(List<String> values) {
            addCriterion("CHAINNAME in", values, "chainname");
            return (Criteria) this;
        }

        public Criteria andChainnameNotIn(List<String> values) {
            addCriterion("CHAINNAME not in", values, "chainname");
            return (Criteria) this;
        }

        public Criteria andChainnameBetween(String value1, String value2) {
            addCriterion("CHAINNAME between", value1, value2, "chainname");
            return (Criteria) this;
        }

        public Criteria andChainnameNotBetween(String value1, String value2) {
            addCriterion("CHAINNAME not between", value1, value2, "chainname");
            return (Criteria) this;
        }

        public Criteria andLinkpidIsNull() {
            addCriterion("LINKPID is null");
            return (Criteria) this;
        }

        public Criteria andLinkpidIsNotNull() {
            addCriterion("LINKPID is not null");
            return (Criteria) this;
        }

        public Criteria andLinkpidEqualTo(String value) {
            addCriterion("LINKPID =", value, "linkpid");
            return (Criteria) this;
        }

        public Criteria andLinkpidNotEqualTo(String value) {
            addCriterion("LINKPID <>", value, "linkpid");
            return (Criteria) this;
        }

        public Criteria andLinkpidGreaterThan(String value) {
            addCriterion("LINKPID >", value, "linkpid");
            return (Criteria) this;
        }

        public Criteria andLinkpidGreaterThanOrEqualTo(String value) {
            addCriterion("LINKPID >=", value, "linkpid");
            return (Criteria) this;
        }

        public Criteria andLinkpidLessThan(String value) {
            addCriterion("LINKPID <", value, "linkpid");
            return (Criteria) this;
        }

        public Criteria andLinkpidLessThanOrEqualTo(String value) {
            addCriterion("LINKPID <=", value, "linkpid");
            return (Criteria) this;
        }

        public Criteria andLinkpidLike(String value) {
            addCriterion("LINKPID like", value, "linkpid");
            return (Criteria) this;
        }

        public Criteria andLinkpidNotLike(String value) {
            addCriterion("LINKPID not like", value, "linkpid");
            return (Criteria) this;
        }

        public Criteria andLinkpidIn(List<String> values) {
            addCriterion("LINKPID in", values, "linkpid");
            return (Criteria) this;
        }

        public Criteria andLinkpidNotIn(List<String> values) {
            addCriterion("LINKPID not in", values, "linkpid");
            return (Criteria) this;
        }

        public Criteria andLinkpidBetween(String value1, String value2) {
            addCriterion("LINKPID between", value1, value2, "linkpid");
            return (Criteria) this;
        }

        public Criteria andLinkpidNotBetween(String value1, String value2) {
            addCriterion("LINKPID not between", value1, value2, "linkpid");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("`YEAR` is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("`YEAR` is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("`YEAR` =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("`YEAR` <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("`YEAR` >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("`YEAR` >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("`YEAR` <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("`YEAR` <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("`YEAR` in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("`YEAR` not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("`YEAR` between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("`YEAR` not between", value1, value2, "year");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table poi18year
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table poi18year
     *
     * @mbg.generated
     */
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