package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateStorageRulesV2BodyStorageRulesItemAbortIncompleteMultipartUpload
 */
@lombok.Data
public final class UpdateStorageRulesV2BodyStorageRulesItemAbortIncompleteMultipartUpload  {

    /**
     * <p>分片过期时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DaysAfterInitiation")
    private Integer daysAfterInitiation;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
