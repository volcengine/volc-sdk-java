package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualLensVidaVideoGetResultV2Response extends VisualBaseResponse {
    
    @JSONField(name = "data")
    LensVidaVideoGetResultV2Data data;

    @Data
    public static class LensVidaVideoGetResultV2Data {
        
        @JSONField(name = "resp_data")
        String respData;

        @JSONField(name = "status")
        String status;

        @JSONField(name = "binary_data_base64")
        ArrayList<String> binaryDataBase64;
    }
}