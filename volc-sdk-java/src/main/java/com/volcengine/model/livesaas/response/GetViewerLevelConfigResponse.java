package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ViewerLevelMetas;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetViewerLevelConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetViewerLevelConfigResponse.GetViewerLevelConfigResponseBody result;

    @Data
    public static class GetViewerLevelConfigResponseBody {
        @JSONField(name = "ViewerLevelMetas")
        List<ViewerLevelMetas> ViewerLevelMetas;
    }
}
