//package com.scout.pois;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.test.context.junit4.SpringRunner;
//
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class TestApplicationTests {
//
//    @Resource
//    private JdbcTemplate jdbcTemplate;
//
//    @Test
//    public void contextLoads() {
//        String sql = "select * from 16sum";
//        List<sum> userList = (List<sum>) jdbcTemplate.query(sql, new RowMapper<sum>() {
//
//            @Override
//            public sum mapRow(ResultSet rs, int rowNum) throws SQLException {
//                sum user = new sum();
//                user.setPID(rs.getString("pid"));
//                user.setName(rs.getString("name"));
//                user.setState(rs.getString("state"));
//                return user;
//            }
//
//        });
//        System.out.println("查询成功");
//        for (sum user : userList) {
//            System.out.println(user);
//        }
//    }
//
//}