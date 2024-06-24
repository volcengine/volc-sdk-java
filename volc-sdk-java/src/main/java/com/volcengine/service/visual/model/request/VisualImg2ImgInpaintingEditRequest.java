package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualImg2ImgInpaintingEditRequest {
    
    @JSONField(name = "req_key")
    String reqKey="";

    @JSONField(name = "binary_data_base64")
    ArrayList<String> binary_data_base64;

    @JSONField(name = "image_urls")
    ArrayList<String> imageUrls;

    @JSONField(name = "return_url")
    boolean returnUrl=false;

    @JSONField(name = "custom_prompt")
    String customPrompt;

    @JSONField(name = "steps")
    int steps=25;

    @JSONField(name = "scale")
    double scale=5;

    @JSONField(name = "seed")
    double seed=-1;
}