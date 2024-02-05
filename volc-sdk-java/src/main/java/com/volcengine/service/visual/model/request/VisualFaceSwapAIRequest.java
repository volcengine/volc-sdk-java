package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualFaceSwapAIRequest {

    @JSONField(name = "req_key")
    String reqKey;

    @JSONField(name = "binary_data_base64")
    ArrayList<String> binaryDataBase64;

    @JSONField(name = "image_urls")
    ArrayList<String> imageUrls;

    @JSONField(name = "do_risk")
    Boolean doRisk;

    @JSONField(name = "gpen")
    Double gpen;

    @JSONField(name = "skin")
    Double skin;

    @JSONField(name = "tou_repair")
    int touRepair;

}