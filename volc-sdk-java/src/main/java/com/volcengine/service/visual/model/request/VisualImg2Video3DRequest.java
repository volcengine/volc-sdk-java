package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualImg2Video3DRequest {

    @JSONField(name = "req_key")
    String reqKey;
    @JSONField(name = "binary_data_base64")
    ArrayList<String> binaryDataBase64;
    @JSONField(name = "render_spec")
    RenderSpec renderSpec;
    @Data
    public static class RenderSpec {
        @JSONField(name = "mode")
        Integer mode = 0;
        @JSONField(name = "long_side")
        Integer longSide = 960;
        @JSONField(name = "frame_num")
        Integer frameNum = 90;
        @JSONField(name = "fps")
        Integer fps = 30;
        @JSONField(name = "use_flow")
        Integer useFlow = -1;
        @JSONField(name = "speed_shift")
        ArrayList<Float> speedShift;
    }
}