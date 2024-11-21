package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageStyleResResultBaseResp
 */
@lombok.Data
public final class UpdateImageStyleResResultBaseResp  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StatusMessage")
    private String statusMessage;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StatusCode")
    private Double statusCode;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Extra")
    private String extra;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
