package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualAllAgeGenerationRequest {

    @JSONField(name = "req_key")
    String reqKey = "all_age_generation";

    @JSONField(name = "binary_data_base64")
    ArrayList<String> binaryDataBase64;

    @JSONField(name = "image_urls")
    ArrayList<String> image_urls;

    @JSONField(name = "target_age")
    Integer targetAge;

    @JSONField(name = "do_risk")
    boolean doRisk=false;
}