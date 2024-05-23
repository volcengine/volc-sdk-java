package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UploadContentSecurityCustImgLibRequest {
    @JSONField(name = "app_id")
    Integer appId;
    @JSONField(name = "service")
    String service;
    @JSONField(name = "name")
    String name;
    @JSONField(name = "data")
    List<ImageInfo> data;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ImageInfo {
        @JSONField(name = "image_name")
        String imageName;
        @JSONField(name = "url")
        String url;
        @JSONField(name = "image_data")
        String data;
    }
}


