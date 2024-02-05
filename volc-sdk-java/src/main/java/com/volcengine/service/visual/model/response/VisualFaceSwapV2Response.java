package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualFaceSwapV2Response extends VisualBaseResponse {
    
    @JSONField(name = "data")
    FaceSwapData data;
    @Data
    public static class FaceSwapData {
        
        @JSONField(name = "binary_data_base64")
        ArrayList<String> binaryDataBase64;
    }
}