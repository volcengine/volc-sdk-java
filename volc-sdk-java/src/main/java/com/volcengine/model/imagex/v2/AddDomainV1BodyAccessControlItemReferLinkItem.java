package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * AddDomainV1BodyAccessControlItemReferLinkItem
 */
@lombok.Data
public final class AddDomainV1BodyAccessControlItemReferLinkItem  {

    /**
     * <p>是否开启黑白名单配置，取值如下所示：* true：允许空 Refer* false：不允许空 Refer</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enabled")
    private Boolean enabled;

    /**
     * <p>是否选择白名单，取值如下所示：</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "is_white_mode")
    private Boolean isWhiteMode;

    /**
     * <p>根据是否为白名单，为对应的白/黑名单的值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "values")
    private List<String> values;

    /**
     * <p>是否允许空 Refer，取值如下所示：</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "allow_empty_refer")
    private Boolean allowEmptyRefer;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
