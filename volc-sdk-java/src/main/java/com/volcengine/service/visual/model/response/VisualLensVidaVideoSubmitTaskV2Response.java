package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualLensVidaVideoSubmitTaskV2Response extends VisualBaseResponse {
    
    @JSONField(name = "data")
    LensVidaVideoSubmitTaskV2Data data;

    @Data
    public static class LensVidaVideoSubmitTaskV2Data {
        
        @JSONField(name = "task_id")
        String taskId;
    }
}