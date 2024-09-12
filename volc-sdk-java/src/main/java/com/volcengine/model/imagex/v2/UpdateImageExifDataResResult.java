package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageExifDataResResult
 */
@lombok.Data
public final class UpdateImageExifDataResResult  {

    /**
     * <p>处理成功后图片的存储 URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DstUri")
    private String dstUri;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
