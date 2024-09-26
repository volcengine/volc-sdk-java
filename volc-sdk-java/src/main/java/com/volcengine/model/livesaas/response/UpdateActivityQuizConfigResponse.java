package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateActivityQuizConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateActivityQuizConfigResponseBody result;

    @Data
    public static class  UpdateActivityQuizConfigResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
        @JSONField(name = "Id")
        Long Id;
    }
}

