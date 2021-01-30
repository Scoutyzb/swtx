package com.scout.pois.util;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class redisServiceTest {
    @Autowired
    RedisService rs;
    @Test
    void get() {
        String s = "Param_"+"potPoiChange";
        String s1 = (String)rs.get(s);
        System.out.println(s1);
    }
    @Test
    void exist(){
        String s = "Param_"+"potPoiChange";
        assert (rs.exists(s));

    }
}