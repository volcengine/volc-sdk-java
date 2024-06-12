package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class MediaCutResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    MediaCutResponseBody result;

    @Data
    public static class MediaCutResponseBody {
        @JSONField(name = "CutTaskId")
        String CutTaskId;
    }
}
