package com.dragonsoft.designpattern.structure.flyweight.jdk;

import org.junit.Test;

/**
 * @author lingwh
 * @desc
 * @date 2025/12/10 11:47
 */
public class StringTest {

    /**
     * String 享元模式的三种体现
     *  1. 字符串常量池
     *  2. intern() 方法
     *  3. valueOf()
     *  4. 字符串拼接
     */
    @Test
    public void testFlyweight() {
        // 字符串字面量自动进入常量池
        // 存入字符串常量池
        String s1 = "Hello";
        // 复用池中已有对象
        String s2 = "Hello";
        // true
        System.out.println(s1 == s2);

        // new String() 创建的对象不在常量池中
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        // false
        System.out.println(s3 == s4);

        // 通过 intern() 方法获取常量池引用
        String s5 = s3.intern();
        String s6 = s4.intern();
        // true
        System.out.println(s5 == s6);
        // true
        System.out.println(s5 == s1);

        // valueOf() 方法有时也会使用常量池
        String s7 = String.valueOf("hello");
        String s8 = String.valueOf("hello");
        // true
        System.out.println(s7 == s8);

        // valueOf() 方法有时也会使用常量池
        String s9 = String.valueOf(123);
        String s10 = String.valueOf(123);
        // true
        System.out.println(s9 == s10);
    }

}
