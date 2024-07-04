package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualHighAesSmartDrawingResponse extends VisualBaseResponse {
    @JSONField(name = "data")
    HighAesSmartDrawingData data;
    @Data
    public static class HighAesSmartDrawingData {

        @JSONField(name = "algorithm_base_resp")
        AlgorithmBaseResp algorithmBaseResp;

        @JSONField(name = "binary_data_base64")
        ArrayList<String> binaryDataBase64;

        @JSONField(name = "image_urls")
        ArrayList<String> imageUrls;
    }

    @Data
    public static class AlgorithmBaseResp {

        @JSONField(name = "status_code")
        int statusCode;

        @JSONField(name = "status_message")
        String statusMessage;
    }
}
