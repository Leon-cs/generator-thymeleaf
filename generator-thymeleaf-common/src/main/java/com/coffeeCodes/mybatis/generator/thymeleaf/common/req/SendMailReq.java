package com.coffeeCodes.mybatis.generator.thymeleaf.common.req;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

/**
 * Created by ChangSheng on 2017/6/29 15:24.
 */
@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class SendMailReq {

    private String to;

    private String from;

    private String subject;

    private String content;
}
