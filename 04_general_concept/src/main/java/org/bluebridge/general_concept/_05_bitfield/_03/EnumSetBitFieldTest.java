package org.bluebridge.general_concept._05_bitfield._03;

import java.util.EnumSet;

/**
 * @author lingwh
 * @desc EnumSetBitField 测试类
 *       功能：验证枚举位操作、二进制转换、协议数值互转
 * @date 2026/4/4 20:36
 */
public class EnumSetBitFieldTest {

    public static void main(String[] args) {
        // 模拟设备状态：电源开启 + 就绪
        EnumSet<EnumSetBitField> status = EnumSet.of(
                EnumSetBitField.POWER,
                EnumSetBitField.READY
        );

        // 输出调试信息
        System.out.println("状态列表：" + status);
        System.out.println("二进制位：" + EnumSetBitField.toBinaryString(status));
        System.out.println("协议数值：" + EnumSetBitField.toLong(status));
    }

}
