package com.clay.oberver_pattern;

/**
 * 观察者模式（Observer Pattern）：指多个对象间存在一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。这种模式有时又称作发布-订阅模式、模型-视图模式，它是对象行为型模式。
 * 角色：抽象主题（BellEventSource）、具体主题（BellEventSource）、抽象观察者（Listener）、具体观察者（StuEventListener）
 * 优点：
 *      1、降低了目标与观察者之间的耦合关系，两者之间是抽象耦合关系。符合依赖倒置原则。
 *      2、目标与观察者之间建立了一套触发机制。
 * 缺点：
 *      1、目标与观察者之间的依赖关系并没有完全解除，而且有可能出现循环引用。
 *      2、当观察者对象很多时，通知的发布会花费很多时间，影响程序的效率。
 * 扩展：在 Java 中，通过 java.util.Observable 类和 java.util.Observer 接口定义了观察者模式，只要实现它们的子类就可以编写观察者模式实例
 *
 */
public class Client {
    public static void main(String[] args) {
        BellEventSource bell = new BellEventSource();    //铃（事件源）
        bell.addPersonListener(new TeachEventListener()); //注册监听器（老师）
        bell.addPersonListener(new StuEventListener());    //注册监听器（学生）
        bell.ring(true);   //打上课铃声
        System.out.println("------------");
        bell.ring(false);  //打下课铃声
    }
}
