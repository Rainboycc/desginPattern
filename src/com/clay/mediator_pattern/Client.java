package com.clay.mediator_pattern;

/**
 * 中介者模式（Mediator Pattern）：定义一个中介对象来封装一系列对象之间的交互，使原有对象之间的耦合松散，且可以独立地改变它们之间的交互。中介者模式又叫调停模式，它是迪米特法则的典型应用。
 * 角色：抽象中介者（Mediator）、具体中介者（ConcreteMediator）、抽象同事类（Colleague）、具体同事类（ConcreteColleagueA/ConcreteColleagueB）
 * 优点：
 *      1、类之间各司其职，符合迪米特法则。
 *      2、降低了对象之间的耦合性，使得对象易于独立地被复用。
 *      3、将对象间的一对多关联转变为一对一的关联，提高系统的灵活性，使得系统易于维护和扩展。
 * 缺点：
 *      中介者模式将原本多个对象直接的相互依赖变成了中介者和多个同事类的依赖关系。当同事类越多时，中介者就会越臃肿，变得复杂且难以维护。
 * 适用场景：
 *      1、当对象之间存在复杂的网状结构关系而导致依赖关系混乱且难以复用时。
 *      2、当想创建一个运行于多个类之间的对象，又不想生成新的子类时。
 * 模式扩展：
 *      1、不定义中介者接口，把具体中介者对象实现成为单例。
 *      2、同事对象不持有中介者，而是在需要的时候直接获取中介者对象并调用
 *
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleagueA = new ConcreteColleagueA();
        Colleague colleagueB = new ConcreteColleagueB();
        mediator.register(colleagueA);
        mediator.register(colleagueB);
        colleagueA.send("shit");
        System.out.println("-------------");
        colleagueB.send("holy shit");
    }
}
