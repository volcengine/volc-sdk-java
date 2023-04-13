package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualVideoOverResolutionSubmitTaskV2Response extends VisualBaseResponse {
    
    @JSONField(name = "data")
    VideoOverResolutionSubmitTaskV2Data data;

    @Data
    public static class VideoOverResolutionSubmitTaskV2Data {
        @JSONField(name = "task_id")
        String taskId;
    }
}