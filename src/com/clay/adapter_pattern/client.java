package com.clay.adapter_pattern;

import com.clay.adapter_pattern.tclass.TypeC2VgaTClass;
import com.clay.adapter_pattern.tobject.TypeC2VgaObject;

/**
 * 适配器模式：将一个接口转换成客户希望的另一个接口，适配器模式使接口不兼容的那些类可以一起工作，其别名为包装器(Wrapper)。适配器模式既可以作为类结构型模式，也可以作为对象结构型模式。
 * 将一种不符合客户端要求的数据格式转换成符合客户端要求的数据格式。
 * 角色：目标抽象类(Vga)，适配器类(TypeC2VgaTClass/TypeC2VgaObject),适配者类(Phone),客户类(Screen)
 * 优点：
 *      1、将目标类和适配者类解耦，通过引入一个适配器类来重用现有的适配者类，而无须修改原有代码。
 *      2、增加了类的透明性和复用性，将具体的实现封装在适配者类中，对于客户端类来说是透明的，而且提高了适配者的复用性。
 *      3、灵活性和扩展性都非常好，通过使用配置文件，可以很方便地更换适配器，也可以在不修改原有代码的基础上增加新的适配器类，完全符合“开闭原则”。
 * 类适配器模式还具有如下优点：
 *      由于适配器类是适配者类的子类，因此可以在适配器类中置换一些适配者的方法，使得适配器的灵活性更强。
 * 对象适配器模式还具有如下优点：
 *      一个对象适配器可以把多个不同的适配者适配到同一个目标，也就是说，同一个适配器可以把适配者类和它的子类都适配到目标接口。
 */
public class client {
    public static void main(String[] args) {
        System.out.println("-------------------------------------");
        TypeCDataStream typeCDataStream = new TypeCDataStream();
        typeCDataStream.setTypeCData("TypeC: 12923813898");
        TypeC2VgaTClass typeC2VgaTClass = new TypeC2VgaTClass(typeCDataStream);
        System.out.println("投影vga数据流中....");
        Screen screen = new Screen();
        screen.print(typeC2VgaTClass);
        System.out.println("-------------------------------------");
        Phone phone = new Phone(typeCDataStream);
        TypeC2VgaObject typeC2VgaObject = new TypeC2VgaObject(phone);
        System.out.println("投影vga数据流中....");
        screen.print(typeC2VgaTClass);
    }
}
