package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualFaceFusionMovieGetResultResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    FaceFusionMovieGetResultData data;

    @Data
    public static class FaceFusionMovieGetResultData {
        @JSONField(name = "status")
        String status;
        @JSONField(name = "binary_data_base64")
        ArrayList<String> binaryDataBase64;
        @JSONField(name = "resp_data")
        String respData;
    }
}