package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SdkMonitorRequest {
    @JSONField(name = "Partner")
    String partner;
    @JSONField(name = "Category")
    String category;
    @JSONField(name = "AccessToken")
    String accessToken;
    @JSONField(name = "Timestamp")
    long timestamp;
    @JSONField(name = "RespData")
    String respData;
    @JSONField(name = "OriginalAction")
    String originalAction;
    @JSONField(name = "TopRespCode")
    long topRespCode;
    @JSONField(name = "HttpCode")
    long httpCode;
    @JSONField(name = "Latency")
    long latency;
}
