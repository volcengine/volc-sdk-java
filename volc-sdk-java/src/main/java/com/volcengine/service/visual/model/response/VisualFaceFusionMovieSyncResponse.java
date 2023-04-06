package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualFaceFusionMovieSyncResponse extends VisualBaseResponse {

    @JSONField(name = "data")
    FaceFusionMovieSyncData data;

    @Data
    public static class FaceFusionMovieSyncData {

        @JSONField(name = "algorithm_base_resp")
        AlgorithmBaseResp algorithmBaseResp;
        @Data
        public static class AlgorithmBaseResp {
            @JSONField(name = "status_code")
            Integer statusCode;
            @JSONField(name = "status_message")
            String statusMessage;
        }
        @JSONField(name = "req_measure_info")
        ReqMeasureInfo reqMeasureInfo;
        @Data
        public static class ReqMeasureInfo {
            @JSONField(name = "measure_type")
            String measureType;
            @JSONField(name = "value")
            Integer value;
        }
        @JSONField(name = "binary_data_base64")
        ArrayList<String> binaryDataBase64;
        @JSONField(name = "vid")
        String vid;
        @JSONField(name = "video_url")
        String videoUrl;
    }
}