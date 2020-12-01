package com.clay.facade_pattern;

public class Tea {
    public void getTea () {
        System.out.println("取茶叶");
        System.out.println("挑选茶叶");
        try {
            Thread.sleep(1000);
            System.out.println("茶叶选好了..");
        } catch (InterruptedException e) {
            System.out.println("没有茶叶了..");
            e.printStackTrace();
        }
    }
}
