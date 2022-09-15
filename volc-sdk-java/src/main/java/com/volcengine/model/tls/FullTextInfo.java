package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullTextInfo {
    @JSONField(name=CASE_SENSITIVE)
    boolean caseSensitive;
    @JSONField(name=DELIMITER)
    String delimiter;
    @JSONField(name=INCLUDE_CHINESE)
    boolean includeChinese;

}
