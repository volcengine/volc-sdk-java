package com.volcengine.model.stream.consumer;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.stream.CommonPo;
import lombok.Data;

@Data
public class FollowActionResponse {
    @JSONField(name = "ResponseMetadata")
    CommonPo.ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    String result;
}
