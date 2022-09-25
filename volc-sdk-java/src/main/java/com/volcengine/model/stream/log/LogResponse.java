package com.volcengine.model.stream.log;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.stream.CommonPo;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LogResponse {
    @JSONField(name = "ResponseMetadata")
    CommonPo.ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    String result;
}
