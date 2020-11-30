package com.clay.bridge_pattern;

/**
 * 桥接模式(Bridge Pattern)：将抽象部分与它的实现部分分离，使它们都可以独立地变化。它是一种对象结构型模式，又称为柄体(Handle and Body)模式或接口(Interface)模式。
 * 角色： 抽象类（AbstractMessage） 扩充抽象类 (CommonMessage/UrgencyMessage) 实现类接口 (MessageImplementor 具体实现类（MessageEmail/MessageSMS）
 * 优点：
 *      1、分离抽象接口及其实现部分。
 *      2、桥接模式有时类似于多继承方案，但是多继承方案违背了类的单一职责原则（即一个类只有一个变化的原因），复用性比较差，而且多继承结构中类的个数非常庞大，桥接模式是比多继承方案更好的解决方法。
 *      3、桥接模式提高了系统的可扩充性，在两个变化维度中任意扩展一个维度，都不需要修改原有系统。
 *      4、实现细节对客户透明，可以对用户隐藏实现细节。
 * 缺点：
 *      1、桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程。
 *      2、桥接模式要求正确识别出系统中两个独立变化的维度，因此其使用范围具有一定的局限性。
 * 模式扩展（适配器模式与桥接模式的联用）：
 *      桥接模式和适配器模式用于设计的不同阶段，桥接模式用于系统的初步设计，对于存在两个独立变化维度的类可以将其分为抽象化和实现化两个角色，使它们可以分别进行变化；
 *      而在初步设计完成之后，当发现系统与已有类无法协同工作时，可以采用适配器模式。但有时候在设计初期也需要考虑适配器模式，特别是那些涉及到大量第三方应用接口的情况。
 *
 */
public class client {
    public static void main(String[] args) {
        MessageEmail messageEmail = new MessageEmail();
        UrgencyMessage urgencyMessage = new UrgencyMessage(messageEmail);
        urgencyMessage.sendMessage("快回公司", "司机小李");
    }
}
