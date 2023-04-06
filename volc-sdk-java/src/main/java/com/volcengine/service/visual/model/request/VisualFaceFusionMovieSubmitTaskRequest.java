package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualFaceFusionMovieSubmitTaskRequest {
    @JSONField(name = "req_key")
    String reqKey;
    @JSONField(name = "image_url")
    String imageUrl;
    @JSONField(name = "video_url")
    String videoUrl;
    @JSONField(name = "enable_face_beautify")
    Boolean enableFaceBeautify;
}