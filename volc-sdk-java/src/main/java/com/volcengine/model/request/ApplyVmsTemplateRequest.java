package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.ShortUrlConfig;
import com.volcengine.model.request.sms.ApplySmsTemplateV2Request;
import lombok.Data;

import java.util.List;

@Data
public class ApplyVmsTemplateRequest {
    @JSONField(name = "subAccount")
    String subAccount;
    @JSONField(name = "channelType")
    String channelType;
    @JSONField(name = "name")
    String name;
    @JSONField(name = "theme")
    String theme;
    @JSONField(name = "signature")
    String signature;
    @JSONField(name = "contents")
    List<VmsElement> contents;

    @JSONField(name = "shortUrlConfig")
    private ShortUrlConfig shortUrlConfig;
}
