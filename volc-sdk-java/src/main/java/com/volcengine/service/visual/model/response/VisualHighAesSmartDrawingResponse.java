package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualHighAesSmartDrawingResponse {
    @JSONField(name = "data")
    HighAesSmartDrawingData data;
    @Data
    public static class HighAesSmartDrawingData {

        @JSONField(name = "binary_data_base64")
        ArrayList<String> binaryDataBase64;
    }
}
