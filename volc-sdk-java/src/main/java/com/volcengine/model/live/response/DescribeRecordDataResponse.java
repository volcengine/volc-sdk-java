package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class DescribeRecordDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribeRecordDataOutput Result;

    @Data
    public static class DescribeRecordDataOutput {
        @JSONField(name = "Max")
        private int Max;

        @JSONField(name = "List")
        private List<RecordDataList> List;
    }

    @Data
    private static class RecordDataList {
        @JSONField(name = "Time")
        private String Time;

        @JSONField(name = "Value")
        private int Value;
    }
}
