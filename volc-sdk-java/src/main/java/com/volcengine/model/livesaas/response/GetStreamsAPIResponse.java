package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class GetStreamsAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetStreamsAPIResult result;

    @Data
    public static class GetStreamsAPIResult {
        @JSONField(name = "LineDetails")
        List<GetStreamsAPILineDetail> LineDetails;
    }

    @Data
    public static class GetStreamsAPILineDetail {
        @JSONField(name = "ForwardInfo")
        ForwardInfoAPI ForwardInfo;
        @JSONField(name = "LineName")
        String LineName;
        @JSONField(name = "BackupForwardInfo")
        ForwardInfoAPI BackupForwardInfo;
        @JSONField(name = "LineId")
        Long LineId;
        @JSONField(name = "ExpireTime")
        Long ExpireTime;
        @JSONField(name = "MainPushInfo")
        PushInfoAPI MainPushInfo;
        @JSONField(name = "BackPushInfo")
        PushInfoAPI BackPushInfo;
    }

    @Data
    public static class ForwardInfoAPI {
        @JSONField(name = "PullStreamUrl")
        String PullStreamUrl;
        @JSONField(name = "PullStreamStatus")
        String PullStreamStatus;
        @JSONField(name = "PullStreamCheckStatus")
        String PullStreamCheckStatus;
    }

    @Data
    public static class PushInfoAPI {
        @JSONField(name = "PushPath")
        String PushPath;
        @JSONField(name = "PushUrl")
        String PushUrl;
        @JSONField(name = "StreamingCode")
        String StreamingCode;
    }
}