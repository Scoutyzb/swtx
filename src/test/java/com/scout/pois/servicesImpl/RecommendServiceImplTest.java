package com.scout.pois.servicesImpl;

import com.scout.pois.entity.Dp;
import com.scout.pois.entity.Poi;
import com.scout.pois.entity.Position;
import com.scout.pois.services.RecommendService;
import com.scout.pois.util.util;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RecommendServiceImplTest {

    @Autowired
    RecommendService recommendService;

    @Test
    void getneibor(Position position,int radius) {

//        List<Dp> dps = recommendService.getneibor(new Position(108.948301,34.223445),1000,10);


    }
}