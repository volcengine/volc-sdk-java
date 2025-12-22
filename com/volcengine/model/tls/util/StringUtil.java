package com.volcengine.model.tls.util;

public class StringUtil {
    public static String replaceWhiteSpaceCharacter(String input) {
        if (input == null) {
            return null;
        }
        return input.replace("\\n", "\n")
                   .replace("\\t", "\t")
                   .replace("\\r", "\r");
    }
}