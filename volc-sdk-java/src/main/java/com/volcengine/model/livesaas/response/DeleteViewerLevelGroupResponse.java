package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteViewerLevelGroupResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata ResponseMetadata;
    
    @JSONField(name = "Result")
    DeleteViewerLevelGroupResponseBody Result;
    
    @Data
    public static class DeleteViewerLevelGroupResponseBody {
        @JSONField(name = "Status")
        Integer Status;
    }
}