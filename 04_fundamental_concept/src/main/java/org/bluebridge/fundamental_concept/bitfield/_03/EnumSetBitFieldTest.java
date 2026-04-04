package org.bluebridge.fundamental_concept.bitfield._03;

import static org.bluebridge.fundamental_concept.bitfield._03.EnumSetBitField.Permission.*;

/**
 * @author lingwh
 * @desc
 * @date 2026/4/4 20:36
 */
public class EnumSetBitFieldTest {

    public static void main(String[] args) {
        EnumSetBitField bitField = new EnumSetBitField();

        // 测试添加权限
        bitField.add(READ);
        bitField.add(WRITE);
        System.out.println("After add READ, WRITE: " + bitField.getAll());
        System.out.println("Has READ: " + bitField.has(READ));   // true
        System.out.println("Has DELETE: " + bitField.has(DELETE)); // false

        // 测试删除权限
        bitField.remove(READ);
        System.out.println("\nAfter remove READ: " + bitField.getAll());
        System.out.println("Has READ: " + bitField.has(READ)); // false

        // 测试批量添加
        bitField.add(DELETE);
        bitField.add(ADMIN);
        System.out.println("\nAfter add DELETE, ADMIN: " + bitField.getAll());
    }

}
