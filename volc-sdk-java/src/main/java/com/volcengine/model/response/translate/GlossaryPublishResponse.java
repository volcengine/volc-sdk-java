package com.volcengine.model.response.translate;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GlossaryPublishResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
}
