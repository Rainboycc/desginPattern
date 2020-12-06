package com.clay.state_pattern;

public class Dead extends ThreadState {
    public Dead() {
        state = "死亡状态";
        System.out.println("当前线程处于：死亡状态.");
    }
}
