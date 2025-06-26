package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * HLSourceClips
 */
@lombok.Data
public final class HLSourceClips  {

    /**
     * <p>高光片段结果数组。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HLSourceClips")
    private List<HLSourceClip> hLSourceClips;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
