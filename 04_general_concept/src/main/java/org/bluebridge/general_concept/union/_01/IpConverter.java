package org.bluebridge.general_concept.union._01;

/**
 * @author lingwh
 * @desc Java 实现 IP 整型转字符串(纯位运算版)
 *       对应 C 语言 union + 位域的底层逻辑
 * @date 2026/4/4 20:58
 */
public class IpConverter {

    /**
     * 整型 IP -> 字符串 IP (点分十进制)
     * @param ipInt 32位整型 IP (大端序，网络字节序)
     * @return "a.b.c.d" 格式字符串
     */
    public static String intToIp(int ipInt) {
        // 对应 C 语言：直接读 4 个字节
        // 最高字节 (第 24-31 位)
        int a = (ipInt >> 24) & 0xFF;
        // 次高字节 (第 16-23 位)
        int b = (ipInt >> 16) & 0xFF;
        // 次低字节 (第 8-15 位)
        int c = (ipInt >> 8)  & 0xFF;
        // 最低字节 (第 0-7 位)
        int d = ipInt & 0xFF;

        return a + "." + b + "." + c + "." + d;
    }

    /**
     * 字符串 IP -> 整型 IP (反向转换，方便测试)
     * @param ipStr
     * @return
     */
    public static int ipToInt(String ipStr) {
        String[] parts = ipStr.split("\\.");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);
        int d = Integer.parseInt(parts[3]);
        return (a << 24) | (b << 16) | (c << 8) | d;
    }

}
