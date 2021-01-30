package com.scout.pois.servicesImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInterceptor;
import com.scout.pois.dao.DpMapper;
import com.scout.pois.entity.Dp;
import com.scout.pois.entity.DpExample;
import com.scout.pois.entity.Position;
import com.scout.pois.mybatis.MyBatisSqlSessionFactory;
import com.scout.pois.services.RecommendService;
import com.scout.pois.util.util;
import io.lettuce.core.ScriptOutputType;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Scout
 * @data:2021/1/28
 * @description:
 */

@Service
public class RecommendServiceImpl implements RecommendService {


    @Autowired
    DpExample dpExample;

    int pageSize = 10;


    @Override
    public List<Dp> getneibor(Position position,int radius) {
        double maxx = position.getX()+ Math.abs(util.metertox(radius));
        double minx = position.getX()- Math.abs(util.metertox(radius));
        double maxy = position.getY()+ Math.abs(util.metertoy(radius));
        double miny = position.getY()- Math.abs(util.metertoy(radius));
        PageHelper.startPage(1,pageSize);
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        DpExample.Criteria criteria = dpExample.createCriteria();
        criteria.andPosxBetween(String.valueOf(minx),String.valueOf(maxx));
        criteria.andPosyBetween(String.valueOf(miny),String.valueOf(maxy));
        criteria.andDpcountGreaterThan(100);
        //临时代码，种类控制
        criteria.andKind1EqualTo("美食");
        dpExample.setOrderByClause("dpcount DESC");

        DpMapper dpMapper = sqlSession.getMapper(DpMapper.class);
        List<Dp> dps = dpMapper.selectByExample(dpExample);
        List<Dp> res = new ArrayList<>();
        for(Dp dp:dps){
            try {
                Position p = new Position(Double.parseDouble(dp.getPosx()), Double.parseDouble(dp.getPosy()));
                if(util.caldis(p,position)<=radius) {
                    res.add(dp);
                }
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
        }

        for(Dp dp:res){
            dp.setComment(dp.getComment().replaceAll("\n","<br>"));
        }


        return res;
    }
}
