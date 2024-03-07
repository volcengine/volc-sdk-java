package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualFaceSwapV2Request {

    @JSONField(name = "req_key")
    String reqKey;

    @JSONField(name = "binary_data_base64")
    ArrayList<String> binaryDataBase64;

    @JSONField(name = "image_urls")
    ArrayList<String> imageUrls;

    @JSONField(name = "face_type")
    String faceType="area";

    @JSONField(name = "merge_infos")
    ArrayList<MergeInfos> mergeInfos;

    @JSONField(name = "logo_info")
    LogoInfo logoInfo;

    @JSONField(name = "do_risk")
    Boolean doRisk=false;

    @JSONField(name = "source_similarity")
    String sourceSimilarity="1";

    @JSONField(name = "gpen")
    Double gpen;
    @Data
    public static class MergeInfos {
        @JSONField(name = "location")
        int location;

        @JSONField(name = "template_location")
        int template_location;
    }

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

}