package com.scout.pois.entity;

import lombok.Data;

/**
 * @author:Scout
 * @data:2021/1/24
 * @description:
 */

public class Value {
    private double lifeQuality;
    private double areaPower;
    private double areaPotential;

    private double consumePowerIndex;
    private double housepricePowerIndex;
    private double industryPowerIndex;
    private double commericalPowerIndex;
    private double housePowerIndex;

    private double emotionLifeIndex;
    private double trafficLifeIndex;
    private double educationLifeIndex;
    private double entainmentLifeIndex;
    private double hospitalLifeIndex;

    private double poiascPotIndex;
    private double poidesPotIndex;
    private double poichaPotIndex;

    public double getLifeQuality() {
        return lifeQuality;
    }

    public void setLifeQuality(double lifeQuality) {
        this.lifeQuality = lifeQuality;
    }

    public double getAreaPower() {
        return areaPower;
    }

    public void setAreaPower(double areaPower) {
        this.areaPower = areaPower;
    }

    public double getAreaPotential() {
        return areaPotential;
    }

    public void setAreaPotential(double areaPotential) {
        this.areaPotential = areaPotential;
    }

    public double getConsumePowerIndex() {
        return consumePowerIndex;
    }

    public void setConsumePowerIndex(double consumePowerIndex) {
        this.consumePowerIndex = consumePowerIndex;
    }

    public double getHousepricePowerIndex() {
        return housepricePowerIndex;
    }

    public void setHousepricePowerIndex(double housepricePowerIndex) {
        this.housepricePowerIndex = housepricePowerIndex;
    }

    public double getIndustryPowerIndex() {
        return industryPowerIndex;
    }

    public void setIndustryPowerIndex(double industryPowerIndex) {
        this.industryPowerIndex = industryPowerIndex;
    }

    public double getCommericalPowerIndex() {
        return commericalPowerIndex;
    }

    public void setCommericalPowerIndex(double commericalPowerIndex) {
        this.commericalPowerIndex = commericalPowerIndex;
    }

    public double getHousePowerIndex() {
        return housePowerIndex;
    }

    public void setHousePowerIndex(double housePowerIndex) {
        this.housePowerIndex = housePowerIndex;
    }

    public double getEmotionLifeIndex() {
        return emotionLifeIndex;
    }

    public void setEmotionLifeIndex(double emotionLifeIndex) {
        this.emotionLifeIndex = emotionLifeIndex;
    }

    public double getTrafficLifeIndex() {
        return trafficLifeIndex;
    }

    public void setTrafficLifeIndex(double trafficLifeIndex) {
        this.trafficLifeIndex = trafficLifeIndex;
    }

    public double getEducationLifeIndex() {
        return educationLifeIndex;
    }

    public void setEducationLifeIndex(double educationLifeIndex) {
        this.educationLifeIndex = educationLifeIndex;
    }

    public double getEntainmentLifeIndex() {
        return entainmentLifeIndex;
    }

    public void setEntainmentLifeIndex(double entainmentLifeIndex) {
        this.entainmentLifeIndex = entainmentLifeIndex;
    }

    public double getHospitalLifeIndex() {
        return hospitalLifeIndex;
    }

    public void setHospitalLifeIndex(double hospitalLifeIndex) {
        this.hospitalLifeIndex = hospitalLifeIndex;
    }

    public double getPoiascPotIndex() {
        return poiascPotIndex;
    }

    public void setPoiascPotIndex(double poiascPotIndex) {
        this.poiascPotIndex = poiascPotIndex;
    }

    @Override
    public String toString() {
        return "Value{" +
                "lifeQuality=" + lifeQuality +
                ", areaPower=" + areaPower +
                ", areaPotential=" + areaPotential +
                ", consumePowerIndex=" + consumePowerIndex +
                ", housepricePowerIndex=" + housepricePowerIndex +
                ", industryPowerIndex=" + industryPowerIndex +
                ", commericalPowerIndex=" + commericalPowerIndex +
                ", housePowerIndex=" + housePowerIndex +
                ", emotionLifeIndex=" + emotionLifeIndex +
                ", trafficLifeIndex=" + trafficLifeIndex +
                ", educationLifeIndex=" + educationLifeIndex +
                ", entainmentLifeIndex=" + entainmentLifeIndex +
                ", hospitalLifeIndex=" + hospitalLifeIndex +
                ", poiascPotIndex=" + poiascPotIndex +
                ", poidesPotIndex=" + poidesPotIndex +
                ", poichaPotIndex=" + poichaPotIndex +
                '}';
    }

    public double getPoidesPotIndex() {
        return poidesPotIndex;
    }

    public void setPoidesPotIndex(double poidesPotIndex) {
        this.poidesPotIndex = poidesPotIndex;
    }

    public double getPoichaPotIndex() {
        return poichaPotIndex;
    }

    public void setPoichaPotIndex(double poichaPotIndex) {
        this.poichaPotIndex = poichaPotIndex;
    }
}
