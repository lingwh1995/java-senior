package org.bluebridge.general_concept._07_endian._02;

import org.bluebridge.general_concept._07_endian._01.EndianUtils;

import java.nio.ByteOrder;

/**
 * @author think
 * @desc
 * @date 2026/4/7 18:12
 */
public class EndianUtilTest {

    public static void main(String[] args) {
        ByteOrder byteBufferEndian = EndianUtils.getByteBufferEndian();
        System.out.println("byteBufferEndian:" + byteBufferEndian);

        ByteOrder nativeEndian = EndianUtils.getNativeEndian();
        System.out.println("nativeEndian:" +  nativeEndian);

        boolean isLittleEndian = EndianUtils.isLittleEndian();
        System.out.println("isLittleEndian:" + isLittleEndian);

        short s = (short) 0x1234;
        int i = 0x12345678;
        System.out.printf("htons(0x%04X) = 0x%04X%n", s, EndianUtils.htons(s));
        System.out.printf("htonl(0x%08X) = 0x%08X%n", i, EndianUtils.htonl(i));
        System.out.printf("ntohs(0x%04X) = 0x%04X%n", s, EndianUtils.ntohs(s));
        System.out.printf("ntohl(0x%08X) = 0x%08X%n", i, EndianUtils.ntohl(i));
    }

}
