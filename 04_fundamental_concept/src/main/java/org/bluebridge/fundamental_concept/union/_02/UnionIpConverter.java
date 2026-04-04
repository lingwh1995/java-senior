package org.bluebridge.fundamental_concept.union._02;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * @author lingwh
 * @desc
 * @date 2026/4/4 20:59
 */
public class UnionIpConverter {

    /**
     * 整型 IP -> 字符串 IP
     * @param ipInt
     * @return
     */
    public static String intToIp(int ipInt) {
        // 1. 分配 4 字节缓冲区（对应 C 的 union 内存空间）
        ByteBuffer bb = ByteBuffer.allocate(4);

        // 2. 设置为大端序（网络字节序，对应 IP 协议标准）
        bb.order(ByteOrder.BIG_ENDIAN);

        // 3. 写入 int（对应 C 的 u.ipInt = ...）
        bb.putInt(ipInt);

        // 4. 重置 position 到 0
        bb.flip();

        // 5. 像读数组一样读 4 个字节（对应 C 的 u.bytes.a, u.bytes.b...）
        int a = bb.get() & 0xFF;
        int b = bb.get() & 0xFF;
        int c = bb.get() & 0xFF;
        int d = bb.get() & 0xFF;

        return a + "." + b + "." + c + "." + d;
    }

}
