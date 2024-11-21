package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageStyleDetailResResultStyleElementsItemAttrViewpoint
 */
@lombok.Data
public final class GetImageStyleDetailResResultStyleElementsItemAttrViewpoint  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "x")
    private Integer x;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "y")
    private Integer y;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "width")
    private Integer width;

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
