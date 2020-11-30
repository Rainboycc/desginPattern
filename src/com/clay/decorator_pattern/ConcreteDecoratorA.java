package com.clay.decorator_pattern;

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    private void addBehavior() {
        System.out.println("天秀");
    }

    @Override
    public void operation() {
        super.operation();
        addBehavior();
    }
}
