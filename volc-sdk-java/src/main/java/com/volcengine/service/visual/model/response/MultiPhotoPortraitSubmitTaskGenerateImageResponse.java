package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class MultiPhotoPortraitSubmitTaskGenerateImageResponse extends VisualBaseResponse{
    @JSONField(name = "data")
    MultiPhotoPortraitSubmitTaskGenerateImageResponseData data;
    @Data
    public static class MultiPhotoPortraitSubmitTaskGenerateImageResponseData {
        @JSONField(name = "task_id")
        String taskId;
    }
}
