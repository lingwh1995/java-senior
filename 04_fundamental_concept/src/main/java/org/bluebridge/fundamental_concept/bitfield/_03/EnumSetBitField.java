package org.bluebridge.fundamental_concept.bitfield._03;

import java.util.EnumSet;

/**
 * @author lingwh
 * @desc  EnumSet(Java 官方推荐的位域替代方案)
 *        特点：类型安全、可读性好、性能高
 *        适用：状态标志、权限控制
 * @date 2026/4/4 20:35
 */
public class EnumSetBitField {

    // 定义枚举
    public enum Permission {
        READ(0),    // 位 0
        WRITE(1),   // 位 1
        DELETE(2),  // 位 2
        ADMIN(3);   // 位 3

        final int bit;
        Permission(int bit) { this.bit = bit; }
    }

    // 使用 EnumSet
    private EnumSet<Permission> permissions = EnumSet.noneOf(Permission.class);

    public void add(Permission p) {
        permissions.add(p);
    }

    public void remove(Permission p) {
        permissions.remove(p);
    }

    public boolean has(Permission p) {
        return permissions.contains(p);
    }

    public EnumSet<Permission> getAll() {
        return EnumSet.copyOf(permissions);
    }

}
