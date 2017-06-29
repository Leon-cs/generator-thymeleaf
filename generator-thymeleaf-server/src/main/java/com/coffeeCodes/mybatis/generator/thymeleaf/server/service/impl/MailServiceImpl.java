package com.coffeeCodes.mybatis.generator.thymeleaf.server.service.impl;

import com.coffeeCodes.mybatis.generator.thymeleaf.server.service.interfaces.IMailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * Created by ChangSheng on 2017/6/29 14:42.
 */
@Service
@Slf4j
public class MailServiceImpl implements IMailService{
    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String mailFrom;

    @Override
    public Boolean sendMail(String to,String from , String subject, String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(mailFrom);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);
        log.info("邮件发送信息:{}" , message);
        try {
            mailSender.send(message);
            log.info("简单邮件已经发送。");
            return true;
        } catch (Exception e) {
            log.error("发送简单邮件时发生异常！", e);
        }
        return false;
    }
}
