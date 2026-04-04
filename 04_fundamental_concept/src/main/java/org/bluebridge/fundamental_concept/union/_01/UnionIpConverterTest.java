package org.bluebridge.fundamental_concept.union._01;

/**
 * @author lingwh
 * @desc
 * @date 2026/4/4 21:00
 */
public class UnionIpConverterTest {

    public static void main(String[] args) {
        // 测试用例 1：192.168.1.1 -> 0xC0A80101
        int ipInt1 = 0xC0A80101;
        String ipStr1 = UnionIpConverter.intToIp(ipInt1);
        System.out.println("0xC0A80101 -> " + ipStr1); // 192.168.1.1

        // 测试用例 2：10.0.0.1
        int ipInt2 = UnionIpConverter.ipToInt("10.0.0.1");
        System.out.println("10.0.0.1 -> 0x" + Integer.toHexString(ipInt2).toUpperCase());
        System.out.println("Reverse: " + UnionIpConverter.intToIp(ipInt2));

        // 测试用例 3：255.255.255.255 (广播地址)
        int ipInt3 = 0xFFFFFFFF;
        System.out.println("0xFFFFFFFF -> " + UnionIpConverter.intToIp(ipInt3));

        // 测试用例 4：0.0.0.0
        System.out.println("0x00000000 -> " + UnionIpConverter.intToIp(0));
    }

}
