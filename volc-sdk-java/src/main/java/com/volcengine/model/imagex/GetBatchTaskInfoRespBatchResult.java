package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetBatchTaskInfoRespBatchResult {
    @JSONField(name = "Action")
    String action;

    @JSONField(name = "Url")
    String url;

    @JSONField(name = "Size")
    Integer size;

    @JSONField(name = "StatusCode")
    Integer statusCode;

    @JSONField(name = "Err")
    String err;
}
