package com.clay.singleton_pattern;

/**
 * 在单例模式的实现过程中，需要注意如下三点：
 *      1、单例类的构造函数为私有；
 *      2、提供一个自身的静态私有成员变量；
 *      3、提供一个公有的静态工厂方法。
 */
public class Singleton {

    // 2.提供一个自身的静态私有成员变量；
    private static Singleton singleton;

    // 1.单例类的构造函数为私有；
    private Singleton () {}

    // 3.提供一个公有的静态工厂方法。
    public static Singleton getInstance () {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void singletonOperation() {
        System.out.println(this.singleton + "---singletonOperation....");
    }
}
