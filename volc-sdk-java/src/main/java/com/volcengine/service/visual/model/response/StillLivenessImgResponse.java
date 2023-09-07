package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class StillLivenessImgResponse extends VisualBaseResponse{
    @JSONField(name = "data")
    StillLivenessImg data;
    @Data
    public static class StillLivenessImg {
        @JSONField(name = "is_face_attack")
        String isFaceAttack;
    }

}
