package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteAreaConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeleteAreaConfigResponseBody result;

    @Data
    public static class DeleteAreaConfigResponseBody {
        @JSONField(name = "AreaId")
        String  AreaId;
    }
}
