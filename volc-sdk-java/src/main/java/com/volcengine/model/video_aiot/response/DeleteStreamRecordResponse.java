package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DeleteStreamRecordResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeleteStreamResult deleteStreamResult;


    @Data
    public static class DeleteStreamResult {
        @JSONField(name = "DelResult")
        int deleted;
    }
}
