package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveStreamStateResResult
 */
@lombok.Data
public final class DescribeLiveStreamStateResResult  {

    /**
     * <p>直播流状态。</p>
     *
     *
     *
     * <p>- online：在线流；</p>
     *
     * <p>- offline：历史流；</p>
     *
     * <p>- forbidden：禁推流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "stream_state")
    private String streamState;

    /**
     * <p>直播流类型。</p>
     *
     *
     *
     * <p>- push：直推直拉；</p>
     *
     * <p>- pull：回源拉流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "type")
    private String type;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
