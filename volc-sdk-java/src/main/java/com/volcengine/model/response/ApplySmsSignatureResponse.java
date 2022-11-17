package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.SmsSignatureInfo;
import lombok.Data;

@Data
public class ApplySmsSignatureResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    SmsSignatureInfo result;
}
