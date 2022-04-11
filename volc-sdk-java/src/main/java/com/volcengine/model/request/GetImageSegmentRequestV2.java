package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageSegmentRequestV2{
    @JSONField(name = "ServiceId")
    String serviceId;
    @JSONField(name = "Class")
    String Class;
    @JSONField(name = "Refine")
    Boolean Refine;
    @JSONField(name = "StoreUri")
    String StoreUri;
    @JSONField(name = "OutFormat")
    String OutFormat;
    @JSONField(name = "TransBg")
    Boolean TransBg;

    @Data
    public static class Contour{
        @JSONField(name = "Color")
        String Color;
        @JSONField(name = "Size")
        int Size;
    }
}



