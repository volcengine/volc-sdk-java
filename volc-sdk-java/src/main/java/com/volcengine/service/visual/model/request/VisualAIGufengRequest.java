package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualAIGufengRequest {

    @JSONField(name = "req_key")
    String reqKey = "ai_gufeng";

    @JSONField(name = "binary_data_base64")
    ArrayList<String> binaryDataBase64;

    @JSONField(name = "image_urls")
    ArrayList<String> image_urls;
}