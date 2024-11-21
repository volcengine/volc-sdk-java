package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageFontsRes
 */
@lombok.Data
public final class GetImageFontsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageFontsResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageFontsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
