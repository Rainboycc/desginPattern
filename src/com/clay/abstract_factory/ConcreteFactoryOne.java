package com.clay.abstract_factory;

public class ConcreteFactoryOne implements AbstractFactory {
    @Override
    public ProductA1 createProductionA() {
        return new ProductA1();
    }

    @Override
    public ProductB1 createProductionB() {
        return new ProductB1();
    }
}
