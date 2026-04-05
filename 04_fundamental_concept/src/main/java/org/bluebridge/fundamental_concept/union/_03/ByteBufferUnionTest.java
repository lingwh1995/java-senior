package org.bluebridge.fundamental_concept.union._03;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ByteBufferUnionTest {

    public static void main(String[] args) {
        // 分配 4 字节（用来放 int/float/byte）
        ByteBuffer buffer = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);

        // 写入 int
        buffer.putInt(0, 0x4048F5C3);

        // 同一段内存，读成不同类型 = 模拟联合体
        int    i = buffer.getInt(0);
        short  s = buffer.getShort(0);
        byte   b = buffer.get(0);

        System.out.printf("int:   0x%x\n", i);
        System.out.printf("short: 0x%x\n", s);
        System.out.printf("byte:  0x%x\n", b);
    }

}
