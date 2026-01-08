package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class CsvInfo {
    @JSONField(name = KEYS)
    private List<String> keys;

    @JSONField(name = DELIMITER)
    private String delimiter;

    @JSONField(name = ESCAPE_CHAR)
    private String escapeChar;

    @JSONField(name = PRINT_HEADER)
    private Boolean printHeader;

    @JSONField(name = NON_FIELD_CONTENT)
    private String nonFieldContent;
}