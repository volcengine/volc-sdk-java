package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ViewerConfigGroupMeta;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListAccountViewerLevelGroupResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata ResponseMetadata;
    
    @JSONField(name = "Result")
    ListAccountViewerLevelGroupResponseBody Result;

    @Data
    public static class ListAccountViewerLevelGroupResponseBody {
        @JSONField(name = "PageNo")
        Integer PageNo;
        
        @JSONField(name = "PageSize")
        Integer PageSize;
        
        @JSONField(name = "TotalCount")
        Integer TotalCount;
        
        @JSONField(name = "ViewerConfigGroupMetas")
        List<ViewerConfigGroupMeta> ViewerConfigGroupMetas;
    }
}