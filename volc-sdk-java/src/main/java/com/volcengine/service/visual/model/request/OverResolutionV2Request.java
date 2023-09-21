package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class OverResolutionV2Request {

    @JSONField(name = "req_key")
    String reqKey;
    @JSONField(name = "binary_data_base64")
    ArrayList<String> binaryDataBase64 = new ArrayList<>();

}
