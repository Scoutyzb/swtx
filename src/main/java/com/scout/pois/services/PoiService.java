package com.scout.pois.services;

import com.scout.pois.entity.Poi;
import com.scout.pois.entity.Poi16year;
import com.scout.pois.entity.Position;
import com.scout.pois.entity.Value;

import java.util.List;

/**
 * @author:Scout
 * @data:2021/1/21
 * @description:
 */
public interface PoiService {


    public List<Poi> getPois(Position position, int year);
    public List<Poi> getNeighborPois(Position position,double radius,int year);
    public List<Poi> getNeighborPois(Poi center,double radius,int year);
    public Poi getPoi(String pid);

    public void initPoiServiceImpl();


}
