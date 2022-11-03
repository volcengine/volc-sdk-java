package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
abstract public class GetImageOCRResponse<T> {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    public T getResult() {
        return null;
    }
}