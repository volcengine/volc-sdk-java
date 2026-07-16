package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ParquetField {
    @JSONField(name = "Key")
    private String key;
    @JSONField(name = "TransType")
    private String transType;
}
