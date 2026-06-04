package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.HistoryBasicInfo;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListActivityLiveAnalysisHistoriesResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListActivityLiveAnalysisHistoriesResponseBody result;

    @Data
    public static class ListActivityLiveAnalysisHistoriesResponseBody {
        @JSONField(name = "LiveHistories")
        List<HistoryBasicInfo> LiveHistories;
        @JSONField(name = "TotalCount")
        Long TotalCount;
        @JSONField(name = "ActivityName")
        String ActivityName;
        @JSONField(name = "CoverImage")
        String CoverImage;
        @JSONField(name = "VerticalCoverImage")
        String VerticalCoverImage;
    }
}
