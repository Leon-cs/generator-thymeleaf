package com.coffeeCodes.mybatis.generator.thymeleaf.server.controller;

import com.coffeeCodes.mybatis.generator.thymeleaf.common.Constants;
import com.coffeeCodes.mybatis.generator.thymeleaf.common.req.SendMailReq;
import com.coffeeCodes.mybatis.generator.thymeleaf.server.service.interfaces.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by ChangSheng on 2017/6/29 14:38.
 */
@RestController
@RequestMapping(Constants.BASE_PATH)
public class MailController {
    @Autowired
    private IMailService mailService;

    @RequestMapping(value = "/thymeleaf/mails" , method = RequestMethod.POST)
    public void sendMail(@RequestBody SendMailReq sendMailReq) {
        mailService.sendMail(sendMailReq.getTo() , sendMailReq.getFrom() , sendMailReq.getSubject() , sendMailReq.getContent());
    }

}
