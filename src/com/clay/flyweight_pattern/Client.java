package com.clay.flyweight_pattern;

/**
 * 享元模式(Flyweight Pattern)：运用共享技术有效地支持大量细粒度对象的复用。系统只使用少量的对象，而这些对象都很相似，状态变化很小，可以实现对象的多次复用。由于享元模式要求能够共享的对象必须是细粒度对象，因此它又称为轻量级模式，它是一种对象结构型模式。
 * 角色：抽象享元类（ChessInterface）、具体享元类（ChessFlyweight）、非共享具体享元类（ChessCompositeFlyweight）、享元工厂类（ChessFactory）
 * 优点：
 *      1、享元模式的优点在于它可以极大减少内存中对象的数量，使得相同对象或相似对象在内存中只保存一份。
 *      2、享元模式的外部状态相对独立，而且不会影响其内部状态，从而使得享元对象可以在不同的环境中被共享。
 * 缺点：
 *      1、享元模式使得系统更加复杂，需要分离出内部状态和外部状态，这使得程序的逻辑复杂化。
 *      2、为了使对象可以共享，享元模式需要将享元对象的状态外部化，而读取外部状态使得运行时间变长。
 * 适用环境：
 *      1、一个系统有大量相同或者相似的对象，由于这类对象的大量使用，造成内存的大量耗费。
 *      2、对象的大部分状态都可以外部化，可以将这些外部状态传入对象中。
 *      3、使用享元模式需要维护一个存储享元对象的享元池，而这需要耗费资源，因此，应当在多次重复使用享元对象时才值得使用享元模式。
 * 模式扩展：
 *      1、单纯享元模式和复合享元模式
 *          1.1 单纯享元模式：在单纯享元模式中，所有的享元对象都是可以共享的，即所有抽象享元类的子类都可共享，不存在非共享具体享元类。
 *          1.2 复合享元模式：将一些单纯享元使用组合模式加以组合，可以形成复合享元对象，这样的复合享元对象本身不能共享，但是它们可以分解成单纯享元对象，而后者则可以共享。
 *      2、享元模式与其他模式的联用
 *          2.1 在享元模式的享元工厂类中通常提供一个静态的工厂方法用于返回享元对象，使用简单工厂模式来生成享元对象。
 *          2.2 在一个系统中，通常只有唯一一个享元工厂，因此享元工厂类可以使用单例模式进行设计。
 *          2.3 享元模式可以结合组合模式形成复合享元模式，统一对享元对象设置外部状态。
 */
public class Client {
    public static void main(String[] args) {
        ChessFactory chessFactory = ChessFactory.getInstance();
        ChessInterface chess = chessFactory.factory("白色");
        ChessInterface chess2 = chessFactory.factory("白色");
        ChessInterface chess3 = chessFactory.factory("黑色");
        ChessInterface chess4 = chessFactory.factory("黑色");
        chess4.move(2, 3);
        chess.move(1, 2);
        chess2.move(2, 3);
        chess3.move(2, 3);
    }
}
