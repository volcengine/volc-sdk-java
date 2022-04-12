package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageSegmentRequest{
    @JSONField(name = "ServiceId")
    String serviceId;
    @JSONField(name = "Class")
    String Class;
    @JSONField(name = "Refine")
    Boolean refine;
    @JSONField(name = "StoreUri")
    String storeUri;
    @JSONField(name = "OutFormat")
    String outFormat;
    @JSONField(name = "TransBg")
    Boolean transBg;
    @JSONField(name = "Contour")
    Contour contour;


    @Data
    public static class Contour{
        @JSONField(name = "Color")
        String Color;
        @JSONField(name = "Size")
        int Size;
    }
}