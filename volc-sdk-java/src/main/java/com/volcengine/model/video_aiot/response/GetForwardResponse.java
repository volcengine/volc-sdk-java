package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetForwardResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    Forward forward;

    @Data
    public static class Forward {
        @JSONField(name = "Status")
        int status;
        @JSONField(name = "PullSrc")
        String pullSrc;
    }
}
