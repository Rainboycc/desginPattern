package com.clay.decorator_pattern;

public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    private void addBehavior() {
        System.out.println("地秀");
    }

    @Override
    public void operation() {
        addBehavior();
        super.operation();
    }
}
