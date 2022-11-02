package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageSegmentRequest {
    @JSONField(name = "ServiceId")
    private String serviceId;
    @JSONField(name = "Class")
    private String classify;
    @JSONField(name = "Refine")
    private Boolean refine;
    @JSONField(name = "StoreUri")
    private String storeUri;
    @JSONField(name = "OutFormat")
    private String outFormat;
    @JSONField(name = "TransBg")
    private Boolean transBg;
    @JSONField(name = "Contour")
    private Contour contour;

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public void setClassify(Classify classify) {
        this.classify = classify.getValue();
    }

    @Data
    public static class Contour {
        @JSONField(name = "Color")
        private String Color;
        @JSONField(name = "Size")
        private int Size;
    }

    public enum Classify {
        GENERAL("general"),
        HUMAN("human"),
        PRODUCT("product"),
        HUMAN_V2("humanv2"),
        PRODUCT_V2("productv2"),
        ;

        final private String value;

        Classify(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}