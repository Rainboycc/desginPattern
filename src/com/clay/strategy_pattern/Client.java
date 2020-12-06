package com.clay.strategy_pattern;

/**
 * 策略模式（Strategy Pattern）的定义：该模式定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的变化不会影响使用算法的客户。策略模式属于对象行为模式，它通过对算法进行封装，把使用算法的责任和算法的实现分割开来，并委派给不同的对象对这些算法进行管理。
 * 角色：抽象策略（Strategy）、具体策略（ConcreteStrategy）、环境（Context）
 * 优点：
 *      1、多重条件语句不易维护，而使用策略模式可以避免使用多重条件语句，如 if...else 语句、switch...case 语句。
 *      2、策略模式提供了一系列的可供重用的算法族，恰当使用继承可以把算法族的公共代码转移到父类里面，从而避免重复的代码。
 *      3、策略模式可以提供相同行为的不同实现，客户可以根据不同时间或空间要求选择不同的
 *      4、策略模式提供了对开闭原则的完美支持，可以在不修改原代码的情况下，灵活增加新算法。
 *      5、策略模式把算法的使用放到环境类中，而算法的实现移到具体策略类中，实现了二者的分离。
 * 缺点：
 *      1、客户端必须理解所有策略算法的区别，以便适时选择恰当的算法类。
 *      2、策略模式造成很多的策略类，增加维护难度。
 * 扩展：在一个使用策略模式的系统中，当存在的策略很多时，客户端管理所有策略算法将变得很复杂，如果在环境类中使用策略工厂模式来管理这些策略类将大大减少客户端的工作复杂度。
 *
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("策略模式");
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        context.strategyMethod();
        StrategyFactory strategyFactory = new StrategyFactory();
        strategyFactory.put("A", new ConcreteStrategyA());
        strategyFactory.put("B", new ConcreteStrategyB());
        strategyFactory.strategyMethod("A");
        strategyFactory.strategyMethod("B");
    }
}
