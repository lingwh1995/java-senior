package org.bluebridge.fundamental_concept.bitfield._02;

/**
 * @author lingwh
 * @desc
 * @date 2026/4/4 20:32
 */
public class BitFieldTest {

    // 定义位域布局
    private static final int S1_OFF = 0, S1_LEN = 1;
    private static final int S2_OFF = 1, S2_LEN = 2;
    private static final int S3_OFF = 3, S3_LEN = 5;

    public static void main(String[] args) {
        // 测试创建和设置
        BitField bf = BitField.empty()
                .set(S1_OFF, S1_LEN, 1)
                .set(S2_OFF, S2_LEN, 3)
                .set(S3_OFF, S3_LEN, 31);

        System.out.println("After setting: " + bf);
        System.out.println("S1: " + bf.get(S1_OFF, S1_LEN)); // 1
        System.out.println("S2: " + bf.get(S2_OFF, S2_LEN)); // 3
        System.out.println("S3: " + bf.get(S3_OFF, S3_LEN)); // 31

        // 测试从原始值创建
        BitField bf2 = BitField.from(0xAA);
        System.out.println("\nFrom 0xAA: " + bf2);
        System.out.println("S1: " + bf2.get(S1_OFF, S1_LEN)); // 0
        System.out.println("S2: " + bf2.get(S2_OFF, S2_LEN)); // 1
        System.out.println("S3: " + bf2.get(S3_OFF, S3_LEN)); // 21
    }

}
