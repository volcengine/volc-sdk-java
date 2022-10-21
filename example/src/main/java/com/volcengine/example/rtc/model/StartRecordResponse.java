package com.volcengine.example.rtc.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class StartRecordResponse {
    @JSONField(name = "Result")
    String Result;
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata ResponseMetadata;
}
