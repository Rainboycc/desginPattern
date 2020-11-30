package com.clay.builder_pattern;

/**
 * 具体建造者
 */
public class SubMealBuilderA extends MealBuilder {

    public SubMealBuilderA () {
        super();
    }

    @Override
    public void buildDrink() {
        this.meal.setDrink("可乐");
        System.out.println("套餐加入饮料：可乐");
    }

    @Override
    public void buildFood() {
        this.meal.setFood("香辣鸡腿堡");
        System.out.println("套餐加入主食：香辣鸡腿堡");
    }
}
