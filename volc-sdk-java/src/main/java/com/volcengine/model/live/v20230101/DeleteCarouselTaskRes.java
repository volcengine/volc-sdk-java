package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteCarouselTaskRes
 */
@lombok.Data
public final class DeleteCarouselTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DeleteCarouselTaskResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DeleteCarouselTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
