package com.volcengine.model.stream.log;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.model.stream.CommonPo;
import lombok.Data;

@Data
public class LogResponse {
    @JSONField(name = "ResponseMetadata")
    CommonPo.ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    String result;
}
