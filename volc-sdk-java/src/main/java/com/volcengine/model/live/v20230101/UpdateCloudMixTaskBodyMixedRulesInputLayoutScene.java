package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateCloudMixTaskBodyMixedRulesInputLayoutScene
 */
@lombok.Data
public final class UpdateCloudMixTaskBodyMixedRulesInputLayoutScene  {

    /**
     * <p>混流输出整体画布高度，单位为 px，取值范围为 [10,2160]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Height")
    private Integer height;

    /**
     * <p>混流输出画布整体宽度，单位为 px，取值范围为 [10,2160]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Integer width;

    /**
     * <p>混流素材在混流输出整体画面中的布局配置。</p>
     *
     * <p>:::tip</p>
     *
     * <p>混流素材布局中需包含所有素材的配置，且需与通过 Layer 参数与混流素材一一匹配。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Layout")
    private List<UpdateCloudMixTaskBodyMixedRulesInputLayoutSceneLayoutItem> layout;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
