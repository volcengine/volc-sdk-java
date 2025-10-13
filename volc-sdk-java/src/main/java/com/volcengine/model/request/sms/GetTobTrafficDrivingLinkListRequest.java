package com.volcengine.model.request.sms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetTobTrafficDrivingLinkListRequest {
    @JSONField(name = "link")
    private String link;
    @JSONField(name = "jumpLink")
    private String jumpLink;
}
