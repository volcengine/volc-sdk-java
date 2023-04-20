package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualCertQueryProRequest {

    @JSONField(name = "req_key")
    String reqKey = "cert_verify_query";

    @JSONField(name = "byted_token")
    String bytedToken;

    @JSONField(name = "omit_data")
    Boolean omitData = false;

    @JSONField(name = "omit_image_data")
    Boolean omitImageData = false;

    @JSONField(name = "omit_video_data")
    Boolean omitVideoData = false;
}