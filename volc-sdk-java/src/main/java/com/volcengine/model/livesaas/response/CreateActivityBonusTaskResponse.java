package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class CreateActivityBonusTaskResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    CreateActivityBonusTaskResponseBody result;

    @Data
    public static class CreateActivityBonusTaskResponseBody {
        @JSONField(name = "ActivityBonusTaskId")
        Long ActivityBonusTaskId;
    }
}

