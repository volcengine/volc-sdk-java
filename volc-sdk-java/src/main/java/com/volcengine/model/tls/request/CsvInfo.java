package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;
import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class CsvInfo {
    @JSONField(name = KEYS)
    private String[] keys;

    @JSONField(name = DELIMITER)
    private String delimiter;

    @JSONField(name = ESCAPE_CHAR)
    private String escapeChar;

    @JSONField(name = PRINT_HEADER)
    private boolean printHeader;

    @JSONField(name = NON_FIELD_CONTENT)
    private String nonFieldContent;
}