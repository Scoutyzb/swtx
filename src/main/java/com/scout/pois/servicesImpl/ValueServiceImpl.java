package com.scout.pois.servicesImpl;

import com.scout.pois.entity.Constants;
import com.scout.pois.entity.Poi;
import com.scout.pois.entity.Position;
import com.scout.pois.entity.Value;
import com.scout.pois.services.PoiService;
import com.scout.pois.services.SystemConfigService;
import com.scout.pois.services.ValueService;
import com.scout.pois.util.PoiType;
import freemarker.core.ReturnInstruction;
import gnu.trove.map.hash.TObjectIntHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author:Scout
 * @data:2021/1/25
 * @description:
 */
@Service
public class ValueServiceImpl implements ValueService {

    @Autowired
    PoiService poiService;
    @Autowired
    SystemConfigService systemConfigService;

    private double radius;

    @PostConstruct
    public void setConfig(){
        radius = systemConfigService.getParam("radius");
    }

    @Override
    public Value getValue(Position position,int year) {
        List<Poi> list = poiService.getNeighborPois(position,radius,year);
        Value value = new Value();
        getLifeQuality(value,list);
        getAreaPower(value,list);
        getAreaPotential(value,position,year,list.size());
        calValue(value);
        return value;
    }
    public Value getAreaPotential(Value value,Position position,int year,int nowsize){
        int num = poiService.getNeighborPois(position,radius,year-1).size();
        value.setPoiascPotIndex(Math.exp(((nowsize-num)-Constants.poiascIndexavg)/(Constants.poiascIndexstd*Constants.scale)));
        return value;
    }

    public Value getAreaPower(Value value,List<Poi> list){
        TObjectIntHashMap<PoiType.AreaType> area = new TObjectIntHashMap<PoiType.AreaType>();
        for(Poi poi:list){
            PoiType.AreaType at = PoiType.getAreaType(poi);
            if(at!=null)
                area.adjustOrPutValue(at,1,1);
        }
        value.setCommericalPowerIndex(Math.exp((area.get(PoiType.AreaType.Commerical)- Constants.commericalPowerIndexavg)/(Constants.commericalPowerIndexstd*Constants.scale)));
        value.setHousePowerIndex(Math.exp((area.get(PoiType.AreaType.House)-Constants.housePowerIndexavg)/(Constants.commericalPowerIndexstd*Constants.scale)));
        value.setIndustryPowerIndex(Math.exp((area.get(PoiType.AreaType.Industry)-Constants.industryPowerIndexavg)/(Constants.industryPowerIndexstd*Constants.scale)));
        return value;
    }


    public Value getLifeQuality(Value value,List<Poi> list){
        TObjectIntHashMap<PoiType.LifeType> life = new TObjectIntHashMap<PoiType.LifeType>();
        for(Poi poi:list){
            PoiType.LifeType lt = PoiType.getLifeType(poi);
            if(lt!=null)
                life.adjustOrPutValue(lt,1,1);
        }
        value.setEducationLifeIndex(Math.exp((life.get(PoiType.LifeType.Education)-Constants.educationLifeIndexavg)/(Constants.educationLifeIndexstd*Constants.scale)));
        value.setHospitalLifeIndex(Math.exp((life.get(PoiType.LifeType.Hospital)-Constants.housePowerIndexavg)/(Constants.hospitalLifeIndexstd*Constants.scale)));
        value.setTrafficLifeIndex(Math.exp((life.get(PoiType.LifeType.Traffic)-Constants.trafficLifeIndexavg)/(Constants.trafficLifeIndexstd*Constants.scale)));
        value.setEntainmentLifeIndex(Math.exp((life.get(PoiType.LifeType.Entertainment)-Constants.entainmentLifeIndexavg)/(Constants.entainmentLifeIndexstd*Constants.scale)));
        return value;
    }

    @Override
    public Value getValue(Poi center,int year) {
        return getValue(center.getPosition(),year);
    }



    @Override
    public Value calValue(Value value) {
        value.setLifeQuality(systemConfigService.getParam("lifeEntertainment")*value.getEntainmentLifeIndex()+
                            systemConfigService.getParam("lifeHostpital")*value.getHospitalLifeIndex()+
                            systemConfigService.getParam("lifeEducation")*value.getEducationLifeIndex()+
                            systemConfigService.getParam("lifeEmotion")*value.getEmotionLifeIndex()+
                            systemConfigService.getParam("lifeTraffic")*value.getTrafficLifeIndex());
        value.setAreaPower(systemConfigService.getParam("areaHousePrice")*value.getHousepricePowerIndex()+
                            systemConfigService.getParam("areaHouseArea")*value.getHousePowerIndex()+
                            systemConfigService.getParam("areaIndustryArea")*value.getIndustryPowerIndex()+
                        systemConfigService.getParam("areaCommericalArea")*value.getCommericalPowerIndex());
        value.setAreaPotential(systemConfigService.getParam("potPoiAsc")*value.getPoiascPotIndex()+
                            systemConfigService.getParam("potPoiDes")*value.getPoidesPotIndex()+
                            systemConfigService.getParam("potPoiChange")*value.getPoichaPotIndex());
        return value;
    }
}
