package org.bluebridge.general_concept.bitfield._03;

import java.util.EnumSet;

/**
 * @author lingwh
 * @desc  EnumSet(Java 官方推荐的位域替代方案)
 *        特点：类型安全、可读性好、性能高
 *        适用：状态标志、权限控制
 *
 *        设备状态位枚举（对应协议中 1 字节 / 4 字节的状态位）
 *        每个枚举常量对应二进制中的某一位，ordinal() 值为对应的位号
 * @date 2026/4/4 20:35
 */
public enum EnumSetBitField {

    /**
     * bit 0 电源状态
     * 0：关闭  1：开启
     */
    POWER,

    /**
     * bit 1 设备准备就绪状态
     * 0：未就绪  1：已就绪
     */
    READY,

    /**
     * bit 2 运行状态
     * 0：停止  1：运行中
     */
    RUNNING,

    /**
     * bit 3 故障状态
     * 0：无故障  1：故障
     */
    ERROR,

    /**
     * bit 4 警告状态
     * 0：无警告  1：警告
     */
    WARNING,

    /**
     * bit 5 超温状态
     * 0：温度正常  1：超温
     */
    OVER_TEMP,

    /**
     * bit 6 过流状态
     * 0：电流正常  1：过流
     */
    OVER_CURRENT;

    /**
     * 将 long 类型的原始数据（协议报文数据）转换为 EnumSet 状态集合
     *
     * @param value 协议中的原始数值（如 int/long 状态字）
     * @return EnumSet<EnumSetBitField> 包含当前所有为 1 的状态位
     */
    public static EnumSet<EnumSetBitField> fromLong(long value) {
        EnumSet<EnumSetBitField> statusSet = EnumSet.noneOf(EnumSetBitField.class);
        for (EnumSetBitField status : EnumSetBitField.values()) {
            if ((value & (1L << status.ordinal())) != 0) {
                statusSet.add(status);
            }
        }
        return statusSet;
    }

    /**
     * 将 EnumSet 状态集合转换为 long 类型数值（用于发送协议报文）
     *
     * @param statusSet 状态集合
     * @return 对应的 long 数值（二进制位表示状态）
     */
    public static long toLong(EnumSet<EnumSetBitField> statusSet) {
        long result = 0;
        for (EnumSetBitField status : statusSet) {
            result |= (1L << status.ordinal());
        }
        return result;
    }

    /**
     * 将状态集合转换为 8 位二进制字符串（用于调试查看位状态）
     *
     * @param statusSet 状态集合
     * @return 如 00000011 格式的二进制字符串
     */
    public static String toBinaryString(EnumSet<EnumSetBitField> statusSet) {
        long value = toLong(statusSet);
        return String.format("%8s", Long.toBinaryString(value)).replace(' ', '0');
    }

}
