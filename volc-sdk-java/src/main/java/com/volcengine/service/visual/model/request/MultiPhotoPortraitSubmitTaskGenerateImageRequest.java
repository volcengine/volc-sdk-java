package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class MultiPhotoPortraitSubmitTaskGenerateImageRequest {
    
    @JSONField(name = "req_key")
    String reqKey;

    @JSONField(name = "model_id")
    String modelId;

    @JSONField(name = "styles")
    ArrayList<String> styles;

    @JSONField(name = "gender")
    String gender;

}