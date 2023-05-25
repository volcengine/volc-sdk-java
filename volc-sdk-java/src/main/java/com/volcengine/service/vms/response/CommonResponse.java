package com.volcengine.service.vms.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class CommonResponse<T> {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    private T result;
}
