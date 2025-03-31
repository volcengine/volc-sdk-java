package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageServiceResResultStorageRulesV2ItemExpiration
 */
@lombok.Data
public final class GetImageServiceResResultStorageRulesV2ItemExpiration  {

    /**
     * <p>天数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Days")
    private Integer days;

    /**
     * <p>日期。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Date")
    private String date;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
