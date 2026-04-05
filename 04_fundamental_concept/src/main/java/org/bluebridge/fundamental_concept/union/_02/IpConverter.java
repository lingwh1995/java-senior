package org.bluebridge.fundamental_concept.union._02;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * @author lingwh
 * @desc
 * @date 2026/4/4 20:59
 */
public class IpConverter {

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

    /**
     * 字符串 IP -> 整型 IP (反向转换，与 intToIp 完全互转)
     * @param ipStr 如 "192.168.1.100"
     * @return int 型 IP
     */
    public static int ipToInt(String ipStr) {
        // 1. 按 . 分割IP
        String[] parts = ipStr.split("\\.");
        int o1 = Integer.parseInt(parts[0]);
        int o2 = Integer.parseInt(parts[1]);
        int o3 = Integer.parseInt(parts[2]);
        int o4 = Integer.parseInt(parts[3]);

        // 2. 分配4字节缓冲区
        ByteBuffer bb = ByteBuffer.allocate(4);
        // 必须和 intToIp 一致：大端
        bb.order(ByteOrder.BIG_ENDIAN);

        // 3. 按网络字节序写入4个字节
        bb.put((byte) o1);
        bb.put((byte) o2);
        bb.put((byte) o3);
        bb.put((byte) o4);

        // 4. 切换为读模式，获取int
        bb.flip();
        return bb.getInt();
    }
}
