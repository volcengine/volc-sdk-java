package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;

import lombok.Data;

@Data
public class VisualBaseResponse {
    
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "code")
    int code;

    @JSONField(name = "message")
    String message;

    @JSONField(name = "request_id")
    String requestId;

    @JSONField(name = "time_elapsed")
    String timeElapsed;
}