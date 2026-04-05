package org.bluebridge.fundamental_concept.bitfield._01;

/**
 * @author lingwh
 * @desc 通用 BitField 工具类
 *       特点：一次编写，到处使用，支持任意位布局
 * @date 2026/4/4 20:32
 */
public class NativeBitField {

    private final long value;

    private NativeBitField(long value) {
        this.value = value;
    }

    public static NativeBitField from(long value) {
        return new NativeBitField(value);
    }

    public static NativeBitField empty() {
        return new NativeBitField(0);
    }

    public int get(int offset, int length) {
        long mask = (1L << length) - 1;
        return (int) ((value >> offset) & mask);
    }

    public NativeBitField set(int offset, int length, int fieldValue) {
        // 1. 生成指定长度的全1掩码
        long mask = (1L << length) - 1;
        // 2. 清空目标位段（把要写入的位置先置0）
        long cleared = value & ~(mask << offset);
        // 3. 把新值写入清空后的位段
        long newValue = cleared | ((fieldValue & mask) << offset);
        // 4. 返回新对象（不可变设计，不修改原对象）
        return new NativeBitField(newValue);
    }

    public long getRawValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("BitField{value=0x%016X}", value);
    }

}
