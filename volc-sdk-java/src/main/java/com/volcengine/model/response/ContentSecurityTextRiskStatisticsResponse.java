package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ContentSecurityTextRiskStatisticsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    TextRiskStatisticsRsp result;


    @Data
    public static class TextRiskStatisticsRsp {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        TextRiskStatisticsInfo data;
    }

    @Data
    public static class TextRiskStatisticsInfo {
        @JSONField(name = "TextTotal")
        private TextBaseStatisticsRsp textTotal;
        @JSONField(name = "TextTrendRecord")
        private List<TextBaseTrendRecordRsp> textTrendRecord;
        @JSONField(name = "TextRiskTotal")
        private ContentRiskBaseCountRsp textRiskTotal;
        @JSONField(name = "TextRiskTrendRecord")
        private ContentRiskBaseCountRsp textRiskTrendRecord;
    }

    @Data
    public static class TextBaseStatisticsRsp {
        @JSONField(name = "RequestWordCnt")
        private Long requestWordCnt;
        @JSONField(name = "PassWordCnt")
        private Long passWordCnt;
        @JSONField(name = "BlockWordCnt")
        private Long blockWordCnt;
        @JSONField(name = "ReviewWordCnt")
        private Long reviewWordCnt;
        @JSONField(name = "RequestCnt")
        private Long requestCnt;
        @JSONField(name = "PassCnt")
        private Long passCnt;
        @JSONField(name = "BlockCnt")
        private Long blockCnt;
        @JSONField(name = "ReviewCnt")
        private Long reviewCnt;
    }

    @Data
    public static class TextBaseTrendRecordRsp {
        @JSONField(name = "StartTime")
        private Long startTime;
        @JSONField(name = "RequestWordCnt")
        private Long requestWordCnt;
        @JSONField(name = "PassWordCnt")
        private Long passWordCnt;
        @JSONField(name = "BlockWordCnt")
        private Long blockWordCnt;
        @JSONField(name = "ReviewWordCnt")
        private Long reviewWordCnt;
        @JSONField(name = "RequestCnt")
        private Long requestCnt;
        @JSONField(name = "PassCnt")
        private Long passCnt;
        @JSONField(name = "BlockCnt")
        private Long blockCnt;
        @JSONField(name = "ReviewCnt")
        private Long reviewCnt;
    }

    @Data
    public static class ContentRiskBaseCountRsp {
        @JSONField(name = "All")
        private List<Map<String, Long>> all;
        @JSONField(name = "Block")
        private List<Map<String, Long>> block;
        @JSONField(name = "Review")
        private List<Map<String, Long>> review;
    }
}
