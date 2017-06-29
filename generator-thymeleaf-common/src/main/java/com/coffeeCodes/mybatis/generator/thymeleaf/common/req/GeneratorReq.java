package com.coffeeCodes.mybatis.generator.thymeleaf.common.req;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

/**
 * Created by ChangSheng on 2017/6/28 14:27.
 */
@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class GeneratorReq {
    private String connection;

    private String database;

    private String port;

    private String userId;

    private String userPass;

    private String modelPath;

    private String mappingPath;

    private String daoPath;

    private String buildPath;

    private String[] tableNames;

    private String[] modelNames;

    private String isHump;
}
