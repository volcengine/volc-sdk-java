package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class BatchBindSignatureIdentResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    ResultBean resultBean;

    @Data
    public static class ResultBean {
        @JSONField(name = "msg")
        String msg;
    }
}
