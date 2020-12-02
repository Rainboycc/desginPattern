package com.clay.proxy_pattern.static_proxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("请求接口");
    }
}
