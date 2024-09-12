package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.ShortUrlConfig;
import lombok.Data;

@Data
public class ApplySmsTemplateRequest {
    @JSONField(name = "subAccount")
    String subAccount;

    @JSONField(name = "area")
    String area;

    @JSONField(name = "channelType")
    String channelType;

    @JSONField(name = "content")
    String content;

    @JSONField(name = "desc")
    String desc;

    @JSONField(name = "name")
    String name;

    @JSONField(name = "shortUrlConfig")
    ShortUrlConfig shortUrlConfig;
}

