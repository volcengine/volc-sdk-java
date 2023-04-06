package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class PlaybackStartResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    PlaybackStartResp result;

    @Data
    public static class PlaybackStartResp {
        @JSONField(name = "StreamID")
        private String streamID;
        @JSONField(name = "PullUrls")
        private List<String> pullUrls;
        @JSONField(name = "PushUrl")
        private String pushUrl;
    }

}
