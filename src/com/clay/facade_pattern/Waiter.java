package com.clay.facade_pattern;

public class Waiter {
    private Cup cup;
    private Tea tea;
    private Water water;
    public Waiter () {
        this.cup = new Cup();
        this.tea = new Tea();
        this.water = new Water();
    }

    public void drawTea () {
        Object lock = new Object();
        Thread waterThread = new Thread(() -> {
            water.boilingWater();
            synchronized (lock) {
                lock.notify();
            }
        });
        waterThread.start();
        tea.getTea();
        cup.getCup();
        try {
            synchronized (lock) {
                lock.wait();
            }
            System.out.println("开始泡茶");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("一杯浓茶泡好了");
        System.out.println("给大佬递上一杯热茶..");
    }
}
