package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DescribeTranscodePresetRequest {
    @JSONField(name = "Vhost")
    String Vhost;
    @JSONField(name = "App")
    String App;
}
