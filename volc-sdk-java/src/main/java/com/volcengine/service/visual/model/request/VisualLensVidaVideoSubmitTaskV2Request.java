package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualLensVidaVideoSubmitTaskV2Request {

    @JSONField(name = "req_key")
    String reqKey = "lens_vida_video";

    @JSONField(name = "url")
    String url;

    @JSONField(name = "vida_mode")
    String vidaMode;
}