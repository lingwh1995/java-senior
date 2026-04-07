package org.bluebridge.general_concept._05_bitfield._02;

/**
 * 基于枚举的位域
 */
public enum EnumBitField {

    /**
     * bit 0 电源状态
     * 0：关闭  1：开启
     */
    POWER(0, 0),

    /**
     * bit 1 设备准备就绪状态
     * 0：未就绪  1：已就绪
     */
    READY(0, 1),

    /**
     * bit 2 运行状态
     * 0：停止  1：运行中
     */
    RUNNING(0, 2),

    /**
     * bit 3 故障状态
     * 0：无故障  1：故障
     */
    ERROR(0, 3),

    /**
     * bit 4 警告状态
     * 0：无警告  1：警告
     */
    WARNING(0, 4),

    /**
     * bit 5 超温状态
     * 0：温度正常  1：超温
     */
    OVER_TEMP(0, 5),

    /**
     * bit 6 过流状态
     * 0：电流正常  1：过流
     */
    OVER_CURRENT(0, 6),

    // 你可以无限扩展到 字节1、字节2、字节3 ...
    /** bit 0 (字节1) 保留位 */
    RESERVED_1_0(1, 0);

    // 第几个字节
    private final int byteIndex;
    // 字节内第几位
    private final int bitIndex;

    EnumBitField(int byteIndex, int bitIndex) {
        this.byteIndex = byteIndex;
        this.bitIndex = bitIndex;
    }

    /**
     * 设置某一位为 1
     * @param data
     */
    public void setBit(byte[] data) {
        if (byteIndex >= data.length) {
            return;
        }
        data[byteIndex] |= (1 << bitIndex);
    }

    /**
     * 清除某一位为 0
     * @param data
     */
    public void clearBit(byte[] data) {
        if (byteIndex >= data.length) {
            return;
        }
        data[byteIndex] &= ~(1 << bitIndex);
    }

    /**
     * 判断某一位是否为 1
     * @param data
     * @return
     */
    public boolean isSet(byte[] data) {
        if (byteIndex >= data.length) {
            return false;
        }
        return (data[byteIndex] & (1 << bitIndex)) != 0;
    }

    /**
     * 字节数组 → 十六进制字符串
     * @param data
     * @return
     */
    public static String toHex(byte[] data) {
        StringBuilder sb = new StringBuilder();
        for (byte b : data) {
            sb.append(String.format("%02X ", b));
        }
        return sb.toString().trim();
    }

    /**
     * 十六进制 → 字节数组
     * @param hex
     * @return
     */
    public static byte[] fromHex(String hex) {
        hex = hex.replace(" ", "");
        int len = hex.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4)
                    + Character.digit(hex.charAt(i+1), 16));
        }
        return data;
    }

    public static String toBinaryString(byte[] data) {
        StringBuilder sb = new StringBuilder();
        for (byte b : data) {
            sb.append(String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0'));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

}
