package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualConvertPhotoV2Request {

    @JSONField(name = "req_key")
    String reqKey = "lens_opr";

    @JSONField(name = "binary_data_base64")
    ArrayList<String> binaryDataBase64;

    @JSONField(name = "is_color")
    Boolean isColor = false;
}