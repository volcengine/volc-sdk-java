package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateInteractionScriptRecordConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
}
