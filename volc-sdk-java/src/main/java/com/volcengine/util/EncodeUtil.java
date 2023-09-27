package com.volcengine.util;

import net.jpountz.lz4.LZ4Compressor;
import net.jpountz.lz4.LZ4Factory;
import net.jpountz.lz4.LZ4SafeDecompressor;

public class EncodeUtil {
    private static LZ4Factory factory = LZ4Factory.fastestInstance();

    public static byte[] lz4Decompress(byte[] data, int bodyRawSize) {
        if (data == null || data.length == 0) {
            return null;
        }
        int compressedLength = data.length;
        LZ4SafeDecompressor lz4SafeDecompressor = factory.safeDecompressor();
        byte[] restored = new byte[bodyRawSize];
        int decompressedLength = lz4SafeDecompressor.decompress(data, 0, compressedLength, restored, 0);
        byte[] result = new byte[decompressedLength];
        System.arraycopy(restored, 0, result, 0, decompressedLength);
        return result;
    }

    public static byte[] lz4Compress(byte[] data) {
        final int decompressedLength = data.length;
        LZ4Compressor compressor = factory.fastCompressor();
        int maxCompressedLength = compressor.maxCompressedLength(decompressedLength);
        byte[] compressed = new byte[maxCompressedLength];
        int compressedLength = compressor.compress(data, 0, decompressedLength, compressed, 0, maxCompressedLength);
        byte[] result = new byte[compressedLength];
        System.arraycopy(compressed, 0, result, 0, compressedLength);
        return result;


    }
}
