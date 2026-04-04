package org.bluebridge.fundamental_concept.bitfield._04;

import java.util.BitSet;

/**
 * @author lingwh
 * @desc BitSet实现位域(Java 标准库，动态位数，大量位操作 )
 * @date 2026/4/4 20:39
 */
public class BitSetBitField {

    private BitSet bitSet = new BitSet();

    // 设置位域
    public void set(int offset, int length, int value) {
        for (int i = 0; i < length; i++) {
            boolean bit = ((value >> i) & 1) == 1;
            bitSet.set(offset + i, bit);
        }
    }

    // 获取位域
    public int get(int offset, int length) {
        int value = 0;
        for (int i = 0; i < length; i++) {
            if (bitSet.get(offset + i)) {
                value |= (1 << i);
            }
        }
        return value;
    }

    public BitSet getBitSet() {
        return (BitSet) bitSet.clone();
    }

}
