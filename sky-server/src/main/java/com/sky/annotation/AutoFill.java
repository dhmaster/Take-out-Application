package com.sky.annotation;

import com.sky.enumeration.OperationType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，用于标识某个方法需要进行功能字段自动填充处理
 */
// 指定了该注解可以应用的目标类型, ElementType.METHOD 表示该注解可以应用到方法上
@Target(ElementType.METHOD)
// 表示该注解在运行时仍然可用，可以通过反射获取到这个注解以及它的值
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    // 数据库操作类型：UPDATE INSERT
    OperationType value();
}
