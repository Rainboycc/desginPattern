package com.clay.proxy_pattern.dynamic_proxy;

/**
 * 动态代理
 * 代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能使用动态代理，因此这也算是这种方式的缺陷。
 * 动态代理是一种较为高级的代理模式，它的典型应用就是Spring AOP。
 * 在传统的代理模式中，客户端通过Proxy调用RealSubject类的request()方法，同时还在代理类中封装了其他方法(如preRequest()和postRequest())，可以处理一些其他问题。
 * 如果按照这种方法使用代理模式，那么真实主题角色必须是事先已经存在的，并将其作为代理对象的内部成员属性。
 * 如果一个真实主题角色必须对应一个代理主题角色，这将导致系统中的类个数急剧增加，因此需要想办法减少系统中类的个数，此外，如何在事先不知道真实主题角色的情况下使用代理主题角色，这都是动态代理需要解决的问题。
 */
public class Client {
    public static void main(String[] args) {
        IDog dog = new GunDog();
        IDog proxy =(IDog) MyProxyFactory.getProxy(dog);
        proxy.run();
    }
}
