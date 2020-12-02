package com.clay.proxy_pattern.static_proxy;

public class Proxy implements  Subject {

    private Subject realSubject;

    public Proxy (Subject subject) {
        this.realSubject = subject;
    }

    private void preRequest () {
        System.out.println("请求接口前——处理数据...");
    }

    @Override
    public void request() {
        preRequest();
        realSubject.request();
        afterRequest();
    }

    private void afterRequest () {
        System.out.println("请求接口后——处理数据...");
    }
}
