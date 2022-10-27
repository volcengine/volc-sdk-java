package com.volcengine.example.rtc.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetRecordTaskResponse {
    @JSONField(name = "Result")
    Result Result;
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata ResponseMetadata;

    @Data
    public class RecordFileList {
        @JSONField(name = "Vid")
        public String vid;
        @JSONField(name = "Duration")
        public int duration;
        @JSONField(name = "Size")
        public int size;
        @JSONField(name = "StartTime")
        public long startTime;
        @JSONField(name = "StreamList")
        public StreamList[] streamList;
    }

    @Data
    public class RecordTask {
        @JSONField(name = "StartTime")
        public long startTime;
        @JSONField(name = "EndTime")
        public long endTime;
        @JSONField(name = "Status")
        public int status;
        @JSONField(name = "StopReason")
        public String stopReason;
        @JSONField(name = "RecordFileList")
        public RecordFileList[] recordFileList;
    }

    @Data
    public class Result {
        @JSONField(name = "RecordTask")
        public RecordTask recordTask;
    }

    @Data
    public class Root {
        @JSONField(name = "Result")
        public Result result;
        @JSONField(name = "ResponseMetadata")
        public ResponseMetadata responseMetadata;
    }

    @Data
    public class StreamList {
        @JSONField(name = "UserId")
        public String userId;
        @JSONField(name = "StreamType")
        public int streamType;
    }

}