package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * CreateHiddenWatermarkImageRes
 */
@lombok.Data
public final class CreateHiddenWatermarkImageRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateHiddenWatermarkImageResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateHiddenWatermarkImageResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
