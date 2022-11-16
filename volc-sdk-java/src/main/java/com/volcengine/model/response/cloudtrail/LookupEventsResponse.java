package com.volcengine.model.response.cloudtrail;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class LookupEventsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Result result;

    @Data
    public static class Result {
        @JSONField(name = "NextToken")
        String nextToken;
        @JSONField(name = "Trails")
        List<TrailEvent> trails;
    }

    @Data
    public static class TrailEvent {
        @JSONField(name = "EventID")
        String eventID;
        @JSONField(name = "EventTime")
        String eventTime;
        @JSONField(name = "EventName")
        String eventName;
        @JSONField(name = "RequestID")
        String requestID;
        @JSONField(name = "SourceIPAddress")
        String sourceIPAddress;
        @JSONField(name = "EventSource")
        String eventSource;
        @JSONField(name = "UserName")
        String userName;
        @JSONField(name = "AccessKeyID")
        String accessKeyID;
        @JSONField(name = "EventDetail")
        String eventDetail;
        @JSONField(name = "Region")
        String region;
        @JSONField(name = "ErrorCode")
        String errorCode;
    }
}
