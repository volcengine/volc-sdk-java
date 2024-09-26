package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateCloudMixTaskBodyMixedRulesInputLayoutLogoItem
 */
@lombok.Data
public final class CreateCloudMixTaskBodyMixedRulesInputLayoutLogoItem  {

    /**
     * <p>Logo 图片在混流输出整体画面中的布局配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Layout")
    private CreateCloudMixTaskBodyMixedRulesInputLayoutLogoItemLayout layout;

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
