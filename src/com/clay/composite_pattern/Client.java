package com.clay.composite_pattern;

/**
 * 组合（Composite Pattern）模式的定义：有时又叫作整体-部分（Part-Whole）模式，它是一种将对象组合成树状的层次结构的模式，用来表示“整体-部分”的关系，使用户对单个对象和组合对象具有一致的访问性，属于结构型设计模式。
 *
 * 角色：抽象构件（Component）、树叶构件（Leaf）、树枝构件（Composite）。
 *
 * 优点：
 *      1、组合模式使得客户端代码可以一致地处理单个对象和组合对象，无须关心自己处理的是单个对象，还是组合对象，这简化了客户端代码；
 *      2、更容易在组合体内加入新的对象，客户端不会因为加入了新的对象而更改源代码，满足“开闭原则”；
 *
 * 缺点：
 *      1、设计较复杂，客户端需要花更多时间理清类之间的层次关系；
 *      2、不容易限制容器中的构件；
 *      3、不容易用继承的方法来增加构件的新功能；
 *
 * 实现方式：
 *      1、透明模式：抽象构件声明了所有子类中的全部方法。（不符合接口隔离原则）
 *      2、安全模式：抽象构件只声明子类共有方法。
 *
 */
public class Client {
    public static void main(String[] args) {
        Composite c0 = new Composite();
        Composite c1 = new Composite();
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");
        c0.add(leaf1);
        c0.add(c1);
        c1.add(leaf2);
        c1.add(leaf3);
        c0.operation();
    }
}
