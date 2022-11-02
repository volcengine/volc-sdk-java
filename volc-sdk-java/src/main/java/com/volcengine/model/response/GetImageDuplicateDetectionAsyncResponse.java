package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageDuplicateDetectionAsyncResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    private GetImageDuplicateDetectionAsyncResponseBean result;

    @Data
    static public class GetImageDuplicateDetectionAsyncResponseBean {
        @JSONField(name = "TaskId")
        private String taskId;

        @JSONField(name = "Callback")
        private String callback;
    }
}
