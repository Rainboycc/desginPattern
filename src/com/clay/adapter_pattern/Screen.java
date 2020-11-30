package com.clay.adapter_pattern;

public class Screen {
    public void print (Vga vga) {
        VgaDataStream vgaDataStream = vga.vgaInterface();
        System.out.println("屏幕输出中...");
        System.out.println(vgaDataStream.getVagData());
    }
}
