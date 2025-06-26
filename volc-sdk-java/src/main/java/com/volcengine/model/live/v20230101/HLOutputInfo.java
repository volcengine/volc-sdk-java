package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * HLOutputInfo
 */
@lombok.Data
public final class HLOutputInfo  {

    /**
     * <p>高光混剪结果，包含从多个高光片段中混剪生成的最终视频信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HLMixOutput")
    private HLMixCuts hLMixOutput;

    /**
     * <p>高光剪辑任务生产结果中的高光片段结果，包含从原始视频中提取的高光片段信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HLClipsOutput")
    private HLSourceClips hLClipsOutput;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
