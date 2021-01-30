package com.scout.pois.factory;

import com.scout.pois.entity.*;

/**
 * @author:Scout
 * @data:2021/1/25
 * @description:
 */
public final class PoiExampleFactory {
    public Object getExample(int year){
        switch (year){
            case 14:
                return new Poi14yearExample();
            case 15:
                return new Poi15yearExample();
            case 16:
                return new Poi16yearExample();
            case 17:
                return new Poi17yearExample();
            case 18:
                return new Poi18yearExample();
            case 19:
                return new Poi19yearExample();
            default:
                return null;
        }
    }

}
