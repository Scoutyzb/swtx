package com.scout.pois.controller;


import com.scout.pois.entity.Dp;
import com.scout.pois.entity.Position;
import com.scout.pois.services.RecommendService;
import com.scout.pois.services.ValueService;
import com.scout.pois.util.util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author:Scout
 * @data:2021/1/26
 * @description:
 */
@Controller
@RequestMapping("/fore")
public class ForeController {

    @Autowired
    ValueService valueService;

    @ResponseBody
    @RequestMapping(value = "/value",method = RequestMethod.GET)
    public Map<Integer,Object> valueCalculate(Position position){
        Map<Integer,Object> result = new HashMap<>();
        result.put(0,position.getX());
        result.put(1,position.getY());
        position = util.bd09ToGcj02(position);
        for(int i = 16;i<=19;i++) {
            result.put(i,valueService.getValue(position,i));
        }
        return result;
    }


    @Autowired
    RecommendService recommendService;
    int radius = 500;
    @ResponseBody
    @RequestMapping(value = "/recommend",method = RequestMethod.GET)
    public List<Dp> recommendCalculate(Position position){
        position = util.bd09ToGcj02(position);
        List<Dp> dp = recommendService.getneibor(position,radius);

        for(Dp d : dp){
            Position p1 = new Position(Double.parseDouble(d.getPosx()),Double.parseDouble(d.getPosy()));
            Position p2 = util.gcj02ToBd09(p1);
            d.setPosx(String.valueOf(p2.getX()));
            d.setPosy(String.valueOf(p2.getY()));
        }
        System.out.println(dp.size());
        return dp;
    }


}
