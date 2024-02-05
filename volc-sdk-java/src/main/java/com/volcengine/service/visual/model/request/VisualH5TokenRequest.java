package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualH5TokenRequest {

    @JSONField(name = "req_key")
    String reqKey;

    @JSONField(name = "h5_config_id")
    String h5ConfigId;

    @JSONField(name = "sts_token")
    String stsToken;

    @JSONField(name = "idcard_name")
    String idcardName;

    @JSONField(name = "idcard_no")
    String idcardNo;

    @JSONField(name = "ref_image")
    String refImage;



}