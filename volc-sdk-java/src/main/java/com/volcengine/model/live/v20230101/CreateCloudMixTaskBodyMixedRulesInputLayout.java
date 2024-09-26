package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateCloudMixTaskBodyMixedRulesInputLayout
 */
@lombok.Data
public final class CreateCloudMixTaskBodyMixedRulesInputLayout  {

    /**
     * <p>混流输出画布配置及素材布局配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Scene")
    private CreateCloudMixTaskBodyMixedRulesInputLayoutScene scene;

    /**
     * <p>混流输出视频中 Logo 布局配置。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>支持最多配置 4 个 Logo，展示层级以添加顺序为准。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Logo")
    private List<CreateCloudMixTaskBodyMixedRulesInputLayoutLogoItem> logo;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
