package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualImg2Video3DResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    Img2Video3DData data;

    @Data
    public static class Img2Video3DData {
        
        @JSONField(name = "algorithm_base_resp")
        AlgorithmBaseResp algorithmBaseResp;
        @Data
        public static class AlgorithmBaseResp {
            @JSONField(name = "status_code")
            Integer statusCode;
            @JSONField(name = "status_message")
            String statusMessage;

        }

        @JSONField(name = "binary_data_base64")
        ArrayList<String> binaryDataBase64;
    }
}