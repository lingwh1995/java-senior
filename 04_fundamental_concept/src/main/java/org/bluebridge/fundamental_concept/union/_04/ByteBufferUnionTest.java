package org.bluebridge.fundamental_concept.union._04;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ByteBufferUnionTest {

    public static void main(String[] args) {
        // 1. 分配 4 字节（模拟 union 内存）
        ByteBuffer buffer = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);

        // 2. 写入 int 值
        int i = 5;
        buffer.putInt(0, i);

        // 3. 读取原始 int
        System.out.printf("i = %d\n", buffer.getInt(0));

        // 4. 读取第 0 位、第 31 位（等价 C: bits.bit00 / bits.bit31）
        System.out.println("第 00 位: " + getBit(buffer, 0));
        System.out.println("第 31 位: " + getBit(buffer, 31));

        // 5. 打印前 4 位：bit00 ~ bit03
        System.out.printf("bit00 = %d, bit01 = %d, bit02 = %d, bit03 = %d\n",
                getBit(buffer, 0),
                getBit(buffer, 1),
                getBit(buffer, 2),
                getBit(buffer, 3)
        );
    }

    /**
     * 从 ByteBuffer 中读取第 N 位（模拟位域访问）
     * @param buffer
     * @param bitIndex
     * @return
     */
    private static int getBit(ByteBuffer buffer, int bitIndex) {
        int value = buffer.getInt(0);
        return (value >>> bitIndex) & 1;
    }
}
