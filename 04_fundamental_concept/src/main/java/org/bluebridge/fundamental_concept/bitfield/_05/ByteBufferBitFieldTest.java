package org.bluebridge.fundamental_concept.bitfield._05;

/**
 * @author lingwh
 * @desc
 * @date 2026/4/4 20:47
 */
public class ByteBufferBitFieldTest {

    private static final int S1_OFF = 0, S1_LEN = 1;
    private static final int S2_OFF = 1, S2_LEN = 2;
    private static final int S3_OFF = 3, S3_LEN = 5;

    public static void main(String[] args) {
        ByteBufferBitField bitField = new ByteBufferBitField();

        // 测试设置
        bitField.set(S1_OFF, S1_LEN, 1);
        bitField.set(S2_OFF, S2_LEN, 3);
        bitField.set(S3_OFF, S3_LEN, 31);

        System.out.printf("Raw: 0x%016X%n", bitField.getRaw());
        System.out.println("S1: " + bitField.get(S1_OFF, S1_LEN)); // 1
        System.out.println("S2: " + bitField.get(S2_OFF, S2_LEN)); // 3
        System.out.println("S3: " + bitField.get(S3_OFF, S3_LEN)); // 31

        // 测试字节数组转换
        System.out.println("\nBytes: ");
        for (byte b : bitField.toBytes()) {
            System.out.printf("%02X ", b);
        }
    }

}
