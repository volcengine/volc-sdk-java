package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetCarouselDetailRes
 */
@lombok.Data
public final class GetCarouselDetailRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetCarouselDetailResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetCarouselDetailResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
