package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class DescribeLiveStreamSessionsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribeLiveStreamSessionsOutput Result;

    @Data
    public static class DescribeLiveStreamSessionsOutput {
        @JSONField(name = "Summary")
        private Summary Summary;

        @JSONField(name = "SessionDataList")
        private List<SessionData> SessionDataList;
    }

    @Data
    public static class Summary {
        @JSONField(name = "TotalRequest")
        private int TotalRequest;

        @JSONField(name = "PeakOnlineUser")
        private int PeakOnlineUser;
    }

    @Data
    public static class SessionData {

        @JSONField(name = "ProtocolSessionDataList")
        private List<ProtocolSessionData> ProtocolSessionDataList;

        @JSONField(name = "Time")
        private String Time;

        @JSONField(name = "Request")
        private int Request;

        @JSONField(name = "OnlineUser")
        private int OnlineUser;
    }


    @Data
    public static class ProtocolSessionData {

        @JSONField(name = "Protocol")
        private String Protocol;

        @JSONField(name = "Request")
        private int Request;

        @JSONField(name = "OnlineUser")
        private int OnlineUser;
    }
}
