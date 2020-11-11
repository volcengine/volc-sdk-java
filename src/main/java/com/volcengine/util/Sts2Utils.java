package com.volcengine.util;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.Credentials;
import com.volcengine.model.sts2.InnerToken;
import com.volcengine.model.sts2.Policy;
import com.volcengine.model.sts2.SecurityToken2;
import com.volcengine.model.sts2.Statement;
import org.apache.commons.codec.CharEncoding;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang3.RandomStringUtils;

import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.List;
import java.util.UUID;

public class Sts2Utils {
    public static String generateAccessKeyId(String prefix) {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        String uidBase64 = Base64.getEncoder().encodeToString(uuid.getBytes());
        return prefix + uidBase64.replace("=", "")
                .replace("/", "")
                .replace("+", "")
                .replace("-", "");
    }

    public static String generateSecretKey() throws Exception {
        String randString32 = RandomStringUtils.randomAlphabetic(32);
        return aesEncryptCBC(randString32, "bytedance-isgood".getBytes(CharEncoding.ISO_8859_1));

    }


    public static byte[] encrypt(String data, String key) throws Exception{
        String ivString = key;
        //偏移量
        byte[] iv = ivString.getBytes(CharEncoding.ISO_8859_1);
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
        int blockSize = cipher.getBlockSize();
        byte[] dataBytes = data.getBytes();
        int length = dataBytes.length;
        //计算需填充长度
        length = length + (blockSize - (length % blockSize));
        byte[] plaintext = new byte[length];
        //填充
        System.arraycopy(dataBytes, 0, plaintext, 0, dataBytes.length);
        SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(CharEncoding.ISO_8859_1), "AES");
        //设置偏移量参数
        IvParameterSpec ivSpec = new IvParameterSpec(iv);
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
        return cipher.doFinal(plaintext);
    }


    public static String aesEncryptCBC(String sSrc, byte[] sKey) throws Exception {
        if (sKey == null) {
            throw new RuntimeException("Key为空null");
        }
        if (sKey.length != 16) {
            throw new RuntimeException("Key长度不是16位");
        }
        byte[] encrypted = encrypt(sSrc, new String(sKey, CharEncoding.ISO_8859_1));
        return Base64.getEncoder().encodeToString(encrypted);//此处使用BASE64做转码功能，同时能起到2次加密的作用。
    }

    public static InnerToken createInnerToken(Credentials credentials, SecurityToken2 sts2, Policy inlinePolicy, long seconds) throws Exception {
        InnerToken innerToken = new InnerToken();
        innerToken.setLtAccessKeyId(credentials.getAccessKeyID());
        innerToken.setAccessKeyId(sts2.getAccessKeyId());
        innerToken.setExpiredTime(seconds);

        byte[] key = genMD5Checksum(credentials.getSecretAccessKey().getBytes());
        innerToken.setSignedSecretAccessKey(aesEncryptCBC(sts2.getSecretAccessKey(), key));

        innerToken.setPolicyString(JSON.toJSONString(inlinePolicy));

        String signStr = String.format("%s|%s|%d|%s|%s", innerToken.getLtAccessKeyId(), innerToken.getAccessKeyId(), innerToken.getExpiredTime(),
                innerToken.getSignedSecretAccessKey(), innerToken.getPolicyString());
        innerToken.setSignature(sha256Hex(key, signStr));
        return innerToken;
    }

    public static byte[] genMD5Checksum(byte[] content) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(content);
        return messageDigest.digest();
    }

    private static String sha256Hex(byte[] signingKey, String stringToSign) throws InvalidKeyException, NoSuchAlgorithmException {
        Charset UTF8 = Charset.forName("UTF-8");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(signingKey, "HmacSHA256"));
        return new String(Hex.encodeHex(mac.doFinal(stringToSign.getBytes(UTF8))));
    }

    public static Statement newAllowStatement(List<String> actions, List<String> resources) {
        Statement statement = new Statement();
        statement.setEffect("Allow");
        statement.setAction(actions);
        statement.setResource(resources);
        return statement;
    }

    public static Statement newDenyStatement(List<String> actions, List<String> resources) {
        Statement statement = new Statement();
        statement.setEffect("Deny");
        statement.setAction(actions);
        statement.setResource(resources);
        return statement;
    }
}
