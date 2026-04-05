package org.bluebridge.fundamental_concept.bitfield._01;

/**
 * @author lingwh
 * @desc
 * @date 2026/4/4 20:32
 */
public class NativeBitFieldTest {

    public static void main(String[] args) {
        NativeBitField bitField = NativeBitField.empty();

        // 每次 set 都必须重新赋值！
        bitField = bitField.set(0, 1, 1);
        System.out.println("S1: " + bitField.get(0, 1));

        bitField = bitField.set(1, 2, 3);
        System.out.println("S2: " + bitField.get(1, 2));

        bitField = bitField.set(3, 5, 31);
        System.out.println("S3: " + bitField.get(3, 5));

        // 查看最终值
        System.out.println("最终: " + bitField);
    }

}
