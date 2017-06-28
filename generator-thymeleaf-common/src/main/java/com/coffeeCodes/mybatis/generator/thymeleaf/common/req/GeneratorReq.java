package com.coffeeCodes.mybatis.generator.thymeleaf.common.req;

import lombok.Data;

/**
 * Created by ChangSheng on 2017/6/28 14:27.
 */
@Data
public class GeneratorReq {
    private String connection;

    private String dataBase;

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
