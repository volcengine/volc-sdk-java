package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateCarouselTaskRes
 */
@lombok.Data
public final class CreateCarouselTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateCarouselTaskResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateCarouselTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
