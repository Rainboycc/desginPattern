package com.clay.abstract_factory;

public class client {
    /**
     * 抽象工厂模式demo
     * 优点：高内聚低耦合，新增产品族（新的工厂）很方便，符合开闭原则
     * 缺点：扩展抽象工厂来生成新众类的产品，即增加新的产品等级结构麻烦。（开闭原则的倾斜性）
     * 适用环境：
     *      1、系统不依赖产品类实例的创建、组合和表达细节。
     *      2、系统中有多于一个的产品族，而每次只使用其中某一个产品族。
     *      3、属于同一产品族的产品将在一起使用，这一约束必须在系统的设计中体现出来。
     * @param args
     */
    public static void main(String args[]) {
        ConcreteFactoryOne factory1 = new ConcreteFactoryOne();
        // productA1 与 productB1 在同一产品族(由一个工厂创建的产品)
        ProductA1 productA1 = factory1.createProductionA();
        ProductB1 productB1 = factory1.createProductionB();
        ConcreteFactoryTwo factory2 = new ConcreteFactoryTwo();
        // productA1 与 productA2 在同一产品等级结构 (继承同一个抽象产品)
        ProductA2 productA2 = factory2.createProductionA();
        productA1.use();
        productB1.eat();
        productA2.use();
    }
}
