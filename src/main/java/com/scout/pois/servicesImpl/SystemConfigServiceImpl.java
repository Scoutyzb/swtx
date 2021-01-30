package com.scout.pois.servicesImpl;

import com.scout.pois.services.SystemConfigService;
import com.scout.pois.util.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;

/**
 * @author:Scout
 * @data:2021/1/21
 * @description:
 */
@Service
public class SystemConfigServiceImpl implements SystemConfigService {
    @Autowired
    private RedisService redisService;

    @Override
    public boolean setParam(String paramname,String value){
        String key = "Param_" + paramname;

        return StringUtils.isNumeric(value)&&redisService.set(key,value);
    }

    @Override
    public int getParam(String paramname){
        String key = "Param_" + paramname;
        int result = Integer.parseInt((String)redisService.get(key));
        return result;
    }

}
