package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * ResultPropertyRule
 */
@lombok.Data
public final class ResultPropertyRule  {

    /**
     * <p>规则名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RuleName")
    private String ruleName;

    /**
     * <p>实例 System Properties 系统属性。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverlayProperty")
    private List<ResultSystemPropertyResult> overlayProperty;

    /**
     * <p>实例 Settings 属性。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverlaySettings")
    private List<ResultSettingsResult> overlaySettings;

    /**
     * <p>实例初始化系统属性。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverlayPersistProperty")
    private List<ResultSystemPropertyResult> overlayPersistProperty;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
