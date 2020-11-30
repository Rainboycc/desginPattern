package com.clay.abstract_factory;

public class ConcreteFactoryTwo implements AbstractFactory{
    @Override
    public ProductA2 createProductionA() {
        return new ProductA2();
    }

    @Override
    public ProductB2 createProductionB() {
        return new ProductB2();
    }
}
