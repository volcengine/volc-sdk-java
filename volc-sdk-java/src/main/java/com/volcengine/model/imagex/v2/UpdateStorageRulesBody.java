package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateStorageRulesBody
 */
@lombok.Data
public final class UpdateStorageRulesBody  {

    /**
     * <p>更新后的存储降冷策略</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageRules")
    private List<UpdateStorageRulesBodyStorageRulesItem> storageRules;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
