package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UploadMediaByURLResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UploadMediaByURLResponseBody result;

    @Data
    public static class UploadMediaByURLResponseBody {
        @JSONField(name = "TaskID")
        String TaskID;
    }
}