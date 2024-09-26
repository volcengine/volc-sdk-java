package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateCloudMixTaskBodyMixedRulesInputLayoutLogoItem
 */
@lombok.Data
public final class UpdateCloudMixTaskBodyMixedRulesInputLayoutLogoItem  {

    /**
     * <p>Logo 图片在混流输出整体画面中的布局配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Layout")
    private UpdateCloudMixTaskBodyMixedRulesInputLayoutLogoItemLayout layout;

    /**
     * <p>Logo 图片访问地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
