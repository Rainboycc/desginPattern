package com.clay.adapter_pattern;

public class Phone {

    private TypeCDataStream typeCDataStream;

    public Phone (TypeCDataStream typeCDataStream) {
        this.typeCDataStream = typeCDataStream;
    }

    public TypeCDataStream typeC () {
        System.out.println("信息从手机的typeC数据接口输出");
        System.out.println(typeCDataStream.getTypeCData());
        return typeCDataStream;
    }
}
