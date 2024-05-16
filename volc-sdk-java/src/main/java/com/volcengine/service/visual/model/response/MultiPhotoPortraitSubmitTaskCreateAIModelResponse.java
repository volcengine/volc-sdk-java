package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class MultiPhotoPortraitSubmitTaskCreateAIModelResponse extends VisualBaseResponse{
    @JSONField(name = "data")
    MultiPhotoPortraitSubmitTaskGenerateImageData data;
    @Data
    public static class MultiPhotoPortraitSubmitTaskGenerateImageData {
        @JSONField(name = "task_id")
        String taskId;
        @JSONField(name = "model_id")
        String modelId;
    }
}
