package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualFaceFusionMovieSubmitTaskRequest {
    @JSONField(name = "req_key")
    String reqKey;

    @JSONField(name = "binary_data_base64")
    ArrayList<String> binaryDataBase64;

    @JSONField(name = "image_url")
    String imageUrl;

    @JSONField(name = "video_url")
    String videoUrl;

    @JSONField(name = "enable_face_beautify")
    Boolean enableFaceBeautify=false;

    @JSONField(name = "ref_img_url")
    String refImgUrl;

    @JSONField(name = "source_similarity")
    String sourceSimilarity;

    @JSONField(name = "logo_info")
    LogoInfo logoInfo;

    @JSONField(name = "gpen")
    double gpen=1.0;

    @Data
    public static class LogoInfo{
        @JSONField(name = "add_logo")
        boolean addlogo;
        @JSONField(name = "position")
        int position;
        @JSONField(name = "language")
        int language;
        @JSONField(name = "opacity")
        double opacity;
    }
    @JSONField(name = "whitening")
    double whitening =0;

    @JSONField(name = "dermabrasion")
    double dermabrasion =0;

    @JSONField(name = "sharpening ")
    double sharpening =0;
}

