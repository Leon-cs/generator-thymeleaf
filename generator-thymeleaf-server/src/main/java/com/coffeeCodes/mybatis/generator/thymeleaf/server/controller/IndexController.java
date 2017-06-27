package com.coffeeCodes.mybatis.generator.thymeleaf.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ChangSheng on 2017/6/27 11:41.
 */
@Controller
public class IndexController {

    @RequestMapping(value = {"/" , "index"})
    public String index() {
        return "index";
    }
}