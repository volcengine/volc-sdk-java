package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.CommonStatusBody;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteHighlightClipTaskResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CommonStatusBody result;
}
