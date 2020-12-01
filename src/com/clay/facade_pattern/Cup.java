package com.clay.facade_pattern;

public class Cup {
    public void getCup () {
        System.out.println("取茶杯");
        System.out.println("开始洗茶杯..");
        try {
            Thread.sleep(2000);
            System.out.println("茶杯洗好了..");
        } catch (InterruptedException e) {
            System.out.println("茶杯洗碎了..");
            e.printStackTrace();
        }
    }
}
