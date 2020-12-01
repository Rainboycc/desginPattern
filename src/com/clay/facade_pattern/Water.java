package com.clay.facade_pattern;

public class Water {
    public void boilingWater () {
        System.out.println("开始烧水..");
        try {
            Thread.sleep(5000);
            System.out.println("开水已煮沸..");
        } catch (InterruptedException e) {
            System.out.println("火灭了，无法煮开水..");
            e.printStackTrace();
        }
    }
}
