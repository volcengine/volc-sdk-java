package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualLensVidaVideoGetResultV2Request {

    @JSONField(name = "req_key")
    String reqKey = "lens_vida_video";

    @JSONField(name = "task_id")
    String taskId;
}