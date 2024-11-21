package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageStyleDetailResResultStyleOutput
 */
@lombok.Data
public final class GetImageStyleDetailResResultStyleOutput  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "format")
    private String format;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "quality")
    private Integer quality;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
