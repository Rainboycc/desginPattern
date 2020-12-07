package com.clay.iterator_pattern;

/**
 * 迭代器模式（Iterator Pattern）：提供一个对象来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。
 * 角色:抽象聚合（Aggregate）、具体聚合（ConcreteAggregate）、抽象迭代器（Iterator）、具体迭代器（Concretelterator）
 * 优点：
 *      1、访问一个聚合对象的内容而无须暴露它的内部表示。
 *      2、遍历任务交由迭代器完成，这简化了聚合类。
 *      3、它支持以不同方式遍历一个聚合，甚至可以自定义迭代器的子类以支持新的遍历。
 *      4、增加新的聚合类和迭代器类都很方便，无须修改原有代码。
 *      5、封装性良好，为遍历不同的聚合结构提供一个统一的接口。
 * 缺点：
 *      增加了类的个数，这在一定程度上增加了系统的复杂性。
 * 适用场景：
 *      1、当需要为聚合对象提供多种遍历方式时。
 *      2、当需要为遍历不同的聚合结构提供一个统一的接口时。
 *      3、访问一个聚合对象的内容而无须暴露其内部细节的表示时。
 * 扩展：
 *      迭代器模式常常与组合模式结合起来使用，在对组合模式中的容器构件进行访问时，经常将迭代器潜藏在组合模式的容器构成类中。
 */
public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("123");
        aggregate.add("321");
        aggregate.add("555");
        Iterator iterator = aggregate.getIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
    }
}
