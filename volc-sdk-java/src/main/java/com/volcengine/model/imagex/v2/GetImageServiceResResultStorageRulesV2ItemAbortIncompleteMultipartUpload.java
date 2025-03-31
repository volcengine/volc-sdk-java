package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageServiceResResultStorageRulesV2ItemAbortIncompleteMultipartUpload
 */
@lombok.Data
public final class GetImageServiceResResultStorageRulesV2ItemAbortIncompleteMultipartUpload  {

    /**
     * <p>距启动后的天数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DaysAfterInitiation")
    private Integer daysAfterInitiation;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
