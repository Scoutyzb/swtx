package com.scout.pois.mybatis;

import com.scout.pois.dao.Poi16yearMapper;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class MyBatisSqlSessionFactoryTest {



    @Test
    void getSqlSession() {
        assertNotNull(MyBatisSqlSessionFactory.getSqlSession());
    }
}