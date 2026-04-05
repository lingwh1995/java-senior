package org.bluebridge.fundamental_concept.union._02;

/**
 * @author lingwh
 * @desc
 * @date 2026/4/4 21:00
 */
public class IpConverterTest {

    public static void main(String[] args) {
        // 测试用例 1：192.168.1.1 -> 0xC0A80101
        int ipInt1 = 0xC0A80101;
        String ipStr1 = IpConverter.intToIp(ipInt1);
        System.out.println("0xC0A80101 -> " + ipStr1);
        // 反向测试：字符串转回 int
        int reverseInt1 = IpConverter.ipToInt(ipStr1);
        System.out.println(ipStr1 + " -> 0x" + Integer.toHexString(reverseInt1).toUpperCase());
        System.out.println("----------------------------------------");

        // 测试用例 2：10.0.0.1
        int ipInt2 = IpConverter.ipToInt("10.0.0.1");
        System.out.println("10.0.0.1 -> 0x" + Integer.toHexString(ipInt2).toUpperCase());
        System.out.println("Reverse: " + IpConverter.intToIp(ipInt2));
        // 反向测试：int 转回字符串
        String reverseStr2 = IpConverter.intToIp(ipInt2);
        int againInt2 = IpConverter.ipToInt(reverseStr2);
        System.out.println(reverseStr2 + " -> 0x" + Integer.toHexString(againInt2).toUpperCase());
        System.out.println("----------------------------------------");

        // 测试用例 3：255.255.255.255 (广播地址)
        int ipInt3 = 0xFFFFFFFF;
        System.out.println("0xFFFFFFFF -> " + IpConverter.intToIp(ipInt3));
        // 反向测试：字符串转回 int
        String ipStr3 = IpConverter.intToIp(ipInt3);
        int reverseInt3 = IpConverter.ipToInt(ipStr3);
        System.out.println(ipStr3 + " -> 0x" + Integer.toHexString(reverseInt3).toUpperCase());
        System.out.println("----------------------------------------");

        // 测试用例 4：0.0.0.0
        System.out.println("0x00000000 -> " + IpConverter.intToIp(0));
        // 反向测试：字符串转回 int
        int reverseInt4 = IpConverter.ipToInt("0.0.0.0");
        System.out.println("0.0.0.0 -> 0x" + Integer.toHexString(reverseInt4).toUpperCase());
    }

}
