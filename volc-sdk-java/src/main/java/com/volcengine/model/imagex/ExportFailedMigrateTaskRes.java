package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * ExportFailedMigrateTaskRes
 */
@lombok.Data
public final class ExportFailedMigrateTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ExportFailedMigrateTaskResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ExportFailedMigrateTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
