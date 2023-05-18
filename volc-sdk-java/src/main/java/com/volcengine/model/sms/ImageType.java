package com.volcengine.model.sms;

import com.alibaba.fastjson.annotation.JSONField;

public enum ImageType {
    PNG("png"),
    JPG("jpg");

    private String imageType;

    ImageType(String imageType) {
        this.imageType = imageType;
    }

    @JSONField
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }
}
