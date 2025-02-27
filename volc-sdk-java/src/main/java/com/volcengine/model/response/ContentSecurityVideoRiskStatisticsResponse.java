package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ContentSecurityVideoRiskStatisticsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    VideoRiskStatisticsRsp result;


    @Data
    public static class VideoRiskStatisticsRsp {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private VideoRiskStatisticsInfo data;
    }

    @Data
    public static class VideoRiskStatisticsInfo {
        @JSONField(name = "VideoTotal")
        private VideoBaseStatisticsRsp videoTotal;
        @JSONField(name = "VideoTrendRecord")
        private List<VideoBaseTrendRecordRsp> videoTrendRecord;
        @JSONField(name = "VideoRiskTotal")
        private VideoContentRiskBaseCountRsp videoRiskTotal;
        @JSONField(name = "VideoRiskTrendRecord")
        private VideoContentRiskBaseCountRsp videoRiskTrendRecord;
    }

    @Data
    public static class VideoBaseStatisticsRsp {
        @JSONField(name = "SplitCnt")
        private Long splitCnt;
        @JSONField(name = "PassSplitCnt")
        private Long passSplitCnt;
        @JSONField(name = "BlockSplitCnt")
        private Long blockSplitCnt;
        @JSONField(name = "ReviewSplitCnt")
        private Long reviewSplitCnt;
        @JSONField(name = "RequestCnt")
        private Long requestCnt;
        @JSONField(name = "PassCnt")
        private Long passCnt;
        @JSONField(name = "BlockCnt")
        private Long blockCnt;
        @JSONField(name = "ReviewCnt")
        private Long reviewCnt;
        @JSONField(name = "RequestDuration")
        private Double requestDuration;
        @JSONField(name = "PassDuration")
        private Double passDuration;
        @JSONField(name = "BlockDuration")
        private Double blockDuration;
        @JSONField(name = "ReviewDuration")
        private Double reviewDuration;
        @JSONField(name = "PassFrameCnt")
        private Long passFrameCnt;
        @JSONField(name = "BlockFrameCnt")
        private Long blockFrameCnt;
        @JSONField(name = "ReviewFrameCnt")
        private Long reviewFrameCnt;
        @JSONField(name = "FrameCnt")
        private Long frameCnt;
    }

    @Data
    public static class VideoBaseTrendRecordRsp {
        @JSONField(name = "StartTime")
        private Long startTime;
        @JSONField(name = "SplitCnt")
        private Long splitCnt;
        @JSONField(name = "PassSplitCnt")
        private Long passSplitCnt;
        @JSONField(name = "BlockSplitCnt")
        private Long blockSplitCnt;
        @JSONField(name = "ReviewSplitCnt")
        private Long reviewSplitCnt;
        @JSONField(name = "RequestCnt")
        private Long requestCnt;
        @JSONField(name = "PassCnt")
        private Long passCnt;
        @JSONField(name = "BlockCnt")
        private Long blockCnt;
        @JSONField(name = "ReviewCnt")
        private Long reviewCnt;
        @JSONField(name = "RequestDuration")
        private Double requestDuration;
        @JSONField(name = "PassDuration")
        private Double passDuration;
        @JSONField(name = "BlockDuration")
        private Double blockDuration;
        @JSONField(name = "ReviewDuration")
        private Double reviewDuration;
        @JSONField(name = "PassFrameCnt")
        private Long passFrameCnt;
        @JSONField(name = "BlockFrameCnt")
        private Long blockFrameCnt;
        @JSONField(name = "ReviewFrameCnt")
        private Long reviewFrameCnt;
        @JSONField(name = "FrameCnt")
        private Long frameCnt;
    }

    @Data
    public static class VideoContentRiskBaseCountRsp {
        @JSONField(name = "Request")
        private com.volcengine.model.response.ContentSecurityTextRiskStatisticsResponse.ContentRiskBaseCountRsp request;
        @JSONField(name = "Split")
        private com.volcengine.model.response.ContentSecurityTextRiskStatisticsResponse.ContentRiskBaseCountRsp split;
        @JSONField(name = "Frame")
        private com.volcengine.model.response.ContentSecurityTextRiskStatisticsResponse.ContentRiskBaseCountRsp frame;
    }
}
