package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;
@Data
public class VisualEntitySegmentRequest {
    @JSONField(name = "req_key")
    String reqKey="";

    @JSONField(name = "binary_data_base64")
    ArrayList<String> binary_data_base64;

    @JSONField(name = "image_urls")
    ArrayList<String> imageUrls;

    @JSONField(name = "return_url")
    boolean returnUrl=false;

    @JSONField(name = "max_entity")
    int max_entity=20;

    @JSONField(name = "return_format")
    int returnFormat=0;

    @JSONField(name = "refine_mask")
    int refineMask=0;

}
