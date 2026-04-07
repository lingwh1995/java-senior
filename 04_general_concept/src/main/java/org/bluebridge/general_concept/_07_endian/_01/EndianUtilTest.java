package org.bluebridge.general_concept._07_endian._01;

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
    }

}
