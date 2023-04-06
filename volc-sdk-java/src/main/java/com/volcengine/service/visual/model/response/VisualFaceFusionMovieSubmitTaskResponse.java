package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualFaceFusionMovieSubmitTaskResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    FaceFusionMovieSubmitTaskData data;

    @Data
    public static class FaceFusionMovieSubmitTaskData {
        @JSONField(name = "task_id")
        String taskId;
    }
}