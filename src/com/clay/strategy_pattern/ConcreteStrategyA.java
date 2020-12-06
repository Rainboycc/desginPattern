package com.clay.strategy_pattern;

public class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("ConcreteStrategyA");
    }
}
