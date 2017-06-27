package com.coffeeCodes.mybatis.generator.thymeleaf.server.controller;

import groovy.util.logging.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ChangSheng on 2017/6/26 16:55.
 */
@RestController
@Slf4j
public class ThymeleafController {

    @RequestMapping(value = "/thymeleaf/mybatis/generator" , method = RequestMethod.POST)
    public void generatorMybatis() {

    }
}
