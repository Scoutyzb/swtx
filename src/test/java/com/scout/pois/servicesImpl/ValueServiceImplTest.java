package com.scout.pois.servicesImpl;

import com.scout.pois.entity.Constants;
import com.scout.pois.entity.Position;
import com.scout.pois.entity.Value;
import com.scout.pois.services.ValueService;
import com.scout.pois.util.Cal_sta;
import com.scout.pois.util.util;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;


import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ValueServiceImplTest {

    @Autowired
    ValueService valueService;

    @Test
    void getValue() {
//        +
        for(int i = 0;i<1;i++){
//            Position p = new Position(getRandomnumber(108.94711, 109.03044), getRandomnumber(34.23528, 34.29646));
            Position p= new Position(Constants.avelongitude,Constants.avelatitude);
            System.out.println(util.gcj02ToBd09(p));
            Value value = valueService.getValue(p,19);
            System.out.println(value);
        }

    }

    @Test
    void getEF(){
//        double[] commericalPowerIndex = new double[50000];
//        double[] industryPowerIndex = new double[50000];
//        double[] housePowerIndex = new double[50000];
//        double[] trafficLifeIndex = new double[50000];
//        double[] educationLifeIndex = new double[50000];
//        double[] entainmentLifeIndex = new double[50000];
//        double[] hospitalLifeIndex = new double[50000];
        double[] asc = new double[10000];

        Date starttime = new Date();
        for(int i = 0; i<1000; i++) {

            Position p = new Position(getRandomnumber(108.94711, 109.03044), getRandomnumber(34.23528, 34.29646));

            Value value = valueService.getValue(p,19);

            if(i%50==0) {
                System.out.println("Have Cal " + i + " Data");
                Date date = new Date();
                System.out.println((date.getTime()-starttime.getTime())/1000);
            }
//            commericalPowerIndex[i] = value.getCommericalPowerIndex();
//            industryPowerIndex[i] = value.getIndustryPowerIndex();
//            housePowerIndex[i] = value.getHousePowerIndex();
//            trafficLifeIndex[i] = value.getTrafficLifeIndex();
//            educationLifeIndex[i] = value.getEducationLifeIndex();
//            entainmentLifeIndex[i] = value.getEntainmentLifeIndex();
//            hospitalLifeIndex[i] = value.getHospitalLifeIndex();
            asc[i] = value.getPoiascPotIndex();
        }

//        System.out.println("commericalPowerIndex");
//        System.out.println("avg="+Cal_sta.Mean(commericalPowerIndex)+"std="+Cal_sta.POP_STD_dev(commericalPowerIndex));
//        System.out.println("industryPowerIndex");
//        System.out.println("avg="+Cal_sta.Mean(industryPowerIndex)+"std="+Cal_sta.POP_STD_dev(industryPowerIndex));
//        System.out.println("housePowerIndex");
//        System.out.println("avg="+Cal_sta.Mean(housePowerIndex)+"std="+Cal_sta.POP_STD_dev(housePowerIndex));
//        System.out.println("trafficLifeIndex");
//        System.out.println("avg="+Cal_sta.Mean(trafficLifeIndex)+"std="+Cal_sta.POP_STD_dev(trafficLifeIndex));
//        System.out.println("educationLifeIndex");
//        System.out.println("avg="+Cal_sta.Mean(educationLifeIndex)+"std="+Cal_sta.POP_STD_dev(educationLifeIndex));
//        System.out.println("entainmentLifeIndex");
//        System.out.println("avg="+Cal_sta.Mean(entainmentLifeIndex)+"std="+Cal_sta.POP_STD_dev(entainmentLifeIndex));
//        System.out.println("hospitalLifeIndex");
//        System.out.println("avg="+Cal_sta.Mean(hospitalLifeIndex)+"std="+Cal_sta.POP_STD_dev(hospitalLifeIndex));
        System.out.println("avg="+Cal_sta.Mean(asc)+"std="+Cal_sta.POP_STD_dev(asc));


    }

    double getRandomnumber(double low,double high){
        return low+(high-low)*Math.random();
    }
}