package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateStorageRulesV2BodyStorageRulesItemNonCurrentVersionTransitionsItem
 */
@lombok.Data
public final class UpdateStorageRulesV2BodyStorageRulesItemNonCurrentVersionTransitionsItem  {

    /**
     * <p>沉降存储类别。- IA，转为低频存储- ARCHIVE_FR，转为归档闪回存储- COLD_ARCHIVE，转为冷归档存储- ARCHIVE，转为归档存储</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageClass")
    private String storageClass;

    /**
     * <p>非当前天数。</p>
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
