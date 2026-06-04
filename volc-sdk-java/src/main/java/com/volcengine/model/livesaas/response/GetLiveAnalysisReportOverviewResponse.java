package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ActivityHistoryBasicInfo;
import com.volcengine.model.beans.livesaas.AggDataForm;
import com.volcengine.model.beans.livesaas.HighlightInfo;
import com.volcengine.model.beans.livesaas.InteractToolInfo;
import com.volcengine.model.beans.livesaas.LiveAnalysisOverview;
import com.volcengine.model.beans.livesaas.ProductExplainInfo;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetLiveAnalysisReportOverviewResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetLiveAnalysisReportOverviewResponseBody result;

    @Data
    public static class GetLiveAnalysisReportOverviewResponseBody {
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "HistoryId")
        Long HistoryId;
        @JSONField(name = "Status")
        Integer Status;
        @JSONField(name = "ErrorMessage")
        String ErrorMessage;
        @JSONField(name = "Overview")
        LiveAnalysisOverview Overview;
        @JSONField(name = "Datas")
        List<AggDataForm> Datas;
        @JSONField(name = "Highlights")
        List<HighlightInfo> Highlights;
        @JSONField(name = "Products")
        List<ProductExplainInfo> Products;
        @JSONField(name = "InteractTools")
        List<InteractToolInfo> InteractTools;
        @JSONField(name = "BasicInfo")
        ActivityHistoryBasicInfo BasicInfo;
        @JSONField(name = "ActivityName")
        String ActivityName;
        @JSONField(name = "CoverImage")
        String CoverImage;
        @JSONField(name = "VerticalCoverImage")
        String VerticalCoverImage;
    }
}
