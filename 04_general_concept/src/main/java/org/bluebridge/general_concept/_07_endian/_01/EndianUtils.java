package org.bluebridge.general_concept._07_endian._01;

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
     * 判读当前系统字节序是否为小端
     * @return
     */
    public static boolean isLittleEndian() {
        return ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
    }

}
