package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateCloudMixTaskBodyMixedRules
 */
@lombok.Data
public final class CreateCloudMixTaskBodyMixedRules  {

    /**
     * <p>混流输出布局配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InputLayout")
    private CreateCloudMixTaskBodyMixedRulesInputLayout inputLayout;

    /**
     * <p>混流输出视频质量参数配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Output")
    private CreateCloudMixTaskBodyMixedRulesOutput output;

    /**
     * <p>混流素材列表，最多支持配置 8 路素材。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InputSource")
    private List<CreateCloudMixTaskBodyMixedRulesInputSourceItem> inputSource;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
