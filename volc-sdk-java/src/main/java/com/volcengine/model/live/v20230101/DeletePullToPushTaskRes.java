package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeletePullToPushTaskRes
 */
@lombok.Data
public final class DeletePullToPushTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DeletePullToPushTaskResResponseMetadata responseMetadata;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
