package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateStorageRulesV2Body
 */
@lombok.Data
public final class UpdateStorageRulesV2Body  {

    /**
     * <p>存储规则。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageRules")
    private List<UpdateStorageRulesV2BodyStorageRulesItem> storageRules;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
