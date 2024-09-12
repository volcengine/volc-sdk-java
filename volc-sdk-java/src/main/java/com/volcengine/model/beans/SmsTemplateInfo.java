package com.volcengine.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SmsTemplateInfo {
    @JSONField(name = "id")
    String id;
    @JSONField(name = "applyId")
    String applyId;
    @JSONField(name = "templateId")
    String templateId;
    @JSONField(name = "channelType")
    String channelType;
    @JSONField(name = "channelTypeName")
    String channelTypeName;
    @JSONField(name = "name")
    String name;
    @JSONField(name = "content")
    String content;
    @JSONField(name = "status")
    int status;
    @JSONField(name = "isOrder")
    boolean isOrder = true;
    @JSONField(name = "reason")
    String reason;
    @JSONField(name = "createdTime")
    long createdTime;
    @JSONField(name = "shortUrlConfig")
    ShortUrlConfig shortUrlConfig;
}
