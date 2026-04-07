package org.bluebridge.general_concept._03_enumset;

import java.util.EnumSet;

public class EnumSetTest {

    // 定义一个状态枚举
    public enum Status {
        // 0 电源
        POWER,
        // 1 准备
        READY,
        // 2 运行
        RUNNING,
        // 3 错误
        ERROR,
        // 4 警告
        WARNING
    }

    public static void main(String[] args) {
        // 1. 创建空的 EnumSet => 二进制：00000
        EnumSet<Status> empty = EnumSet.noneOf(Status.class);
        System.out.println(empty);

        // 2. 创建包含所有枚举的 EnumSet => 二进制：11111
        EnumSet<Status> all = EnumSet.allOf(Status.class);
        System.out.println(all);

        // 3. 创建包含指定枚举的 EnumSet => 二进制：00101
        EnumSet<Status> assigned = EnumSet.of(Status.POWER, Status.RUNNING);
        System.out.println(assigned);

        // 4. 从某个开始到最后（范围）包含：POWER、READY、RUNNING、ERROR
        EnumSet<Status> range = EnumSet.range(Status.POWER, Status.ERROR);
        System.out.println(range);

        // 5. 复制另一个 EnumSet
        EnumSet<Status> copy = EnumSet.copyOf(all);
        System.out.println(copy);

        // 6. 增删改查（超级简单）
        EnumSet<Status> set = EnumSet.of(Status.POWER);
        System.out.println(set);
        // 添加
        set.add(Status.ERROR);
        System.out.println(set);
        // 删除
        set.remove(Status.ERROR);
        System.out.println(set);
        // 判断是否包含
        boolean hasPower = set.contains(Status.POWER);
        System.out.println(hasPower);
        // 清空
        set.clear();
        System.out.println(set);

        // 7. 遍历
        for (Status status : all) {
            System.out.println(status);
        }
    }

}
