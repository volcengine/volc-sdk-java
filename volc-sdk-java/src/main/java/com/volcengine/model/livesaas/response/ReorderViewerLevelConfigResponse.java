package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;
@Data
public class ReorderViewerLevelConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ReorderViewerLevelConfigResponse.ReorderViewerLevelConfigResponseBody result;

    @Data
    public static class ReorderViewerLevelConfigResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
