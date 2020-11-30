package com.clay.decorator_pattern;

public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("基本操作");
    }
}
