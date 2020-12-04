package com.clay.template_themod_pattern;

/**
 * 模板方法（Template Method）模式的定义如下：定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤。它是一种类行为型模式。
 * 角色：抽象模板(HookAbstractClass)、具体实现(HookConcreteClass)
 *
 * 优点：
 *      1、它封装了不变部分，扩展可变部分。它把认为是不变部分的算法封装到父类中实现，而把可变部分算法由子类继承实现，便于子类继续扩展。
 *      2、它在父类中提取了公共的部分代码，便于代码复用。
 *      3、部分方法是由子类实现的，因此子类可以通过扩展方式增加相应的功能，符合开闭原则。
 * 缺点：
 *      1、对每个不同的实现都需要定义一个子类，这会导致类的个数增加，系统更加庞大，设计也更加抽象，间接地增加了系统实现的复杂度。
 *      2、父类中的抽象方法由子类实现，子类执行的结果会影响父类的结果，这导致一种反向的控制结构，它提高了代码阅读的难度。
 *      3、由于继承关系自身的缺点，如果父类添加新的抽象方法，则所有子类都要改一遍。
 *
 * 扩展：在模板方法模式中，基本方法包含：抽象方法、具体方法和钩子方法，正确使用“钩子方法”可以使得子类控制父类的行为。如下面例子中，可以通过在具体子类中重写钩子方法 HookMethod1() 和 HookMethod2() 来改变抽象父类中的运行结果
 */
public class Client {
    public static void main(String[] args) {
        HookAbstractClass hookAbstractClass = new HookConcreteClass();
        hookAbstractClass.TemplateMethod();
    }
}
