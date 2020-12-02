package com.clay.proxy_pattern.dynamic_proxy;

public class GunDog implements IDog {
    @Override
    public void run() {
        System.out.println("猎狗在跑");
    }
}
