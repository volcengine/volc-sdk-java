package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageStyleDetailResResultStyleElementsItemAttrFillptnParam
 */
@lombok.Data
public final class GetImageStyleDetailResResultStyleElementsItemAttrFillptnParam  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "color")
    private String color;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
