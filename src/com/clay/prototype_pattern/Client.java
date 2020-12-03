package com.clay.prototype_pattern;

/**
 * 原型（Prototype）：用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。
 * 角色：抽象原型类（Cloneable）、具体原型类（RealizeType）
 * 优点：
 *      1、Java 自带的原型模式基于内存二进制流的复制，在性能上比直接 new 一个对象更加优良。
 *      2、可以使用深克隆方式保存对象的状态，使用原型模式将对象复制一份，并将其状态保存起来，简化了创建对象的过程，以便在需要的时候使用（例如恢复到历史某一状态），可辅助实现撤销操作。
 * 缺点：
 *      1、需要为每一个类都配置一个 clone 方法
 *      2、clone 方法位于类的内部，当对已有类进行改造的时候，需要修改代码，违背了开闭原则。
 *      3、当实现深克隆时，需要编写较为复杂的代码，而且当对象之间存在多重嵌套引用时，为了实现深克隆，每一层对象对应的类都必须支持深克隆，实现起来会比较麻烦。因此，深克隆、浅克隆需要运用得当。
 * 应用场景：用这种方式创建对象非常高效，根本无须知道对象创建的细节。
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("原型模式");
        RealizeType realizeType = new RealizeType();
        try {
            RealizeType realizeType1 = (RealizeType) realizeType.clone();
            System.out.println(realizeType == realizeType1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
