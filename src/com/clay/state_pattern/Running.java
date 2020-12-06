package com.clay.state_pattern;

public class Running extends ThreadState {
    public Running () {
        state = "运行状态";
        System.out.printf("当前状态处于运行状态");
    }
    public void suspend (ThreadContext context) {
        System.out.print("调用suspend()方法-->");
        if (state.equals("运行状态")) {
            // 设置当前状态为就绪
            context.setState(new Blocked());
        } else {
            System.out.println("当前线程不是运行状态，不能调用suspend()方法.");
        }
    }

    public void stop (ThreadContext context) {
        System.out.print("调用stop()方法-->");
        if (state.equals("运行状态")) {
            // 设置当前状态为就绪
            context.setState(new Dead());
        } else {
            System.out.println("当前线程不是运行状态，不能调用stop()方法.");
        }
    }
}
