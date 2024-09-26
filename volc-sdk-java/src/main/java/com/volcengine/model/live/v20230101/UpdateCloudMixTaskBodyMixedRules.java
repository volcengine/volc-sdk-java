package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateCloudMixTaskBodyMixedRules
 */
@lombok.Data
public final class UpdateCloudMixTaskBodyMixedRules  {

    /**
     * <p>混流输出布局配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InputLayout")
    private UpdateCloudMixTaskBodyMixedRulesInputLayout inputLayout;

    /**
     * <p>混流输出流参数配置。</p>
     *
     * <p>:::warning</p>
     *
     * <p>更新云端混流任务时，Output 参数不支持变更，且必须传入与原混流任务一致的配置。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Output")
    private UpdateCloudMixTaskBodyMixedRulesOutput output;

    /**
     * <p>混流素材列表，最多支持配置 8 路输入源。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InputSource")
    private List<UpdateCloudMixTaskBodyMixedRulesInputSourceItem> inputSource;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
