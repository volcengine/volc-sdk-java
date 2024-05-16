package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateContentSecurityAccessConfigRequest {
    @JSONField(name = "id")
    Integer id;
    @JSONField(name = "app_id")
    Integer appId;
    @JSONField(name = "service_item")
    String service;
    @JSONField(name = "name")
    String name;
    @JSONField(name = "biztype")
    String biztype;
    @JSONField(name = "scene")
    String scene;
    @JSONField(name = "labels")
    String labels;
    @JSONField(name = "ocr_labels")
    String ocrLabels;
    @JSONField(name = "asr_labels")
    String asrLabels;
    @JSONField(name = "text_libs")
    String textLibs;
    @JSONField(name = "image_libs")
    String imageLibs;
}
