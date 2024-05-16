package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class MultiPhotoPortraitGetTaskResultResponse extends VisualBaseResponse{
    @JSONField(name = "data")
    MultiPhotoPortraitGetTaskResultResponseData data;
    @Data
    public static class MultiPhotoPortraitGetTaskResultResponseData {
        @JSONField(name = "task_id")
        String taskId;
        @JSONField(name = "status")
        int status;
        @JSONField(name = "progress")
        int progress;
        @JSONField(name = "wait_time")
        int wait_time;
        @JSONField(name = "image_list")
        ArrayList<Object> imageList;
        @JSONField(name = "model_id")
        String modelId;
    }
}
