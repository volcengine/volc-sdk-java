package com.volcengine.model.tls.util;

public class StringUtil {
    private StringUtil() {

    }

    public static String replaceWhiteSpaceCharacter(String str) {
        if (str == null) {
            return null;
        }
        return str.replace("\n", "\\n").replace("\r", "\\r").
                replace("\t", "\\t");
    }
}
