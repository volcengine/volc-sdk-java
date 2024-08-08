package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateHiddenWatermarkImageResResult
 */
@lombok.Data
public final class CreateHiddenWatermarkImageResResult  {

    /**
     * <p>盲水印图片 Uri，当前仅支持输出 png 格式。</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
