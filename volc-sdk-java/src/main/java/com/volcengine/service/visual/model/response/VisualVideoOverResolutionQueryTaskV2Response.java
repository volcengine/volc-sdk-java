package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualVideoOverResolutionQueryTaskV2Response extends VisualBaseResponse {
    
    @JSONField(name = "data")
    VideoOverResolutionQueryTaskV2Data data;

    @Data
    public static class VideoOverResolutionQueryTaskV2Data {
        @JSONField(name = "status")
        String status;
        @JSONField(name = "binary_data_base64")
        ArrayList<String> binaryDataBase64;
        @JSONField(name = "resp_data")
        String respData;
    }
}