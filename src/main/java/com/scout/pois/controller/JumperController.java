package com.scout.pois.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author:Scout
 * @data:2021/1/24
 * @description:
 */
@Controller

public class JumperController {

    @RequestMapping("/admin")
    public String adminJump(){
        return "admin/index";
    }

    @RequestMapping("/configSetting")
    public String configJump(){
        return "admin/configsetting";
    }

    @RequestMapping("/value")
    public String getValuecal(){ return "fore/valuecal";}


    @RequestMapping("/")
    public String getValuecal2(){ return "fore/valuecal";}

    @RequestMapping("/recommend")
    public String getRecommend(){
        return "fore/recommend";
    }

}
