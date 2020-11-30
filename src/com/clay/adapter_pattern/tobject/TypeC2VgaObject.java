package com.clay.adapter_pattern.tobject;

import com.clay.adapter_pattern.Phone;
import com.clay.adapter_pattern.TypeCDataStream;
import com.clay.adapter_pattern.Vga;
import com.clay.adapter_pattern.VgaDataStream;

/**
 * 通过组合和实现接口的方式 实现适配器模式
 */
public class TypeC2VgaObject implements Vga {
    private Phone phone;

    public TypeC2VgaObject(Phone phone) {
        this.phone = phone;
    }

    @Override
    public VgaDataStream vgaInterface() {
        TypeCDataStream typeCDataStream = this.phone.typeC();
        String typeCData = typeCDataStream.getTypeCData();
        System.out.println("将TypeC数据流转换成VGA数据流");
        VgaDataStream vgaDataStream = new VgaDataStream();
        vgaDataStream.setVagData("Vga:" + typeCData.split(":")[1]);
        System.out.println("VGA数据接口输出");
        return vgaDataStream;
    }
}
