package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class FeedBackRequest {
    @JSONField(name = "Timestamp")
    long timestamp;
    @JSONField(name = "Partner")
    String partner;
    @JSONField(name = "AccessToken")
    String accessToken;
    @JSONField(name = "Ouid")
    String ouid;
    @JSONField(name = "GroupId")
    String groupId;
    @JSONField(name = "ContentType")
    String contentType;
    @JSONField(name = "ReportFrom")
    String reportFrom;
    @JSONField(name = "Source")
    String source;
    @JSONField(name = "ReportType")
    String reportType;
}
