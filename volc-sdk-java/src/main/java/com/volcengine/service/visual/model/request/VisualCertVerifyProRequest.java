package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualCertVerifyProRequest {

    @JSONField(name = "req_key")
    String reqKey;

    @JSONField(name = "byted_token")
    String bytedToken;

    @JSONField(name = "sdk_data")
    String sdkData;

    @JSONField(name = "video_key")
    String videoKey;

    @JSONField(name = "tos_bucket")
    String tosBucket;

    @JSONField(name = "risk_info")
    String riskInfo;

    @JSONField(name = "extra")
    JSONObject extra;
}