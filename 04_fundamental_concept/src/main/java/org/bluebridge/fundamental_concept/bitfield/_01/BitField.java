package org.bluebridge.fundamental_concept.bitfield._01;

/**
 * @author lingwh
 * @desc 位域
 *       基础位运算实现位域: 特点：最快、最底层、无额外封装
 * @date 2026/4/4 20:14
 */
public class BitField {

    private int bits; // 底层存储

    // 位域定义：偏移量 + 掩码
    private static final int S1_OFFSET = 0;
    private static final int S1_MASK = 0b1;

    private static final int S2_OFFSET = 1;
    private static final int S2_MASK = 0b11;

    private static final int S3_OFFSET = 3;
    private static final int S3_MASK = 0b11111;

    // Getter
    public int getS1() { return (bits >> S1_OFFSET) & S1_MASK; }
    public int getS2() { return (bits >> S2_OFFSET) & S2_MASK; }
    public int getS3() { return (bits >> S3_OFFSET) & S3_MASK; }
    public int getRaw() { return bits; }

    // Setter
    public void setS1(int value) {
        bits = (bits & ~(S1_MASK << S1_OFFSET)) | ((value & S1_MASK) << S1_OFFSET);
    }
    public void setS2(int value) {
        bits = (bits & ~(S2_MASK << S2_OFFSET)) | ((value & S2_MASK) << S2_OFFSET);
    }
    public void setS3(int value) {
        bits = (bits & ~(S3_MASK << S3_OFFSET)) | ((value & S3_MASK) << S3_OFFSET);
    }
    public void setRaw(int bits) { this.bits = bits; }

}
