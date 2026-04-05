package org.bluebridge.fundamental_concept.bitfield._02;

public class EnumBitFieldTest {

    public static void main(String[] args) {
        // 1. 模拟协议报文：2字节（16位）足够你扩展
        byte[] data = new byte[2];

        // 2. 设置状态：电源 + 就绪
        EnumBitField.POWER.setBit(data);
        EnumBitField.READY.setBit(data);

        // 3. 查看结果
        System.out.println("十六进制: " + EnumBitField.toHex(data));
        System.out.println("二进制位: " + EnumBitField.toBinaryString(data));

        // 4. 判断状态
        System.out.println("电源状态: " + EnumBitField.POWER.isSet(data));
        System.out.println("运行状态: " + EnumBitField.RUNNING.isSet(data));
    }

}
