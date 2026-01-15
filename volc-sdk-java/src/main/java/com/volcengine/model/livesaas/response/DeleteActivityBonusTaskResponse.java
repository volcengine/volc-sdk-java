package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteActivityBonusTaskResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DeleteActivityBonusTaskResponseBody result;

    @Data
    public static class DeleteActivityBonusTaskResponseBody {
        @JSONField(name = "Status")
        Integer Status;
    }
}

