package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.VideoAISummaryProgress;
import com.volcengine.model.beans.livesaas.VideoSummaryParagraph;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetVideoAISummaryResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    GetVideoAISummaryResponseBody result;

    @Data
    public static class GetVideoAISummaryResponseBody {
        @JSONField(name = "VideoAISummaryProgress")
        VideoAISummaryProgress VideoAISummaryProgress;

        @JSONField(name = "SummaryContent")
        String SummaryContent;

        @JSONField(name = "ParagraphContents")
        List<VideoSummaryParagraph> ParagraphContents;

        @JSONField(name = "SummaryContentEn")
        String SummaryContentEn;

        @JSONField(name = "IsPublished")
        Boolean IsPublished;

        @JSONField(name = "IsLatest")
        Boolean IsLatest;
    }
}
