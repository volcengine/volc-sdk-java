package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageServiceResResultStorageRulesV2ItemNonCurrentVersionExpiration
 */
@lombok.Data
public final class GetImageServiceResResultStorageRulesV2ItemNonCurrentVersionExpiration  {

    /**
     * <p>非当前天数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NonCurrentDays")
    private Integer nonCurrentDays;

    /**
     * <p>非当前日期。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NonCurrentDate")
    private String nonCurrentDate;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
