package com.scout.pois;

import com.scout.pois.entity.Position;
import com.scout.pois.mybatis.MyBatisSqlSessionFactory;
import com.scout.pois.util.util;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author:Scout
 * @data:2021/1/21
 * @description:
 */
public class test {



    public static void main(String[] args) {
        Position p = new Position(108.95377,34.27354);
        Position p2 = util.bd09ToGcj02(util.gcj02ToBd09(p));
        System.out.println(p2);

    }
}
