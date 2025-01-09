package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.Area;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateAreaConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Area result;
}
