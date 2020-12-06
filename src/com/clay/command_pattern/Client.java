package com.clay.command_pattern;

/**
 * 命令模式（Command Pattern）：将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。这样两者之间通过命令对象进行沟通，这样方便将命令对象进行储存、传递、调用、增加与管理。
 * 角色：抽象命令类（Command）、具体命令类（ConcreteCommandA）、实现者/接收者（Receiver）、调用者/请求者（Invoker）
 * 优点：
 *      1、通过引入中间件（抽象接口）降低系统的耦合度。
 *      2、扩展性良好，增加或删除命令非常方便。采用命令模式增加与删除命令不会影响其他类，且满足“开闭原则”。
 *      3、可以实现宏命令。命令模式可以与组合模式结合，将多个命令装配成一个组合命令，即宏命令。
 *      4、方便实现 Undo 和 Redo 操作。命令模式可以与后面介绍的备忘录模式结合，实现命令的撤销与恢复。
 *      5、可以在现有命令的基础上，增加额外功能。比如日志记录，结合装饰器模式会更加灵活。
 * 缺点：
 *      1、可能产生大量具体的命令类。因为每一个具体操作都需要设计一个具体命令类，这会增加系统的复杂性。
 *      2、命令模式的结果其实就是接收方的执行结果，但是为了以命令的形式进行架构、解耦请求与实现，引入了额外类型结构（引入了请求方与抽象命令接口），增加了理解上的困难。不过这也是设计模式的通病，抽象必然会额外增加类的数量，代码抽离肯定比代码聚合更加难理解。
 * 扩展：在软件开发中，有时将命令模式与前面学的组合模式联合使用，这就构成了宏命令模式，也叫组合命令模式。宏命令包含了一组命令，它充当了具体命令与调用者的双重角色，执行它时将递归调用它所包含的所有命令。
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker(new ConcreteCommandA(new ReceiverA()));
        invoker.cell();
    }
}
