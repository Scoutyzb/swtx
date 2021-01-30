package com.scout.pois.util;

import com.scout.pois.entity.Poi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author:Scout
 * @data:2021/1/25
 * @description:
 */
public final class PoiType {


    private static List<String> Traffic = Collections.singletonList("客货运输");
    private static List<String> Education = Arrays.asList("教育、文化","科研机构及附属机构");
    private static List<String> Entertainment = Collections.singletonList("运动、休闲");
    private static List<String> Hospital = Collections.singletonList("卫生、社保");

    private static List<String> Commerical = Arrays.asList("商业设施、商务服务","工业园","餐饮","金融、保险","农、林、牧、渔服务业","批发、零售","汽车销售及服务","商业设施、商务服务","商业性住宿");
    private static List<String> Industry = Arrays.asList("厂矿","农、林、牧、渔生产");
    private static List<String> House = Collections.singletonList("居民住宿");


    public enum AreaType{
        Commerical,Industry,House;
    }
    public enum LifeType{
        Education,Traffic,Entertainment,Hospital;
    }

    public static LifeType getLifeType(Poi poi){
        if(Traffic.contains(poi.getClassname())||Traffic.contains(poi.getKindname())||Traffic.contains(poi.getSubclassname())){
            return LifeType.Traffic;
        }
        if(Education.contains(poi.getClassname())||Education.contains(poi.getKindname())||Education.contains(poi.getSubclassname())){
            return LifeType.Education;
        }
        if(Entertainment.contains(poi.getClassname())||Entertainment.contains(poi.getKindname())||Entertainment.contains(poi.getSubclassname())){
            return LifeType.Entertainment;
        }
        if(Hospital.contains(poi.getClassname())||Hospital.contains(poi.getKindname())||Hospital.contains(poi.getSubclassname())){
            return LifeType.Hospital;
        }
        return null;
    }


    public static AreaType getAreaType(Poi poi){
        if(Commerical.contains(poi.getClassname())||Commerical.contains(poi.getKindname())||Commerical.contains(poi.getSubclassname())){
            return AreaType.Commerical;
        }
        if(Industry.contains(poi.getClassname())||Industry.contains(poi.getKindname())||Industry.contains(poi.getSubclassname())){
            return AreaType.Industry;
        }
        if(House.contains(poi.getClassname())||House.contains(poi.getKindname())||House.contains(poi.getSubclassname())){
            return AreaType.House;
        }
        return null;
    }


}
