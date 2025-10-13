package com.volcengine.model.request.sms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetRelationTemplateListRequest {
    @JSONField(name = "signature")
    private String signature;
    @JSONField(name = "number")
    private String number;
    @JSONField(name = "link")
    private String link;
    @JSONField(name = "jumpLink")
    private String jumpLink;
}
