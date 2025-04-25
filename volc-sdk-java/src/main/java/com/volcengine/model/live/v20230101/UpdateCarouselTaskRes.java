package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateCarouselTaskRes
 */
@lombok.Data
public final class UpdateCarouselTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private UpdateCarouselTaskResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private UpdateCarouselTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
