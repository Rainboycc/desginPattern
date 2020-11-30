package com.clay.adapter_pattern.tclass;

import com.clay.adapter_pattern.Phone;
import com.clay.adapter_pattern.TypeCDataStream;
import com.clay.adapter_pattern.Vga;
import com.clay.adapter_pattern.VgaDataStream;

/**
 * 通过继承和实现接口的方式 实现适配器模式
 */
public class TypeC2VgaTClass extends Phone implements Vga {

    public TypeC2VgaTClass (TypeCDataStream typeCDataStream) {
        super(typeCDataStream);
    }

    @Override
    public VgaDataStream vgaInterface() {

        TypeCDataStream typeCDataStream = typeC();
        String typeCData = typeCDataStream.getTypeCData();
        System.out.println("将TypeC数据流转换成VGA数据流");
        VgaDataStream vgaDataStream = new VgaDataStream();
        vgaDataStream.setVagData("Vga:" + typeCData.split(":")[1]);
        System.out.println("VGA数据接口输出");
        return vgaDataStream;
    }
}
