package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultImagePreheating
 */
@lombok.Data
public final class ResultImagePreheating  {

    /**
     * <p>镜像 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageId")
    private String imageId;

    /**
     * <p>镜像预热失败的比例，单位为 %。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PreheatFailedProgress")
    private Integer preheatFailedProgress;

    /**
     * <p>镜像预热完成的比例，单位为 %</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PreheatSuccessProgress")
    private Integer preheatSuccessProgress;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
