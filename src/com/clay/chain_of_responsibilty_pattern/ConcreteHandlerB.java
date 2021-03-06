package com.clay.chain_of_responsibilty_pattern;

public class ConcreteHandlerB extends Handler {
    @Override
    public void handle(int i) {
        if (i <= 3) {
            System.out.println(this.getClass().getName() + "处理了" + i);
        } else {
            if (this.getNext() != null) {
                this.getNext().handle(i);
            } else {
                System.out.println("没有人处理该问题");
            }
        }
    }
}
