package org.bluebridge.general_concept._07_endian._02;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * @author think
 * @desc
 * @date 2026/4/7 18:12
 */
public class EndianUtils {

    // 私有构造方法，防止实例化
    private EndianUtils() {
        throw new UnsupportedOperationException("不支持被实例化");
    }

    /**
     * 获取当前ByteBuffer字节序
     * @return
     */
    public static ByteOrder getByteBufferEndian() {
        // 分配1个字节的缓冲就够判断了
        return ByteBuffer.allocate(1).order();
    }

    /**
     * 获取当前系统字节序
     * @return
     */
    public static ByteOrder getNativeEndian() {
        return ByteOrder.nativeOrder();
    }

    /**
     * 判断系统字节序：true=小端(x86/ARM)，false=大端
     * @return
     */
    private static boolean isLittleEndian() {
        // 用 ByteBuffer 模拟 C 语言的「取低地址字节」逻辑
        ByteBuffer buffer = ByteBuffer.allocate(2);
        // 设置为系统原生字节序
        buffer.order(ByteOrder.nativeOrder());
        buffer.putShort((short) 0x0001);
        // 取第一个字节（低地址）判断
        return buffer.get(0) == 1;
    }

    /**
     * 16位：主机字节序 -> 网络字节序(大端)
     */
    public static short htons(short s) {
        ByteBuffer buffer = ByteBuffer.allocate(2).order(ByteOrder.BIG_ENDIAN);
        buffer.putShort(s);
        // 这里不链式调用，就不会变成父类 Buffer
        buffer.flip();
        return buffer.getShort();
    }

    /**
     * 32位：主机字节序 -> 网络字节序(大端)
     */
    public static int htonl(int i) {
        ByteBuffer buffer = ByteBuffer.allocate(2).order(ByteOrder.BIG_ENDIAN);
        buffer.putInt(i);
        // 这里不链式调用，就不会变成父类 Buffer
        buffer.flip();
        return buffer.getInt();
    }

    /**
     * 16位：网络字节序 -> 主机字节序
     * @param netShort
     * @return
     */
    public static short ntohs(short netShort) {
        return htons(netShort);
    }

    /**
     * 32位：网络字节序 -> 主机字节序
     * @param netLong
     * @return
     */
    public static int ntohl(int netLong) {
        return htonl(netLong);
    }

}
