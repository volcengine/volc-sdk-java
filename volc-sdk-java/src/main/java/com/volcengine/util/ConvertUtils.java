package com.volcengine.util;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ConvertUtils {
    public static List<NameValuePair> convertToPair(Object obj) throws Exception {
        List<NameValuePair> urlValues = new ArrayList<>();
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field: fields){
            field.setAccessible(true);
            if (field.get(obj) == null){
                continue;
            }
            urlValues.add(new BasicNameValuePair(field.getName(), field.get(obj).toString()));
        }
        return urlValues;
    }

    public static List<NameValuePair> convertToPairV2(Object obj) throws Exception {
        List<NameValuePair> urlValues = new ArrayList<>();
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Object value = field.get(obj);
            if (value == null) {
                continue;
            }
            // 若字段值是 List 类型，遍历其元素生成多个同名字的 NameValuePair
            if (value instanceof List) {
                List<?> list = (List<?>) value;
                for (Object item : list) {
                    if (item != null) { // 避免元素为 null 时生成无效参数
                        urlValues.add(new BasicNameValuePair(field.getName(), item.toString()));
                    }
                }
            } else {
                // 非 List 类型，按原逻辑生成单个 NameValuePair
                urlValues.add(new BasicNameValuePair(field.getName(), value.toString()));
            }
        }
        return urlValues;
    }
}
