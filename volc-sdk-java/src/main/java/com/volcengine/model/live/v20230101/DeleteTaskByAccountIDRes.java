package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteTaskByAccountIDRes
 */
@lombok.Data
public final class DeleteTaskByAccountIDRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DeleteTaskByAccountIDResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DeleteTaskByAccountIDResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
