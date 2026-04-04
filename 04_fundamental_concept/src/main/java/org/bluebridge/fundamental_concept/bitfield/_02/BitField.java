package org.bluebridge.fundamental_concept.bitfield._02;

/**
 * @author lingwh
 * @desc 通用 BitField 工具类
 *       特点：一次编写，到处使用，支持任意位布局
 * @date 2026/4/4 20:32
 */
public class BitField {

    private final long value;

    private BitField(long value) {
        this.value = value;
    }

    public static BitField from(long value) {
        return new BitField(value);
    }

    public static BitField empty() {
        return new BitField(0);
    }

    public int get(int offset, int length) {
        long mask = (1L << length) - 1;
        return (int) ((value >> offset) & mask);
    }

    public BitField set(int offset, int length, int fieldValue) {
        long mask = (1L << length) - 1;
        long cleared = value & ~(mask << offset);
        long newValue = cleared | ((fieldValue & mask) << offset);
        return new BitField(newValue);
    }

    public long getRawValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("BitField{value=0x%016X}", value);
    }

}
