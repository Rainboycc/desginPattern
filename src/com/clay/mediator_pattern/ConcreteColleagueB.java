package com.clay.mediator_pattern;

public class ConcreteColleagueB extends Colleague {
    @Override
    public void receive(String message) {
        System.out.println("具体同事B收到消息:" + message);
    }

    @Override
    public void send(String message) {
        System.out.println("具体同事B发出消息:" + message);
        mediator.relay(this, message);
    }
}
