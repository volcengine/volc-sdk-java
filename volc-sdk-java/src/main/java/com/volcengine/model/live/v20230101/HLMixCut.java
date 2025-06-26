package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * HLMixCut
 */
@lombok.Data
public final class HLMixCut  {

    /**
     * <p>高光剪辑混剪结果序号，用于标识混剪结果在结果列表中的顺序位置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Index")
    private Integer index;

    /**
     * <p>高光剪辑混剪结果视频对应的片段详情信息，包含从原始视频中提取的高光片段信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HLClips")
    private List<HLClip> hLClips;

    /**
     * <p>高光剪辑混剪结果视频的时长，单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Long duration;

    /**
     * <p>高光剪辑混剪结果上传至视频点播（VOD）服务后的视频唯一标识符 `vid`（Video ID），用于唯一标识该视频文件。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HighlightUrl")
    private String highlightUrl;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
