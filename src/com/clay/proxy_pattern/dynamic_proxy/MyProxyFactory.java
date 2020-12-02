package com.clay.proxy_pattern.dynamic_proxy;

import java.lang.reflect.Proxy;

public class MyProxyFactory {
    public static Object getProxy(Object target) {
        MyInvocationHandle handle = new MyInvocationHandle();
        handle.setTarget(target);
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handle);
        return proxy;
    }
}
