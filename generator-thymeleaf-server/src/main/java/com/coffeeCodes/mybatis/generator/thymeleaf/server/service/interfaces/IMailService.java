package com.coffeeCodes.mybatis.generator.thymeleaf.server.service.interfaces;

/**
 * Created by ChangSheng on 2017/6/29 14:41.
 */
public interface IMailService {

    Boolean sendMail(String to , String from , String subject , String content);
}
