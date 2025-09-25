package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateViewerLevelGroupConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata ResponseMetadata;
    
    @JSONField(name = "Result")
    UpdateViewerLevelGroupConfigResponseBody Result;

    @Data
    public static class UpdateViewerLevelGroupConfigResponseBody {
        @JSONField(name = "ViewerLevelGroupId")
        Long ViewerLevelGroupId;
    }
}