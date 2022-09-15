package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import static com.volcengine.model.tls.Const.*;

@Data
public class ValueInfo {
    @JSONField(name=VALUE_TYPE)
    String valueType;
    @JSONField(name=DELIMITER)
    String delimiter;
    @JSONField(name=CASE_SENSITIVE)
    boolean caseSensitive;
    @JSONField(name=INCLUDE_CHINESE)
    boolean includeChinese;
    @JSONField(name=SQL_FLAG)
    boolean sqlFlag;

}
