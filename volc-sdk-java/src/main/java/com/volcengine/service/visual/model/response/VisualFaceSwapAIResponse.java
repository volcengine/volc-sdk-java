package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualFaceSwapAIResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    FaceSwapAiData data;
    @Data
    public static class FaceSwapAiData {
        
        @JSONField(name = "binary_data_base64")
        ArrayList<String> binaryDataBase64;
    }
}