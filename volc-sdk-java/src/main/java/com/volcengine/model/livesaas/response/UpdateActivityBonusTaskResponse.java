package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateActivityBonusTaskResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    UpdateActivityBonusTaskResponseBody result;

    @Data
    public static class UpdateActivityBonusTaskResponseBody {
        @JSONField(name = "Status")
        Integer Status;
    }
}

