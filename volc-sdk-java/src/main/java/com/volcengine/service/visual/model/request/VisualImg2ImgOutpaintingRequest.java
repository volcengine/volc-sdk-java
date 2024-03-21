package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualImg2ImgOutpaintingRequest {
    
    @JSONField(name = "req_key")
    String reqKey="";

    @JSONField(name = "binary_data_base64")
    ArrayList<String> binary_data_base64;

    @JSONField(name = "custom_prompt")
    String customPrompt;

    @JSONField(name = "steps")
    int steps=30;

    @JSONField(name = "strength")
    double strength = 0.8;

    @JSONField(name = "scale")
    double scale=7.0;

    @JSONField(name = "seed")
    double seed=0;

    @JSONField(name = "top")
    double top=0.1;

    @JSONField(name = "bottom")
    double bottom=0.1;

    @JSONField(name = "left")
    double left=0.1;

    @JSONField(name = "right")
    double right=0.1;

    @JSONField(name = "max_height")
    double max_height=1920;

    @JSONField(name = "max_width")
    double max_width=1920;
}