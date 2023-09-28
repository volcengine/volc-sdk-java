package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetSendStatRequest {
    @JSONField(name = "startTime")
    String startTime;

    @JSONField(name = "endTime")
    String endTime;

    @JSONField(name = "signature")
    String signature;

    @JSONField(name = "smsAccount")
    String smsAccount;

    @JSONField(name = "templateId")
    String templateId;

    @JSONField(name = "channelType")
    String channelType;
}
