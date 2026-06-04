package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ContentSegmentItem;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListActivityContentAnalysisResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListActivityContentAnalysisResponseBody result;

    @Data
    public static class ListActivityContentAnalysisResponseBody {
        @JSONField(name = "Segments")
        List<ContentSegmentItem> Segments;
        @JSONField(name = "TotalCount")
        Long TotalCount;
    }
}
