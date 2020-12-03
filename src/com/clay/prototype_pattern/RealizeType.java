package com.clay.prototype_pattern;

public class RealizeType implements Cloneable {

    public RealizeType () {
        System.out.println("原型对象创建成功！");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (RealizeType) super.clone();
    }
}
