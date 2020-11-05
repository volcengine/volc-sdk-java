package com.bytedanceapi.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SetVideoPublishStatusResponse {
    @JSONField(name = "StatusCode")
    int statusCode;
    @JSONField(name = "StatusMessage")
    String statusMessage;
}
