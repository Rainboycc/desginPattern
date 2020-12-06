package com.clay.chain_of_responsibilty_pattern;

public abstract class Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }

    public abstract void handle(int i);
}
