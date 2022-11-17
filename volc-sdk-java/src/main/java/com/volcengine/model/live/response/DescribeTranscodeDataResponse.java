package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class DescribeTranscodeDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    private DescribeTranscodeDataOutput  Result;

    @Data
    public static class TranscodeData {
        @JSONField(name = "Time")
        private String Time;

        @JSONField(name = "VCodec")
        private String VCodec;

        @JSONField(name = "Resolution")
        private String Resolution;

        @JSONField(name = "Duration")
        private double Duration;
    }

    @Data
    private static class DescribeTranscodeDataOutput {
        @JSONField(name = "Duration")
        private double Duration;
        @JSONField(name = "List")
        private List<TranscodeData> List;
    }
}



