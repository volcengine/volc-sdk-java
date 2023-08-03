package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Map;

@Data
public class StartStreamResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    StartStreamResp startStreamResp;

    @Data
    public static class StartStreamResp {
        @JSONField(name = "ID")
        String id;
        @JSONField(name = "PullUrls")
        String[] pullUrls;
        @JSONField(name = "TransPullUrls")
        Map<String, String[]> transPullUrls;
    }
}
