package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualFaceFusionMovieSyncRequest {
    @JSONField(name = "req_key")
    String reqKey;
    @JSONField(name = "binary_data_base64")
    ArrayList<String> binaryDataBase64;
    @JSONField(name = "image_url")
    String image_url;
    @JSONField(name = "video_url")
    String video_url;
    @JSONField(name = "enable_face_beautify")
    Boolean enableFaceBeautify;
}