package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VmsTemplateInfo {
    @JSONField(name = "templateId")
    private String templateId;
}
