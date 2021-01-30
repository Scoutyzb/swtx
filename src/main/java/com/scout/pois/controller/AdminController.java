package com.scout.pois.controller;

import com.scout.pois.entity.Position;
import com.scout.pois.entity.Value;
import com.scout.pois.entity.WeightConfig;
import com.scout.pois.services.SystemConfigService;

import com.scout.pois.services.ValueService;
import com.scout.pois.util.util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


/**
 * @author:Scout
 * @data:2021/1/23
 * @description:
 */

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private SystemConfigService systemConfigService;

    @ResponseBody
    @RequestMapping(value = "/config",method = RequestMethod.POST)
    public WeightConfig setParams(WeightConfig weightConfig) {
        Class sysConfig = weightConfig.getClass();
        Field[] fields = sysConfig.getDeclaredFields();
        for (Field field : fields) {
            try {
                String varName = field.getName();
                PropertyDescriptor pd = new PropertyDescriptor(varName, sysConfig);
                Method getMethod = pd.getReadMethod();
                int value = (int) getMethod.invoke(weightConfig);
                systemConfigService.setParam(varName, String.valueOf(value));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        return weightConfig;
    }







}
