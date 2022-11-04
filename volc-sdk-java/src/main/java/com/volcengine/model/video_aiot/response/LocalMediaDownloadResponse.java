package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class LocalMediaDownloadResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DownloadResponse downloadResponse;

    @Data
    public static class DownloadResponse {
        @JSONField(name = "ID")
        String id;
        @JSONField(name = "Result")
        boolean result;
    }
}
