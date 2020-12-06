package com.clay.state_pattern;

public class Blocked extends  ThreadState {
    public Blocked () {
        state = "阻塞状态";
        System.out.printf("当前状态处于阻塞状态");
    }
    public void resume (ThreadContext context) {
        System.out.print("调用getCPU()方法-->");
        if (state.equals("阻塞状态")) {
            // 设置当前状态为就绪
            context.setState(new Runnable());
        } else {
            System.out.println("当前线程不是就绪状态，不能调用resume()方法.");
        }
    }
}
