package com.scout.pois.servicesImpl;

import com.scout.pois.entity.Poi;
import com.scout.pois.entity.Position;
import com.scout.pois.services.PoiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PoiServiceImplTest {

    @Autowired
    PoiService poiService;

    @Test
    void getNeighborPois() {
        Position p = new Position(108.98197231298838,34.269);
        poiService.initPoiServiceImpl();
        List<Poi> poiList = poiService.getNeighborPois(p,500,14);


    }
}