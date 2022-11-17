package com.volcengine.model.tls.util;


import com.volcengine.model.tls.exception.LogException;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SuppressWarnings("WeakCrypto")
public class MessageUtil {

    private MessageUtil() {
    }


    public static String md5CheckSum(byte[] bytes) throws LogException {
        // MD5 checksum
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new LogException("Message Digest Error", "No MD5 message digest algorithm", null);
        }
        md.update(bytes);
        byte b[] = md.digest();
        int i;
        StringBuffer buf = new StringBuffer();
        for (int offset = 0; offset < b.length; offset++) {
            i = b[offset];
            if (i < 0)
                i += 256;
            if (i < 16)
                buf.append("0");
            buf.append(Integer.toHexString(i));
        }
        return buf.toString();
    }


//    @Test
//    public void test() {
//        try {
//            String d41d8cd98f00b204e9800998ecf8427e = md5CheckSum(new String("d41d8cd98f00b204e9800998ecf8427e").getBytes(StandardCharsets.UTF_8));
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        }
//    }
}
