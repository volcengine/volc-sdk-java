package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class DescribeSnapshotDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribeSnapshotDataOutput Result;

    @Data
    public static class SnapshotData {
        @JSONField(name = "Time")
        private String Time;

        @JSONField(name = "Count")
        private int Count;
    }

    @Data
    private static class DescribeSnapshotDataOutput {
        @JSONField(name = "Count")
        private int Count;
        @JSONField(name = "List")
        private List<SnapshotData> List;
    }
}
