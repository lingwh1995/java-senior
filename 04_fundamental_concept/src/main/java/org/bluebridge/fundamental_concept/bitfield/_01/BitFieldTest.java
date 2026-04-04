package org.bluebridge.fundamental_concept.bitfield._01;

/**
 * @author lingwh
 * @desc
 * @date 2026/4/4 20:29
 */
public class BitFieldTest {

    public static void main(String[] args) {
        BitField bf = new BitField();

        // 测试设置
        bf.setS1(1);
        bf.setS2(3);
        bf.setS3(31);

        // 测试获取
        System.out.println("S1: " + bf.getS1()); // 1
        System.out.println("S2: " + bf.getS2()); // 3
        System.out.println("S3: " + bf.getS3()); // 31
        System.out.printf("Raw: 0x%02X%n", bf.getRaw()); // 0xFF

        // 测试从原始值恢复
        bf.setRaw(0xAA);
        System.out.println("\nAfter setRaw(0xAA):");
        System.out.println("S1: " + bf.getS1()); // 0
        System.out.println("S2: " + bf.getS2()); // 1
        System.out.println("S3: " + bf.getS3()); // 21
    }

}
