package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ContentSecurityAudioRiskStatisticsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    AudioRiskStatisticsRsp result;


    @Data
    public static class AudioRiskStatisticsRsp {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private AudioRiskStatisticsInfo data;
    }

    @Data
    public static class AudioRiskStatisticsInfo {
        @JSONField(name = "AudioTotal")
        private AudioBaseStatisticsRsp audioTotal;
        @JSONField(name = "AudioTrendRecord")
        private List<AudioBaseTrendRecordRsp> audioTrendRecord;
        @JSONField(name = "AudioRiskTotal")
        private AudioContentRiskBaseCountRsp audioRiskTotal;
        @JSONField(name = "AudioRiskTrendRecord")
        private AudioContentRiskBaseCountRsp audioRiskTrendRecord;
    }

    @Data
    public static class AudioBaseStatisticsRsp {
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
    }

    @Data
    public static class AudioBaseTrendRecordRsp {
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
    }

    @Data
    public static class AudioContentRiskBaseCountRsp {
        @JSONField(name = "Request")
        private com.volcengine.model.response.ContentSecurityTextRiskStatisticsResponse.ContentRiskBaseCountRsp request;
        @JSONField(name = "Split")
        private com.volcengine.model.response.ContentSecurityTextRiskStatisticsResponse.ContentRiskBaseCountRsp split;
    }
}
