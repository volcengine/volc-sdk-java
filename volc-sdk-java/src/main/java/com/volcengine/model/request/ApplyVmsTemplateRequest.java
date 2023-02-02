package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ApplyVmsTemplateRequest {
    @JSONField(name = "SubAccount")
    String subAccount;
    @JSONField(name = "ChannelType")
    String channelType;
    @JSONField(name = "Name")
    String name;
    @JSONField(name = "Theme")
    String theme;
    @JSONField(name = "Signature")
    String signature;
    @JSONField(name = "Contents")
    List<VmsElement> contents;
    @JSONField(name = "Caller")
    String caller;
}
