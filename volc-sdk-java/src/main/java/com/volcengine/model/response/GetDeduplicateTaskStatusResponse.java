package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.GetImageDuplicateDetectionResult;
import lombok.Data;

@Data
public class GetDeduplicateTaskStatusResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    private GetDeduplicateTaskStatusCallback result;

    /**
     * @see com.volcengine.model.beans.GetImageDuplicateDetectionCallbackBody
     */
    @Data
    static public class GetDeduplicateTaskStatusCallback {
        @JSONField(name = "Status")
        private Integer status;

        @JSONField(name = "TaskId")
        private String taskId;

        @JSONField(name = "Result")
        private GetImageDuplicateDetectionResult Result;
    }
}
