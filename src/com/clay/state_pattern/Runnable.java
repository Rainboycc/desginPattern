package com.clay.state_pattern;

import jdk.nashorn.internal.ir.Block;

public class Runnable extends ThreadState {
    public Runnable () {
        state = "就绪状态";
        System.out.printf("当前状态处于就绪状态");
    }
    public void getCPU (ThreadContext context) {
        System.out.print("调用getCPU()方法-->");
        if (state.equals("就绪状态")) {
            // 设置当前状态为就绪
            context.setState(new Running());
        } else {
            System.out.println("当前线程不是就绪状态，不能调用getCPU()方法.");
        }
    }
}
