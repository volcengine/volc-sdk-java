package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageMigrateTaskRes
 */
@lombok.Data
public final class CreateImageMigrateTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateImageMigrateTaskResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateImageMigrateTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
