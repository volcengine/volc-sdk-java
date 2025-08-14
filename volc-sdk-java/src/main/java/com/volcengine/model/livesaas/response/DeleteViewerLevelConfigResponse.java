package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ViewerLevelMetas;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;
@Data
public class DeleteViewerLevelConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeleteViewerLevelConfigResponse. DeleteViewerLevelConfigResponseBody result;

    @Data
    public static class DeleteViewerLevelConfigResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
