package org.bluebridge.fundamental_concept;

/**
 * @author lingwh
 * @desc
 * @date 2026/4/4 20:13
 */
public class BitMapTest {

    // 测试
    public static void main(String[] args) {
        BitMap bitMap = new BitMap(100);
        bitMap.set(35);
        System.out.println(bitMap.get(35)); // true
        System.out.println(bitMap.get(36)); // false
        bitMap.clear(35);
        System.out.println(bitMap.get(35)); // false
    }
    
}
