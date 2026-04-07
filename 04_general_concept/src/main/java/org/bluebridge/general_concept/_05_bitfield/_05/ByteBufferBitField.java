package org.bluebridge.general_concept._05_bitfield._05;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * @author lingwh
 * @desc
 * @date 2026/4/4 20:47
 */
public class ByteBufferBitField {

    private long value;

    public ByteBufferBitField() {
        this(0);
    }

    public ByteBufferBitField(long value) {
        this.value = value;
    }

    public int get(int offset, int length) {
        long mask = (1L << length) - 1;
        return (int) ((value >> offset) & mask);
    }

    public void set(int offset, int length, int fieldValue) {
        long mask = (1L << length) - 1;
        value = (value & ~(mask << offset)) | ((fieldValue & mask) << offset);
    }

    public long getRaw() {
        return value;
    }

    public void setRaw(long value) {
        this.value = value;
    }

    // 纯 Java 实现 long 转 byte[]
    public byte[] toBytes() {
        return ByteBuffer.allocate(8)
                .order(ByteOrder.BIG_ENDIAN)
                .putLong(value)
                .array();
    }

}
