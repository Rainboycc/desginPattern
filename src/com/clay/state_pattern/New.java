package com.clay.state_pattern;

public class New extends ThreadState{
    public New () {
       state = "新建状态";
        System.out.printf("当前状态处于新建状态");
    }
    public void start (ThreadContext context) {
        System.out.print("调用start()方法-->");
        if (state.equals("新建状态")) {
            // 设置当前状态为就绪
            context.setState(new Runnable());
        } else {
            System.out.println("当前线程不是新建状态，不能调用start()方法.");
        }
    }
}
