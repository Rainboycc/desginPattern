package com.clay.decorator_pattern;

/**
 * 装饰模式(Decorator Pattern) ：动态地给一个对象增加一些额外的职责(Responsibility)，就增加对象功能来说，装饰模式比生成子类实现更为灵活。其别名也可以称为包装器(Wrapper)，与适配器模式的别名相同，但它们适用于不同的场合。根据翻译的不同，装饰模式也有人称之为“油漆工模式”，它是一种对象结构型模式。
 * 角色： 构建（Component）、具体构建（ConcreteComponent）、抽象装饰类（Decorator）、具体装饰类（ConcreteDecoratorA/ConcreteDecoratorB）
 * 优点：
 *      1、装饰模式与继承关系的目的都是要扩展对象的功能，但是装饰模式可以提供比继承更多的灵活性。
 *      2、可以通过一种动态的方式来扩展一个对象的功能，通过配置文件可以在运行时选择不同的装饰器，从而实现不同的行为。
 *      3、通过使用不同的具体装饰类以及这些装饰类的排列组合，可以创造出很多不同行为的组合。可以使用多个具体装饰类来装饰同一对象，得到功能更为强大的对象。
 *      4、具体构件类与具体装饰类可以独立变化，用户可以根据需要增加新的具体构件类和具体装饰类，在使用时再对其进行组合，原有代码无须改变，符合“开闭原则”。
 * 缺点：
 *      这种比继承更加灵活机动的特性，也同时意味着装饰模式比继承更加易于出错，排错也很困难，对于多次装饰的对象，调试时寻找错误可能需要逐级排查，较为烦琐。
 */
public class client {
    public static void main(String[] args) {
        Component concreteComponent = new ConcreteComponent();
        concreteComponent.operation();
        System.out.println("-----------------------------");
        concreteComponent = new ConcreteDecoratorA(new ConcreteComponent());
        concreteComponent.operation();
        System.out.println("-----------------------------");
        concreteComponent = new ConcreteDecoratorB(new ConcreteComponent());
        concreteComponent.operation();
    }
}
