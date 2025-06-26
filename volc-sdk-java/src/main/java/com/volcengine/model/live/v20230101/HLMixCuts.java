package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * HLMixCuts
 */
@lombok.Data
public final class HLMixCuts  {

    /**
     * <p>高光混剪结果信息，包含从多个高光片段中混剪生成的最终视频的详细信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HLMixCuts")
    private List<HLMixCut> hLMixCuts;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
