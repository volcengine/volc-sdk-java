package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageStyleResResult
 */
@lombok.Data
public final class UpdateImageStyleResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CollectResult")
    private String collectResult;

    /**
     * <p>保留字段</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BaseResp")
    private UpdateImageStyleResResultBaseResp baseResp;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
