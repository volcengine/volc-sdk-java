package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.ShortUrlConfig;
import lombok.Data;

@Data
public class ApplySmsTemplateRequest {
    @JSONField(name = "SubAccount")
    String subAccount;

    @JSONField(name = "Area")
    String area;

    @JSONField(name = "ChannelType")
    String channelType;

    @JSONField(name = "Content")
    String content;

    @JSONField(name = "Desc")
    String desc;

    @JSONField(name = "Name")
    String name;

    @JSONField(name = "ShortUrlConfig")
    ShortUrlConfig shortUrlConfig;
}

