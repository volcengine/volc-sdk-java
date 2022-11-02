package com.volcengine.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @see com.volcengine.model.response.GetDeduplicateTaskStatusResponse.GetDeduplicateTaskStatusCallback
 */
@Data
public class GetImageDuplicateDetectionCallbackBody {
    @JSONField(name = "Status")
    private Integer status;

    @JSONField(name = "TaskId")
    private String taskId;

    @JSONField(name = "Result")
    private GetImageDuplicateDetectionResult Result;
}