package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageStyleDetailResResult
 */
@lombok.Data
public final class GetImageStyleDetailResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Style")
    private GetImageStyleDetailResResultStyle style;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
