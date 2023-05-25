package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualFacePrettyResponse extends VisualBaseResponse {

    @JSONField(name = "data")
    FacePrettyData data;
    @Data
    public static class FacePrettyData {

        @JSONField(name = "image")
        String image;

    }
}