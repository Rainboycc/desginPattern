package com.clay.memento_pattern;

/**
 * 备忘录模式（Memento）：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，以便以后当需要时能将该对象恢复到原先保存的状态。该模式又叫快照模式。
 * 角色：发起人（Originator）、备忘录（Memento）、管理者（Caretaker）
 * 优点：
 *      1、提供了一种可以恢复状态的机制。当用户需要时能够比较方便地将数据恢复到某个历史的状态。
 *      2、实现了内部状态的封装。除了创建它的发起人之外，其他对象都不能够访问这些状态信息。
 *      3、简化了发起人类。发起人不需要管理和保存其内部状态的各个备份，所有状态信息都保存在备忘录中，并由管理者进行管理，这符合单一职责原则。
 * 缺点：
 *      资源消耗大。如果要保存的内部状态信息过多或者特别频繁，将会占用比较大的内存资源
 * 适用场景：
 *      1、需要保存与恢复数据的场景，如玩游戏时的中间结果的存档功能。
 *      2、需要提供一个可回滚操作的场景，如 Word、记事本、Photoshop，Eclipse 等软件在编辑时按 Ctrl+Z 组合键，还有数据库中事务操作。
 * 扩展：
 *      在前面介绍的备忘录模式中，有单状态备份的例子，也有多状态备份的例子。下面介绍备忘录模式如何同原型模式混合使用。在备忘录模式中，通过定义“备忘录”来备份“发起人”的信息，而原型模式的 clone() 方法具有自备份功能，所以，如果让发起人实现 Cloneable 接口就有备份自己的功能，这时可以删除备忘录类。
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("A");
        System.out.println(originator.getState());
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.setState("B");
        System.out.println(originator.getState());
        originator.restoreMemento(caretaker.getMemento()); //恢复状态
        System.out.println(originator.getState());
    }
}
