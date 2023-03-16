package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualImg2ImgAnimeRequest {

    @JSONField(name = "req_key")
    String reqKey;
    @JSONField(name = "prompt")
    String prompt;
    @JSONField(name = "strength")
    Float strength = 0.5F;
    @JSONField(name = "seed")
    Integer seed = -1;
    @JSONField(name = "binary_data_base64")
    ArrayList<String> binaryDataBase64;
    @JSONField(name = "image_url")
    String imageUrl;
}