package com.crx.pojo;

import java.util.ArrayList;
import java.util.List;

public class PerforationExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    public PerforationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
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
     * This method corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(String value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(String value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(String value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(String value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(String value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(String value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLike(String value) {
            addCriterion("tid like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotLike(String value) {
            addCriterion("tid not like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<String> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<String> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(String value1, String value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(String value1, String value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andCablePerforationIsNull() {
            addCriterion("cable_perforation is null");
            return (Criteria) this;
        }

        public Criteria andCablePerforationIsNotNull() {
            addCriterion("cable_perforation is not null");
            return (Criteria) this;
        }

        public Criteria andCablePerforationEqualTo(Double value) {
            addCriterion("cable_perforation =", value, "cablePerforation");
            return (Criteria) this;
        }

        public Criteria andCablePerforationNotEqualTo(Double value) {
            addCriterion("cable_perforation <>", value, "cablePerforation");
            return (Criteria) this;
        }

        public Criteria andCablePerforationGreaterThan(Double value) {
            addCriterion("cable_perforation >", value, "cablePerforation");
            return (Criteria) this;
        }

        public Criteria andCablePerforationGreaterThanOrEqualTo(Double value) {
            addCriterion("cable_perforation >=", value, "cablePerforation");
            return (Criteria) this;
        }

        public Criteria andCablePerforationLessThan(Double value) {
            addCriterion("cable_perforation <", value, "cablePerforation");
            return (Criteria) this;
        }

        public Criteria andCablePerforationLessThanOrEqualTo(Double value) {
            addCriterion("cable_perforation <=", value, "cablePerforation");
            return (Criteria) this;
        }

        public Criteria andCablePerforationIn(List<Double> values) {
            addCriterion("cable_perforation in", values, "cablePerforation");
            return (Criteria) this;
        }

        public Criteria andCablePerforationNotIn(List<Double> values) {
            addCriterion("cable_perforation not in", values, "cablePerforation");
            return (Criteria) this;
        }

        public Criteria andCablePerforationBetween(Double value1, Double value2) {
            addCriterion("cable_perforation between", value1, value2, "cablePerforation");
            return (Criteria) this;
        }

        public Criteria andCablePerforationNotBetween(Double value1, Double value2) {
            addCriterion("cable_perforation not between", value1, value2, "cablePerforation");
            return (Criteria) this;
        }

        public Criteria andOilDeliveryIsNull() {
            addCriterion("oil_delivery is null");
            return (Criteria) this;
        }

        public Criteria andOilDeliveryIsNotNull() {
            addCriterion("oil_delivery is not null");
            return (Criteria) this;
        }

        public Criteria andOilDeliveryEqualTo(Double value) {
            addCriterion("oil_delivery =", value, "oilDelivery");
            return (Criteria) this;
        }

        public Criteria andOilDeliveryNotEqualTo(Double value) {
            addCriterion("oil_delivery <>", value, "oilDelivery");
            return (Criteria) this;
        }

        public Criteria andOilDeliveryGreaterThan(Double value) {
            addCriterion("oil_delivery >", value, "oilDelivery");
            return (Criteria) this;
        }

        public Criteria andOilDeliveryGreaterThanOrEqualTo(Double value) {
            addCriterion("oil_delivery >=", value, "oilDelivery");
            return (Criteria) this;
        }

        public Criteria andOilDeliveryLessThan(Double value) {
            addCriterion("oil_delivery <", value, "oilDelivery");
            return (Criteria) this;
        }

        public Criteria andOilDeliveryLessThanOrEqualTo(Double value) {
            addCriterion("oil_delivery <=", value, "oilDelivery");
            return (Criteria) this;
        }

        public Criteria andOilDeliveryIn(List<Double> values) {
            addCriterion("oil_delivery in", values, "oilDelivery");
            return (Criteria) this;
        }

        public Criteria andOilDeliveryNotIn(List<Double> values) {
            addCriterion("oil_delivery not in", values, "oilDelivery");
            return (Criteria) this;
        }

        public Criteria andOilDeliveryBetween(Double value1, Double value2) {
            addCriterion("oil_delivery between", value1, value2, "oilDelivery");
            return (Criteria) this;
        }

        public Criteria andOilDeliveryNotBetween(Double value1, Double value2) {
            addCriterion("oil_delivery not between", value1, value2, "oilDelivery");
            return (Criteria) this;
        }

        public Criteria andBridgePlugIsNull() {
            addCriterion("bridge_plug is null");
            return (Criteria) this;
        }

        public Criteria andBridgePlugIsNotNull() {
            addCriterion("bridge_plug is not null");
            return (Criteria) this;
        }

        public Criteria andBridgePlugEqualTo(Integer value) {
            addCriterion("bridge_plug =", value, "bridgePlug");
            return (Criteria) this;
        }

        public Criteria andBridgePlugNotEqualTo(Integer value) {
            addCriterion("bridge_plug <>", value, "bridgePlug");
            return (Criteria) this;
        }

        public Criteria andBridgePlugGreaterThan(Integer value) {
            addCriterion("bridge_plug >", value, "bridgePlug");
            return (Criteria) this;
        }

        public Criteria andBridgePlugGreaterThanOrEqualTo(Integer value) {
            addCriterion("bridge_plug >=", value, "bridgePlug");
            return (Criteria) this;
        }

        public Criteria andBridgePlugLessThan(Integer value) {
            addCriterion("bridge_plug <", value, "bridgePlug");
            return (Criteria) this;
        }

        public Criteria andBridgePlugLessThanOrEqualTo(Integer value) {
            addCriterion("bridge_plug <=", value, "bridgePlug");
            return (Criteria) this;
        }

        public Criteria andBridgePlugIn(List<Integer> values) {
            addCriterion("bridge_plug in", values, "bridgePlug");
            return (Criteria) this;
        }

        public Criteria andBridgePlugNotIn(List<Integer> values) {
            addCriterion("bridge_plug not in", values, "bridgePlug");
            return (Criteria) this;
        }

        public Criteria andBridgePlugBetween(Integer value1, Integer value2) {
            addCriterion("bridge_plug between", value1, value2, "bridgePlug");
            return (Criteria) this;
        }

        public Criteria andBridgePlugNotBetween(Integer value1, Integer value2) {
            addCriterion("bridge_plug not between", value1, value2, "bridgePlug");
            return (Criteria) this;
        }

        public Criteria andAshesIsNull() {
            addCriterion("ashes is null");
            return (Criteria) this;
        }

        public Criteria andAshesIsNotNull() {
            addCriterion("ashes is not null");
            return (Criteria) this;
        }

        public Criteria andAshesEqualTo(Integer value) {
            addCriterion("ashes =", value, "ashes");
            return (Criteria) this;
        }

        public Criteria andAshesNotEqualTo(Integer value) {
            addCriterion("ashes <>", value, "ashes");
            return (Criteria) this;
        }

        public Criteria andAshesGreaterThan(Integer value) {
            addCriterion("ashes >", value, "ashes");
            return (Criteria) this;
        }

        public Criteria andAshesGreaterThanOrEqualTo(Integer value) {
            addCriterion("ashes >=", value, "ashes");
            return (Criteria) this;
        }

        public Criteria andAshesLessThan(Integer value) {
            addCriterion("ashes <", value, "ashes");
            return (Criteria) this;
        }

        public Criteria andAshesLessThanOrEqualTo(Integer value) {
            addCriterion("ashes <=", value, "ashes");
            return (Criteria) this;
        }

        public Criteria andAshesIn(List<Integer> values) {
            addCriterion("ashes in", values, "ashes");
            return (Criteria) this;
        }

        public Criteria andAshesNotIn(List<Integer> values) {
            addCriterion("ashes not in", values, "ashes");
            return (Criteria) this;
        }

        public Criteria andAshesBetween(Integer value1, Integer value2) {
            addCriterion("ashes between", value1, value2, "ashes");
            return (Criteria) this;
        }

        public Criteria andAshesNotBetween(Integer value1, Integer value2) {
            addCriterion("ashes not between", value1, value2, "ashes");
            return (Criteria) this;
        }

        public Criteria andTubingCuttingIsNull() {
            addCriterion("tubing_cutting is null");
            return (Criteria) this;
        }

        public Criteria andTubingCuttingIsNotNull() {
            addCriterion("tubing_cutting is not null");
            return (Criteria) this;
        }

        public Criteria andTubingCuttingEqualTo(Integer value) {
            addCriterion("tubing_cutting =", value, "tubingCutting");
            return (Criteria) this;
        }

        public Criteria andTubingCuttingNotEqualTo(Integer value) {
            addCriterion("tubing_cutting <>", value, "tubingCutting");
            return (Criteria) this;
        }

        public Criteria andTubingCuttingGreaterThan(Integer value) {
            addCriterion("tubing_cutting >", value, "tubingCutting");
            return (Criteria) this;
        }

        public Criteria andTubingCuttingGreaterThanOrEqualTo(Integer value) {
            addCriterion("tubing_cutting >=", value, "tubingCutting");
            return (Criteria) this;
        }

        public Criteria andTubingCuttingLessThan(Integer value) {
            addCriterion("tubing_cutting <", value, "tubingCutting");
            return (Criteria) this;
        }

        public Criteria andTubingCuttingLessThanOrEqualTo(Integer value) {
            addCriterion("tubing_cutting <=", value, "tubingCutting");
            return (Criteria) this;
        }

        public Criteria andTubingCuttingIn(List<Integer> values) {
            addCriterion("tubing_cutting in", values, "tubingCutting");
            return (Criteria) this;
        }

        public Criteria andTubingCuttingNotIn(List<Integer> values) {
            addCriterion("tubing_cutting not in", values, "tubingCutting");
            return (Criteria) this;
        }

        public Criteria andTubingCuttingBetween(Integer value1, Integer value2) {
            addCriterion("tubing_cutting between", value1, value2, "tubingCutting");
            return (Criteria) this;
        }

        public Criteria andTubingCuttingNotBetween(Integer value1, Integer value2) {
            addCriterion("tubing_cutting not between", value1, value2, "tubingCutting");
            return (Criteria) this;
        }

        public Criteria andPunchingIsNull() {
            addCriterion("punching is null");
            return (Criteria) this;
        }

        public Criteria andPunchingIsNotNull() {
            addCriterion("punching is not null");
            return (Criteria) this;
        }

        public Criteria andPunchingEqualTo(Integer value) {
            addCriterion("punching =", value, "punching");
            return (Criteria) this;
        }

        public Criteria andPunchingNotEqualTo(Integer value) {
            addCriterion("punching <>", value, "punching");
            return (Criteria) this;
        }

        public Criteria andPunchingGreaterThan(Integer value) {
            addCriterion("punching >", value, "punching");
            return (Criteria) this;
        }

        public Criteria andPunchingGreaterThanOrEqualTo(Integer value) {
            addCriterion("punching >=", value, "punching");
            return (Criteria) this;
        }

        public Criteria andPunchingLessThan(Integer value) {
            addCriterion("punching <", value, "punching");
            return (Criteria) this;
        }

        public Criteria andPunchingLessThanOrEqualTo(Integer value) {
            addCriterion("punching <=", value, "punching");
            return (Criteria) this;
        }

        public Criteria andPunchingIn(List<Integer> values) {
            addCriterion("punching in", values, "punching");
            return (Criteria) this;
        }

        public Criteria andPunchingNotIn(List<Integer> values) {
            addCriterion("punching not in", values, "punching");
            return (Criteria) this;
        }

        public Criteria andPunchingBetween(Integer value1, Integer value2) {
            addCriterion("punching between", value1, value2, "punching");
            return (Criteria) this;
        }

        public Criteria andPunchingNotBetween(Integer value1, Integer value2) {
            addCriterion("punching not between", value1, value2, "punching");
            return (Criteria) this;
        }

        public Criteria andEngineeringIsNull() {
            addCriterion("engineering is null");
            return (Criteria) this;
        }

        public Criteria andEngineeringIsNotNull() {
            addCriterion("engineering is not null");
            return (Criteria) this;
        }

        public Criteria andEngineeringEqualTo(Integer value) {
            addCriterion("engineering =", value, "engineering");
            return (Criteria) this;
        }

        public Criteria andEngineeringNotEqualTo(Integer value) {
            addCriterion("engineering <>", value, "engineering");
            return (Criteria) this;
        }

        public Criteria andEngineeringGreaterThan(Integer value) {
            addCriterion("engineering >", value, "engineering");
            return (Criteria) this;
        }

        public Criteria andEngineeringGreaterThanOrEqualTo(Integer value) {
            addCriterion("engineering >=", value, "engineering");
            return (Criteria) this;
        }

        public Criteria andEngineeringLessThan(Integer value) {
            addCriterion("engineering <", value, "engineering");
            return (Criteria) this;
        }

        public Criteria andEngineeringLessThanOrEqualTo(Integer value) {
            addCriterion("engineering <=", value, "engineering");
            return (Criteria) this;
        }

        public Criteria andEngineeringIn(List<Integer> values) {
            addCriterion("engineering in", values, "engineering");
            return (Criteria) this;
        }

        public Criteria andEngineeringNotIn(List<Integer> values) {
            addCriterion("engineering not in", values, "engineering");
            return (Criteria) this;
        }

        public Criteria andEngineeringBetween(Integer value1, Integer value2) {
            addCriterion("engineering between", value1, value2, "engineering");
            return (Criteria) this;
        }

        public Criteria andEngineeringNotBetween(Integer value1, Integer value2) {
            addCriterion("engineering not between", value1, value2, "engineering");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table perforation
     *
     * @mbg.generated do_not_delete_during_merge Tue Jul 30 21:22:56 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
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