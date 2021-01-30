package com.scout.pois.factory;

import com.scout.pois.entity.Poi;
import com.scout.pois.mybatis.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author:Scout
 * @data:2021/1/25
 * @description:
 */


public class MapperFactory {



    private SqlSession sqlSession;

    public MapperFactory(){
        sqlSession = MyBatisSqlSessionFactory.getSqlSession();
    }
    public List<Poi> execOperate(Object example,int year){
        switch (year){

            default:
                return null;
        }
    }


}
