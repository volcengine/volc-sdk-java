package com.volcengine.service.contentSecurity.impl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.stream.Stream;

public class SecuritySourceSseEvent {

    private static final String FIELD_DATA = "data";
    private static final String FIELD_OTHER_DATA = "{\"Result\"";

    public static Stream<SecuritySourceSseEvent> fromInputStream(InputStream is, Charset cs) {
        BufferedReader r = new BufferedReader(new InputStreamReader(is, cs));

        return r.lines().map(line -> {
            int colonIndex = line.indexOf(':');
            if (colonIndex == 0) {
                // skip comment
                return null;
            }

            String field, value;
            if (colonIndex < 0) {
                field = line;
                value = "";
            } else {
                field = line.substring(0, colonIndex);
                value = line.substring(colonIndex + 1);
            }

            if (field.equals(FIELD_DATA)) {
                return new SecuritySourceSseEvent(value);
            } else if (field.equals(FIELD_OTHER_DATA)) {
                // unexpect response
                return new SecuritySourceSseEvent(line);
            }
            return null;
        }).filter(Objects::nonNull);
    }

    private final String data;

    public SecuritySourceSseEvent(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

}
