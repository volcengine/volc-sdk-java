package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetLicensePlateDetectionBody
 */
@lombok.Data
public final class GetLicensePlateDetectionBody  {

    /**
     * <p>原图的存储 URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUri")
    private String imageUri;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
