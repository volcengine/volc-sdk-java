package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageStyleDetailResResultStyleBackgroundViewpoint
 */
@lombok.Data
public final class GetImageStyleDetailResResultStyleBackgroundViewpoint  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "x")
    private Double x;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "y")
    private Integer y;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "width")
    private Double width;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "height")
    private Integer height;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
