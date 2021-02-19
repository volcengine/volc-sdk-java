package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.ImageInfo;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetStreamsAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetStreamsAPIResultBean result;

    @Data
    public static class GetStreamsAPIResultBean {
        @JSONField(name = "LineDetails")
        List<LineDetail> lineDetails;
    }

    @Data
    public static class LineDetail {
        @JSONField(name = "LineId")
        Long lineId;
        @JSONField(name = "LineName")
        String lineName;
        @JSONField(name = "MainPushInfo")
        MainPushInfo mainPushInfo;
        @JSONField(name = "ForwardInfo")
        ForwardInfo forwardInfo;
        @JSONField(name = "ExpireTime")
        Long ExpireTime;
    }

    @Data
    public static class MainPushInfo {
        @JSONField(name = "PushPath")
        String pushPath;
        @JSONField(name = "StreamingCode")
        String streamingCode;
    }

    @Data
    public static class ForwardInfo {
        @JSONField(name = "PullStreamUrl")
        String pullStreamUrl;
        @JSONField(name = "PullStreamStatus")
        Integer pullStreamStatus;
        @JSONField(name = "PullStreamCheckStatus")
        Integer pullStreamCheckStatus;
    }
}
