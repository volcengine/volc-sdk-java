package com.volcengine.helper;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.util.JsonFormat;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.*;
import java.util.zip.CRC32;

public class Utils {

    public static List<NameValuePair> mapToPairList(Map<String, String> params) {
        List<NameValuePair> res = new ArrayList<NameValuePair>();

        if (params != null) {
            for (String key : params.keySet()) {
                res.add(new BasicNameValuePair(key, params.get(key)));
            }
        }
        return res;
    }

    public static String hashSHA256(byte[] content) throws Exception {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            return Hex.encodeHexString(md.digest(content));
        } catch (Exception e) {
            throw new Exception(
                    "Unable to compute hash while signing request: "
                            + e.getMessage(), e);
        }
    }

    public static byte[] hmacSHA256(byte[] key, String content) throws Exception {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(key, "HmacSHA256"));
            return mac.doFinal(content.getBytes());
        } catch (Exception e) {
            throw new Exception(
                    "Unable to calculate a request signature: "
                            + e.getMessage(), e);
        }
    }

    public static byte[] hmacSHA1(byte[] key, String content) throws Exception {
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(key, "HmacSHA1"));
            return mac.doFinal(content.getBytes());
        } catch (Exception e) {
            throw new Exception(
                    "Unable to calculate a request signature: "
                            + e.getMessage(), e);
        }
    }

    public static String randWeights(Map<String, Integer> weightsMap, String excludeDomain) {
        int weightSum = 0;
        for (Map.Entry<String, Integer> entry : weightsMap.entrySet()) {
            if (entry.getKey().equals(excludeDomain)) {
                continue;
            }
            weightSum += entry.getValue();
        }
        if (weightSum <= 0) {
            return "";
        }

        Random random = new Random();
        int r = random.nextInt(weightSum) + 1;

        for (Map.Entry<String, Integer> entry : weightsMap.entrySet()) {
            if (entry.getKey().equals(excludeDomain)) {
                continue;
            }
            r -= entry.getValue();
            if (r <= 0) {
                return entry.getKey();
            }
        }
        return "";
    }

    public static String encode(Map<String, List<String>> v) {
        if (v == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        TreeMap<String, List<String>> treeMap = new TreeMap<>();
        treeMap.putAll(v);

        try {
            for (Map.Entry<String, List<String>> entry : treeMap.entrySet()) {
                String keyEscaped = URLEncoder.encode(entry.getKey(), "UTF-8");
                for (String s : entry.getValue()) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append("&");
                    }
                    stringBuilder.append(keyEscaped);
                    stringBuilder.append("=");
                    stringBuilder.append(URLEncoder.encode(s, "UTF-8"));
                }
            }
        } catch (UnsupportedEncodingException e) {
            return "";
        }

        return stringBuilder.toString();
    }

    public static long crc32(byte[] bytes) throws Exception {
        CRC32 crc = new CRC32();
        crc.update(bytes, 0, bytes.length);
        return crc.getValue();
    }

    // 对于List类型entry，逗号连接生成string value
    public static Map<String, String> paramsToMap(Object obj) {
        Map<String, Object> map = JSONObject.toJavaObject(JSONObject.parseObject(JSON.toJSONString(obj)), Map.class);
        Map<String, String> params = new HashMap<>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                continue;
            }
            Class<?> valueType = entry.getValue().getClass();
            if (valueType == null) {
                continue;
            }

            if (entry.getValue().getClass() == Integer.class) {
                params.put(entry.getKey(), ((Integer) entry.getValue()).toString());
            } else if (entry.getValue().getClass() == String.class) {
                params.put(entry.getKey(), (String) entry.getValue());
            } else if (entry.getValue().getClass() == JSONArray.class) {
                List<String> list = (List<String>) entry.getValue();
                try {
                    params.put(entry.getKey(), URLEncoder.encode(StringUtils.join(list, ","), "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    params.put(entry.getKey(), "");
                }
            }
        }
        return params;
    }

    // 对于List类型entry，拆分为多个Name-Value pair
    public static List<NameValuePair> paramsToPair(Object obj) {
        Map<String, Object> map = JSONObject.toJavaObject(JSONObject.parseObject(JSON.toJSONString(obj)), Map.class);
        List<NameValuePair> pairs = new ArrayList<>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                continue;
            }
            Class<?> valueType = entry.getValue().getClass();
            if (valueType == null) {
                continue;
            }

            if (entry.getValue().getClass() == Integer.class) {
                pairs.add(new BasicNameValuePair(entry.getKey(), ((Integer) entry.getValue()).toString()));
            } else if (entry.getValue().getClass() == String.class) {
                pairs.add(new BasicNameValuePair(entry.getKey(), (String) entry.getValue()));
            } else if (entry.getValue().getClass() == Long.class) {
                pairs.add(new BasicNameValuePair(entry.getKey(),((Long) entry.getValue()).toString()));
            } else if (entry.getValue().getClass() == Boolean.class) {
                pairs.add(new BasicNameValuePair(entry.getKey(),((Boolean) entry.getValue()).toString()));
            } else if (entry.getValue().getClass() == JSONArray.class) {
                List<String> list = (List<String>) entry.getValue();
                for (String item : list) {
                    pairs.add(new BasicNameValuePair(entry.getKey(), item));
                }
            }
        }
        return pairs;
    }

    // 对于List类型entry，逗号连接生成string value
    public static Map<String, String> protoBufferToMap(MessageOrBuilder obj, boolean needDefaultValueFields) throws InvalidProtocolBufferException {
        JsonFormat.Printer printer = JsonFormat.printer();
        if (needDefaultValueFields) {
            printer = printer.includingDefaultValueFields();
        }
        Map<String, Object> map = JSONObject.toJavaObject(JSONObject.parseObject(printer.print(obj)), Map.class);
        Map<String, String> params = new HashMap<>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue().getClass() == Integer.class) {
                params.put(entry.getKey(), ((Integer) entry.getValue()).toString());
            } else if (entry.getValue().getClass() == String.class) {
                params.put(entry.getKey(), (String) entry.getValue());
            } else if (entry.getValue().getClass() == Boolean.class) {
                params.put(entry.getKey(), ((Boolean) entry.getValue()).toString());
            } else if (entry.getValue().getClass() == Float.class) {
                params.put(entry.getKey(), ((Float) entry.getValue()).toString());
            } else if (entry.getValue().getClass() == Double.class) {
                params.put(entry.getKey(), ((Double) entry.getValue()).toString());
            } else if (entry.getValue().getClass() == Byte.class) {
                params.put(entry.getKey(), ((Byte) entry.getValue()).toString());
            } else {
                params.put(entry.getKey(), JSONObject.toJSONString(entry.getValue()));
            }
        }
        return params;
    }
}
