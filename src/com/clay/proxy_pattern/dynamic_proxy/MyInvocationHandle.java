package com.clay.proxy_pattern.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandle implements InvocationHandler {

    private Object target;

    public void setTarget (Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        DogUtils.method1();
        method.invoke(target, args);
        DogUtils.method2();
        return null;
    }
}
