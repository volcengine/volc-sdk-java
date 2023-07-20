package com.volcengine.model.ipaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DetailInstanceResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetaData responseMetadata;
    @JSONField(name = "Result")
    Instance result;
}
