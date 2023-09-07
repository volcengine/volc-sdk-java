package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class FaceCompareResponse extends VisualBaseResponse{
    @JSONField(name = "data")
    FaceCompare data;
    @Data
    public static class FaceCompare {
        @JSONField(name = "is_match")
        String isMatch;
        @JSONField(name = "confidence")
        String confidence;
        @JSONField(name = "thresholds")
        String thresholds;
        @JSONField(name = "rect_a_list")
        String rectAList;
        @JSONField(name = "rect_b_list")
        String rectBList;
    }

}
