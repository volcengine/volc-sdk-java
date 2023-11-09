package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class TupoCartoonResponse extends VisualBaseResponse{
    @JSONField(name = "data")
    TupoCartoonData data;

    @Data
    public static class TupoCartoonData {
        @JSONField(name = "binary_data_base64")
        String binaryDataBase64;
        @JSONField(name = "do_align_face")
        boolean doAlignFace;
        @JSONField(name = "do_blend_back")
        boolean doBlendBack;
        @JSONField(name = "max_face_count")
        Integer maxFaceCount;
        @JSONField(name = "points106_array")
        ArrayList points106Array;
        @JSONField(name = "algorithm_base_resp")
        AlgorithmBaseResp algorithmBaseResp;
        @Data
        public static class AlgorithmBaseResp {
            @JSONField(name = "status_code")
            Integer statusCode;
            @JSONField(name = "status_message")
            String statusMessage;
        }

    }
}
