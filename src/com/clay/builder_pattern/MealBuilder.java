package com.clay.builder_pattern;

/**
 * 抽象建造者，建造套餐
 */
public abstract class MealBuilder {
    protected Meal meal;
    public MealBuilder () {
        this.meal = new Meal();
    }
    public abstract void buildDrink();
    public abstract void buildFood();
    public Meal getMeal() {
        return meal;
    }
}
