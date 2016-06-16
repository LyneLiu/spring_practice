package com.springinaction.springidol.static_factory;

/**
 * Created by nn_liu on 2016/6/16.
 */

/*
 * 通过initialization on demand holder的方式创建单例类
 * 只有在getInstance方法调用的时候才会加载内部类！可以保证线程安全！
 *
 */
public class Stage {

    private Stage() {

    }

    public static class StageSingletonHolder {
        static Stage instance = new Stage();
    }

    public static Stage getInstance() {
        return StageSingletonHolder.instance;
    }

}
