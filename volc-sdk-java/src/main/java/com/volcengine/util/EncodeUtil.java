package com.volcengine.util;

import net.jpountz.lz4.LZ4Compressor;
import net.jpountz.lz4.LZ4Factory;
import net.jpountz.lz4.LZ4SafeDecompressor;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

import static com.volcengine.model.tls.Const.LZ4;
import static com.volcengine.model.tls.Const.ZLIB;

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

    public static byte[] decompress(byte[] data, int bodyRawSize, String compressType) throws Exception {
        switch (compressType) {
            case LZ4:
                return EncodeUtil.lz4Decompress(data, bodyRawSize);
            case ZLIB:
                return EncodeUtil.zlibDecompress(data);
            default:
                return data;
        }
    }

    public static byte[] compressLog(byte[] body, String compressType) {
        if (LZ4.equalsIgnoreCase(compressType)) {
            return EncodeUtil.lz4Compress(body);
        }
        if (ZLIB.equalsIgnoreCase(compressType)) {
            return EncodeUtil.zlibCompress(body);
        }
        return body;
    }

    private static byte[] zlibCompress(byte[] data) {
        Deflater deflater = new Deflater();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
        try {
            deflater.setInput(data);
            deflater.finish();
            byte[] buffer = new byte[4 * 1024];
            while (!deflater.finished()) {
                int compressedSize = deflater.deflate(buffer);
                outputStream.write(buffer, 0, compressedSize);
            }
            return outputStream.toByteArray();
        } finally {
            deflater.end(); // 必须显式释放资源
        }
    }

    public static byte[] zlibDecompress(byte[] data) throws DataFormatException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream(data.length);
        Inflater decompressor = new Inflater();
        try {
            decompressor.setInput(data);
            final byte[] buf = new byte[4 * 1024];
            while (!decompressor.finished()) {
                int count = decompressor.inflate(buf);
                bos.write(buf, 0, count);
            }
            return bos.toByteArray();
        } finally {
            decompressor.end();
        }
    }
}
