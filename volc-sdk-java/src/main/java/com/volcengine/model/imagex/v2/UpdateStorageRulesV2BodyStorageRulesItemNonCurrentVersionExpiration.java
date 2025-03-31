package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateStorageRulesV2BodyStorageRulesItemNonCurrentVersionExpiration
 */
@lombok.Data
public final class UpdateStorageRulesV2BodyStorageRulesItemNonCurrentVersionExpiration  {

    /**
     * <p>多版本过期天数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NonCurrentDays")
    private Integer nonCurrentDays;

    /**
     * <p>日期，只填写年月日，无法指定时分秒</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NonCurrentDate")
    private String nonCurrentDate;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
