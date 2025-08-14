package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;
@Data
public class UpdateViewerLevelConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateViewerLevelConfigResponse.UpdateViewerLevelConfigResponseBody result;

    @Data
    public static class UpdateViewerLevelConfigResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
