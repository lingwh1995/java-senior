package org.bluebridge.general_concept._05_bitfield._04;

/**
 * @author lingwh
 * @desc
 * @date 2026/4/4 20:39
 */
public class BitSetBitFieldTest {

    public static void main(String[] args) {
        BitSetBitField bitField = new BitSetBitField();

        // 每次 set 都必须重新赋值！
        bitField.set(0, 1, 1);
        System.out.println("S1: " + bitField.get(0, 1));

        bitField.set(1, 2, 3);
        System.out.println("S2: " + bitField.get(1, 2));

        bitField.set(3, 5, 31);
        System.out.println("S3: " + bitField.get(3, 5));

        // 查看最终值
        System.out.println("最终: " + bitField);
    }

}
