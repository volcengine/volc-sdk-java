package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;


@Data
public class MediasMergeResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    MediasMergeResponseBody result;

    @Data
    public static class MediasMergeResponseBody {
        @JSONField(name = "MergeTaskId")
        String MergeTaskId;
    }
}