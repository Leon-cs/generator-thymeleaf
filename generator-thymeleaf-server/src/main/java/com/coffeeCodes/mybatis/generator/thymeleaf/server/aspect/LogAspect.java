package com.coffeeCodes.mybatis.generator.thymeleaf.server.aspect;

import com.google.common.base.Throwables;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import java.util.Arrays;

/**
 * Created by ChangSheng on 2017/6/29 14:47.
 */
@Aspect
@Slf4j
@Component
public class LogAspect {
    @Around("execution(public * com.coffeeCodes.mybatis.generator.thymeleaf.server.controller.*Controller.*(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Long maxTimeInMillis = 1000L;
        long start = System.currentTimeMillis();
        String methodName = joinPoint.getTarget().getClass().getSimpleName() + "." + joinPoint.getSignature().getName();
        log.info("{}开始", methodName);
        boolean var13 = false;
        boolean successFlag = true;
        String errMsg = "成功";
        StringBuilder methodInfo  = new StringBuilder();
        Object e;
        try {
            var13 = true;
            e = joinPoint.proceed();
            methodInfo = new StringBuilder(methodName);
            if(joinPoint.getArgs() != null) {
                methodInfo.append("(").append(Arrays.asList(joinPoint.getArgs())).append(")");
            }
            var13 = false;
        } catch (Throwable var14) {
            log.error("方法{}调用异常", methodInfo.toString());
            successFlag = false;
            errMsg = Throwables.getStackTraceAsString(var14);
            log.error("异常信息:{}", methodInfo.toString());
            throw var14;
        } finally {
            long timeUsed = System.currentTimeMillis() - start;
            if(var13) {
                if(timeUsed > maxTimeInMillis) {
                    log.warn("{}结束, 所花时间: {}ms", methodName, timeUsed);
                }
            }
        }
        long methodInfo1 = System.currentTimeMillis() - start;
        if(methodInfo1 > maxTimeInMillis) {
            log.warn("{}结束, 所花时间: {}ms", methodName, methodInfo1);
        }
        return e;
    }
}