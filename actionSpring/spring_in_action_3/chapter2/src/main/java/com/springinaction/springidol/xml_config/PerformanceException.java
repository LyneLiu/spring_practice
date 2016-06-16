package com.springinaction.springidol.xml_config;

/**
 * Created by nn_liu on 2016/6/15.
 */

/**
 * 自定义异常类！
 */
public class PerformanceException extends Exception {

    public PerformanceException(){
        super();
    }

    public PerformanceException(String msg){
        super(msg);
    }
}
