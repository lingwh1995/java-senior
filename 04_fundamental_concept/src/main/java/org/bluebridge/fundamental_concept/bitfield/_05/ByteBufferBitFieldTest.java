package org.bluebridge.fundamental_concept.bitfield._05;

/**
 * @author lingwh
 * @desc
 * @date 2026/4/4 20:47
 */
public class ByteBufferBitFieldTest {

    public static void main(String[] args) {
        ByteBufferBitField bitField = new ByteBufferBitField();

        // 每次 set 都必须重新赋值！
        bitField.set(0, 1, 1);
        System.out.println("S1: " + bitField.get(0, 1));

        bitField.set(1, 2, 3);
        System.out.println("S2: " + bitField.get(1, 2));

        bitField.set(3, 5, 31);
        System.out.println("S3: " + bitField.get(3, 5));

        System.out.println("\nBytes: ");
        for (byte b : bitField.toBytes()) {
            System.out.printf("%02X ", b);
        }
    }

}
