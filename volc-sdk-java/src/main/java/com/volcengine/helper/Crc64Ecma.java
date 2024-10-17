package com.volcengine.helper;

import java.util.zip.Checksum;

public class Crc64Ecma implements Checksum {
    public final static long ECMA_POLY = 0xC96C5795D7870F42L;

    private final static long[][] TABLE;

    private final static int WORD_NUM = 256;

    private long value;

    public Crc64Ecma() {
        this.value = 0;
    }

    @Override
    public void update(int b) {
        this.update(new byte[]{(byte)b}, 0, 1);
    }

    @Override
    public void update(byte[] b, int off, int len) {
        int idx = off;
        this.value = ~this.value;

        while (len >= 8) {
            value = TABLE[7][(int) (value & 0xFF ^ (b[idx] & 0xFF))]
                    ^ TABLE[6][(int) ((value >>> 8) & 0xFF ^ (b[idx + 1] & 0xFF))]
                    ^ TABLE[5][(int) ((value >>> 16) & 0xFF ^ (b[idx + 2] & 0xFF))]
                    ^ TABLE[4][(int) ((value >>> 24) & 0xFF ^ (b[idx + 3] & 0xFF))]
                    ^ TABLE[3][(int) ((value >>> 32) & 0xFF ^ (b[idx + 4] & 0xFF))]
                    ^ TABLE[2][(int) ((value >>> 40) & 0xFF ^ (b[idx + 5] & 0xFF))]
                    ^ TABLE[1][(int) ((value >>> 48) & 0xFF ^ (b[idx + 6] & 0xFF))]
                    ^ TABLE[0][(int) ((value >>> 56) ^ b[idx + 7] & 0xFF)];
            idx += 8;
            len -= 8;
        }

        while (len > 0) {
            value = TABLE[0][(int) ((this.value ^ b[idx]) & 0xFF)] ^ (this.value >>> 8);
            idx++;
            len--;
        }

        this.value = ~this.value;
    }

    @Override
    public long getValue() {
        return this.value;
    }

    @Override
    public void reset() {
        this.value = 0;
    }

    static {
        TABLE = new long[8][WORD_NUM];
        for (int i = 0; i < WORD_NUM; i++) {
            long crc = i;
            for (int j = 0; j < 8; j++) {
                if ((crc & 1) == 1) {
                    crc = (crc >>> 1) ^ ECMA_POLY;
                } else {
                    crc = (crc >>> 1);
                }
            }
            TABLE[0][i] = crc;
        }
        for (int i = 0; i < WORD_NUM; i++) {
            long crc = TABLE[0][i];
            for (int j = 1; j < 8; j++) {
                crc = TABLE[0][(int) (crc & 0xFF)] ^ (crc >>> 8);
                TABLE[j][i] = crc;
            }
        }
    }
}
