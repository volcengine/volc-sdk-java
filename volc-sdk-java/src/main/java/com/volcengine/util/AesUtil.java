package com.volcengine.util;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class AesUtil {
    /**
     * 加密数据
     *
     * @param data 明文内容
     * @param key  密钥
     * @return string
     */
    public static String aesCBCEncryptWithBase64(String data, String key) throws Exception {
        if (key == null || key.length() < 16) {
            throw new Exception("key length less than 16");
        }
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "AES"),
                new IvParameterSpec(Arrays.copyOfRange(key.getBytes(StandardCharsets.UTF_8), 0, cipher.getBlockSize())));
        byte[] result = cipher.doFinal(pkcs7padding(data, cipher.getBlockSize()));
        return Base64.getEncoder().encodeToString(result);
    }

    /**
     * pkcs7填充
     *
     * @param content   原始内容
     * @param blockSize 块大小
     * @return byte array
     */
    private static byte[] pkcs7padding(String content, int blockSize) {
        byte[] contentBytes = content.getBytes(StandardCharsets.UTF_8);
        int pad = blockSize - (contentBytes.length % blockSize);
        byte padChr = (byte) pad;
        byte[] paddedBytes = new byte[contentBytes.length + pad];
        System.arraycopy(contentBytes, 0, paddedBytes, 0, contentBytes.length);
        for (int i = contentBytes.length; i < paddedBytes.length; i++) {
            paddedBytes[i] = padChr;
        }
        return paddedBytes;
    }
}
