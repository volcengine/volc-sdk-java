package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateLiveVideoQualityAnalysisTaskBody
 */
@lombok.Data
public final class CreateLiveVideoQualityAnalysisTaskBody  {

    /**
     * <p>任务名称，默认为空，进行中任务名称不可重复，长度需小于 16 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>待测评流的播放地址，支持 FLV、HLS、RTMP 拉流地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SrcURL")
    private String srcURL;

    /**
     * <p>画质测评的打点间隔，单位为秒，默认为 10，取值范围为 [3，10]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Interval")
    private Integer interval;

    /**
     * <p>测评任务持续时长，单位为秒，默认为 180，取值范围为 [60,300]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Integer duration;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
