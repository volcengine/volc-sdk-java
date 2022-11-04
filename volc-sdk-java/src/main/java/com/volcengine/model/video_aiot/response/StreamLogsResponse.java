package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class StreamLogsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListStreamRecordsResult listStreamRecordsResult;

    @Data
    public static class ListStreamRecordsResult {
        @JSONField(name = "PageNumber")
        int pageNumber;
        @JSONField(name = "PageSize")
        int pageSize;
        @JSONField(name = "TotalCount")
        int totalCount;

        @JSONField(name = "StreamRecords")
        List<StreamRecord> streamRecords;
    }

    @Data
    public static class StreamRecord {
        @JSONField(name = "RecordID")
        String recordID;
        @JSONField(name = "StreamID")
        String streamID;
        @JSONField(name = "StartTime")
        int startTime;
        @JSONField(name = "EndTime")
        int endTime;
        @JSONField(name = "Duration")
        int duration;
    }
}
