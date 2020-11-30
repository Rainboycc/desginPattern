package com.clay.decorator_pattern;

public abstract class Decorator extends  Component {
    private Component component;
    public Decorator (Component component) {
        this.component = component;
    }
    public void operation () {
        this.component.operation();
    }
}
