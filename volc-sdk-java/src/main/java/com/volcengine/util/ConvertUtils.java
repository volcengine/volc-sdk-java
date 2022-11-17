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
}
