package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageStyleDetailResResultStyleElementsItemAttrBorder
 */
@lombok.Data
public final class GetImageStyleDetailResResultStyleElementsItemAttrBorder  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "weight")
    private Integer weight;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "dash")
    private Integer dash;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "radius")
    private Integer radius;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "color")
    private String color;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "paddingTop")
    private Integer paddingTop;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "paddingBottom")
    private Integer paddingBottom;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "paddingLeft")
    private Integer paddingLeft;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "paddingRight")
    private Integer paddingRight;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
