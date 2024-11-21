package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageStyleDetailResResultStyleElementsItemAttrFillptn
 */
@lombok.Data
public final class GetImageStyleDetailResResultStyleElementsItemAttrFillptn  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ptn")
    private Integer ptn;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "viewpoint")
    private GetImageStyleDetailResResultStyleElementsItemAttrFillptnViewpoint viewpoint;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "viewLoc")
    private Integer viewLoc;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "bgColor")
    private String bgColor;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "name")
    private String name;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "param")
    private GetImageStyleDetailResResultStyleElementsItemAttrFillptnParam param;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
