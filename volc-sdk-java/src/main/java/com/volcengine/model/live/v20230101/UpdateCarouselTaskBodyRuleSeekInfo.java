package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateCarouselTaskBodyRuleSeekInfo
 */
@lombok.Data
public final class UpdateCarouselTaskBodyRuleSeekInfo  {

    /**
     * <p>用于设置素材切换的方式，默认值为 `0`。支持的取值及含义如下：</p>
     *
     *
     *
     * <p>- `0`：播放完当前素材后，再进行素材的切换；</p>
     *
     * <p>- `1`：立即切换到指定的素材，并按指定的播放进度开始播放。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Immediate")
    private Long immediate;

    /**
     * <p>更新后播放的素材ID，只有在 `Immediate=1` 时才有效。</p>
     *
     * <p>- 如果不填，则直接从新素材的第一个素材开始播放。</p>
     *
     * <p>- 如果填了，则会从对应的 `SourceID` 开始播放。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SourceID")
    private String sourceID;

    /**
     * <p>切换素材后，素材播放的位置，单位为秒，表示从该位置开始播放，只有在 `Immediate=1` 时才有效。如果不填，表示从 `SourceID` 所对应素材的起始位置开始播放。</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SourceSeek")
    private Long sourceSeek;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
