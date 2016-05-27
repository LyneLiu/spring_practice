package com.spring_practice.config.stereo_autoconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by nn_liu on 2016/5/27.
 * 在不使用配置文件的情况下，需要使用@Configuration和@ComponentScan启动Spring的注解扫描
 * Note：
 * 1、@ComponentScan注解默认扫描的范围是当前package和其子package！
 * 2、通过参数为其指定扫描范围,并且可以指定多个package
 * 3、通过basePackageClasses扫描定义组件Bean的Class,可能会存在Class依赖的问题
 */

@Configuration
//@ComponentScan("com.spring_practice.config.stereo_autoconfig")
//@ComponentScan(basePackages = "com.spring_practice.config.stereo_autoconfig")
@ComponentScan(basePackageClasses = {Firework.class,SgtPeppers.class})
public class CDPlayerConfig {

}