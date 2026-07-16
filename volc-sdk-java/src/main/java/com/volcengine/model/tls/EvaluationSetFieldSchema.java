package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EvaluationSetFieldSchema {
    @JSONField(name = "Name")
    private String name;
    @JSONField(name = "Description")
    private String description;
    @JSONField(name = "ContentType")
    private String contentType;
    @JSONField(name = "DefaultDisplayFormat")
    private Integer defaultDisplayFormat;
    @JSONField(name = "IsRequired")
    private Boolean isRequired;
    @JSONField(name = "TextSchema")
    private String textSchema;
    @JSONField(name = "Key")
    private String key;
}
