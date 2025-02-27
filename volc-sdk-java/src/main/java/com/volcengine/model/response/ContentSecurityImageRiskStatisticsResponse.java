package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ContentSecurityImageRiskStatisticsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ImageRiskStatisticsRsp result;


    @Data
    public static class ImageRiskStatisticsRsp {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private ImageRiskStatisticsInfo data;
    }

    @Data
    public static class ImageRiskStatisticsInfo {
        @JSONField(name = "ImageTotal")
        private ImageBaseStatisticsRsp imageTotal;
        @JSONField(name = "ImageTrendRecord")
        private List<ImageBaseTrendRecordRsp> imageTrendRecord;
        @JSONField(name = "ImageRiskTotal")
        private com.volcengine.model.response.ContentSecurityTextRiskStatisticsResponse.ContentRiskBaseCountRsp imageRiskTotal;
        @JSONField(name = "ImageRiskTrendRecord")
        private com.volcengine.model.response.ContentSecurityTextRiskStatisticsResponse.ContentRiskBaseCountRsp imageRiskTrendRecord;
    }

    @Data
    public static class ImageBaseStatisticsRsp {
        @JSONField(name = "RequestFrameCnt")
        private Long requestFrameCnt;
        @JSONField(name = "PassFrameCnt")
        private Long passFrameCnt;
        @JSONField(name = "BlockFrameCnt")
        private Long blockFrameCnt;
        @JSONField(name = "ReviewFrameCnt")
        private Long reviewFrameCnt;
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
    public static class ImageBaseTrendRecordRsp {
        @JSONField(name = "StartTime")
        private Long startTime;
        @JSONField(name = "RequestFrameCnt")
        private Long requestFrameCnt;
        @JSONField(name = "PassFrameCnt")
        private Long passFrameCnt;
        @JSONField(name = "BlockFrameCnt")
        private Long blockFrameCnt;
        @JSONField(name = "ReviewFrameCnt")
        private Long reviewFrameCnt;
        @JSONField(name = "RequestCnt")
        private Long requestCnt;
        @JSONField(name = "PassCnt")
        private Long passCnt;
        @JSONField(name = "BlockCnt")
        private Long blockCnt;
        @JSONField(name = "ReviewCnt")
        private Long reviewCnt;
    }
}

