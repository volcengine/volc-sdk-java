package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageStyleDetailResResultStyleBackground
 */
@lombok.Data
public final class GetImageStyleDetailResResultStyleBackground  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "fill")
    private String fill;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "fillSrc")
    private String fillSrc;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "viewpoint")
    private GetImageStyleDetailResResultStyleBackgroundViewpoint viewpoint;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
