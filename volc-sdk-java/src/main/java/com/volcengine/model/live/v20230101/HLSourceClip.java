package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * HLSourceClip
 */
@lombok.Data
public final class HLSourceClip  {

    /**
     * <p>高光剪辑所属视频 `SourceUrl` 的片段结果数组，包含从原始视频中提取的高光片段信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HLClips")
    private List<HLClip> hLClips;

    /**
     * <p>高光剪辑片段所属的原始视频 URL 地址，用于标识该片段是从哪个原始视频中提取的。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SourceUrl")
    private String sourceUrl;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
