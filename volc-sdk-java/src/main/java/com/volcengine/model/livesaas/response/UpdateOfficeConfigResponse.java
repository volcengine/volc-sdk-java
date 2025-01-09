package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.Office;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateOfficeConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Office result;
}
