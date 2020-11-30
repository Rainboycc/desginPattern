package com.clay.builder_pattern;

/**
 * 具体建造者
 */
public class SubMealBuilderB extends MealBuilder {

    public SubMealBuilderB () {
        super();
    }

    @Override
    public void buildDrink() {
        this.meal.setDrink("雪碧");
        System.out.println("套餐加入饮料：雪碧");
    }

    @Override
    public void buildFood() {
        this.meal.setFood("香辣鸡肉卷");
        System.out.println("套餐加入主食：香辣鸡肉卷");
    }
}
