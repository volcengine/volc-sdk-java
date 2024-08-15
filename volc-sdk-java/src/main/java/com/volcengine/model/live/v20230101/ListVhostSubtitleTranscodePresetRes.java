package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostSubtitleTranscodePresetRes
 */
@lombok.Data
public final class ListVhostSubtitleTranscodePresetRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListVhostSubtitleTranscodePresetResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListVhostSubtitleTranscodePresetResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
