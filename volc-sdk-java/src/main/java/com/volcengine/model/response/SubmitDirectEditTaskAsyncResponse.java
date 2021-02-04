package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class SubmitDirectEditTaskAsyncResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "ReqId")
        String reqId;
    }
}
