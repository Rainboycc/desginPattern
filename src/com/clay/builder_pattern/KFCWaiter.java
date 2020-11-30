package com.clay.builder_pattern;

/**
 * 指挥者
 * 1、隔离了客户与生产过程
 * 2、负责控制产品的生成过程。
 * 3、通过指挥者类调用建造者的相关方法，返回一个完整的产品对象。
 */
public class KFCWaiter {

    private MealBuilder mealBuilder;

    public KFCWaiter (MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal construct() {
        mealBuilder.buildDrink();
        mealBuilder.buildFood();
        return mealBuilder.getMeal();
    }

}
