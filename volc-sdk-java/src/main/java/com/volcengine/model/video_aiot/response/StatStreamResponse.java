package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class StatStreamResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    StreamData streamData;


    @Data
    public static class StreamData {
        @JSONField(name = "SessionData")
        List<SessionData> sessionData;
    }

    @Data
    public static class SessionData {
        @JSONField(name = "Timestamp")
        Long timestamp;
        @JSONField(name = "Request")
        Integer request;
        @JSONField(name = "OnlineUser")
        Integer onlineUser;
    }

}
