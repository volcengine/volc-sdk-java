package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CloudPlayResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CloudPlayResult cloudPlayResult;


    @Data
    public static class CloudPlayResult {
        @JSONField(name = "ID")
        String id;
        @JSONField(name = "hls")
        String hls;
        @JSONField(name = "mp4")
        String mp4;
    }
}
