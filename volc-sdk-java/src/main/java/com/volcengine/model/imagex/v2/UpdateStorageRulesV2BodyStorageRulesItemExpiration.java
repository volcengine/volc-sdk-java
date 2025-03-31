package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateStorageRulesV2BodyStorageRulesItemExpiration
 */
@lombok.Data
public final class UpdateStorageRulesV2BodyStorageRulesItemExpiration  {

    /**
     * <p>过期天数。与date冲突</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Days")
    private Integer days;

    /**
     * <p>过期日期。与day冲突</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Date")
    private String date;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
