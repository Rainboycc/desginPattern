package com.clay.strategy_pattern;

import java.util.HashMap;

public class StrategyFactory {
    private HashMap<String, Strategy> strategies;

    public StrategyFactory () {
        strategies = new HashMap<String, Strategy>();
    }

    public void put (String key, Strategy strategy) {
        strategies.put(key, strategy);
    }

    public Strategy get (String key) {
        return strategies.get(key);
    }

    public void strategyMethod (String key) {
        strategies.get(key).strategyMethod();
    }
}
