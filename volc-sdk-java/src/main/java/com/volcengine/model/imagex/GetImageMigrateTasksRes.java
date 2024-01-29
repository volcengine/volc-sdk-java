package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageMigrateTasksRes
 */
@lombok.Data
public final class GetImageMigrateTasksRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageMigrateTasksResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageMigrateTasksResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
