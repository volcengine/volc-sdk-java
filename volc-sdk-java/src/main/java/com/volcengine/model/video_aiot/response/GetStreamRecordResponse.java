package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetStreamRecordResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    StreamRecordRes streamRecordRes;

    @Data
    public static class StreamRecordRes {
        @JSONField(name = "ID")
        String ID;
        @JSONField(name = "Status")
        String status; //start/success/error
        @JSONField(name = "Msg")
        String msg;
        @JSONField(name = "CreatedAt")
        int createAt;
        @JSONField(name = "UpdatedAt")
        int updatedAt;
        @JSONField(name = "StoppedAt")
        int stoppedAt;
        @JSONField(name = "Res")
        StreamRecordResult res;
    }

    @Data
    public static class StreamRecordResult {
        @JSONField(name = "Url")
        String url;
        @JSONField(name = "RemuxUrl")
        String remuxUrl;
    }
}
