package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CertSrcFaceCompRequest {
    @JSONField(name = "req_key")
    String reqKey;

    @JSONField(name = "idcard_name")
    String idcardName;

    @JSONField(name = "idcard_no")
    String idcardNo;

    @JSONField(name = "image")
    String image;
}
