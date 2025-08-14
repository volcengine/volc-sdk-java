package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.model.beans.livesaas.ViewerLevelMetas;

import lombok.Data;

import java.util.List;

@Data
public class CreateViewerLevelConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CreateViewerLevelConfigResponse.CreateViewerLevelConfigResponseBody result;

    @Data
    public static class CreateViewerLevelConfigResponseBody {
        @JSONField(name = "ViewerLevelMetas")
        List<ViewerLevelMetas> ViewerLevelMetas;
    }
}
