package com.scout.pois.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;



@SpringBootTest
@AutoConfigureMockMvc
class JumperControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void configJump() throws Exception {
         String response = mockMvc.perform(MockMvcRequestBuilders.get("/configSetting"))
                 .andExpect(MockMvcResultMatchers.status().isOk())
                 .andDo(MockMvcResultHandlers.print()).andReturn().getResponse().getContentAsString();
        //        String response = mockMvc.perform(MockMvcRequestBuilders
//                .get("/freemaker/test")
//                // 设置返回值类型为utf-8，否则默认为ISO-8859-1
//                .accept(MediaType.APPLICATION_JSON_UTF8_VALUE)
//                .param("name", "Tom"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andDo(MockMvcResultHandlers.print()).andReturn().getResponse().getContentAsString();
        System.out.println(response);
    }
}