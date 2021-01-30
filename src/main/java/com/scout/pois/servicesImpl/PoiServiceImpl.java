package com.scout.pois.servicesImpl;

import com.scout.pois.dao.*;
import com.scout.pois.entity.*;
import com.scout.pois.mybatis.MyBatisSqlSessionFactory;
import com.scout.pois.services.PoiService;
import com.scout.pois.util.util;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author:Scout
 * @data:2021/1/24
 * @description:
 */
@Service
public class PoiServiceImpl implements PoiService {

    @Autowired
    private Poi14yearExample poi14yearExample;
    private Poi14yearExample.Criteria criteria14;

    @Autowired
    private Poi15yearExample poi15yearExample;
    private Poi15yearExample.Criteria criteria15;

    @Autowired
    private Poi16yearExample poi16yearExample;
    private Poi16yearExample.Criteria criteria16;

    @Autowired
    private Poi17yearExample poi17yearExample;
    private Poi17yearExample.Criteria criteria17;

    @Autowired
    private Poi18yearExample poi18yearExample;
    private Poi18yearExample.Criteria criteria18;

    @Autowired
    private Poi19yearExample poi19yearExample;
    private Poi19yearExample.Criteria criteria19;

    @PostConstruct
    @Override
    public void initPoiServiceImpl(){
        criteria14 = poi14yearExample.createCriteria();
        criteria15 = poi15yearExample.createCriteria();
        criteria16 = poi16yearExample.createCriteria();
        criteria17 = poi17yearExample.createCriteria();
        criteria18 = poi18yearExample.createCriteria();
        criteria19 = poi19yearExample.createCriteria();
    }


    @Override
    public List<Poi> getNeighborPois(Position position,double radius,int year) {
        double maxx = position.getX()+ Math.abs(util.metertox(radius));
        double minx = position.getX()- Math.abs(util.metertox(radius));
        double maxy = position.getY()+ Math.abs(util.metertoy(radius));
        double miny = position.getY()- Math.abs(util.metertoy(radius));


        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        List<? extends Poi> result = null;
        switch (year){
            case 14:
                criteria14.andLongitudeBetween(minx,maxx).andLatitudeBetween(miny,maxy);;
                result = sqlSession.getMapper(Poi14yearMapper.class).selectByExample(poi14yearExample);
                poi14yearExample.clear();
                criteria14 = poi14yearExample.createCriteria();
                break;
            case 15:
                criteria15.andLongitudeBetween(minx,maxx).andLatitudeBetween(miny,maxy);;
                result = sqlSession.getMapper(Poi15yearMapper.class).selectByExample(poi15yearExample);
                poi15yearExample.clear();
                criteria15=poi15yearExample.createCriteria();
                break;
            case 16:
                criteria16.andLongitudeBetween(minx,maxx).andLatitudeBetween(miny,maxy);;
                result = sqlSession.getMapper(Poi16yearMapper.class).selectByExample(poi16yearExample);
                poi16yearExample.clear();
                criteria16=poi16yearExample.createCriteria();
                break;
            case 17:
                criteria17.andLongitudeBetween(minx,maxx).andLatitudeBetween(miny,maxy);;
                result = sqlSession.getMapper(Poi17yearMapper.class).selectByExample(poi17yearExample);
                poi17yearExample.clear();
                criteria17=poi17yearExample.createCriteria();
                break;
            case 18:
                criteria18.andLongitudeBetween(minx,maxx).andLatitudeBetween(miny,maxy);;
                result= sqlSession.getMapper(Poi18yearMapper.class).selectByExample(poi18yearExample);
                poi18yearExample.clear();
                criteria18=poi18yearExample.createCriteria();
                break;
            case 19:
                criteria19.andLongitudeBetween(minx,maxx).andLatitudeBetween(miny,maxy);;
                result = sqlSession.getMapper(Poi19yearMapper.class).selectByExample(poi19yearExample);
                poi19yearExample.clear();
                criteria19=poi19yearExample.createCriteria();
                break;
            default:
                return null;

        }
        List<Poi> res = new ArrayList<>();
        for(Poi poi:result){
            poi.setPosition();
            if(util.caldis(poi.getPosition(),position)<=radius) {
                res.add(poi);
            }
        }

        return res;

    }

    @Override
    public List<Poi> getNeighborPois(Poi center,double radius,int year) {
        center.setPosition();
        return getNeighborPois(center.getPosition(),radius, year);
    }

    @Override
    public Poi getPoi(String pid) {
        return null;
    }

    @Override
    public List<Poi> getPois(Position position, int year) {
        if(year<14||year>19) {
            return null;
        }
        return null;
    }

}
