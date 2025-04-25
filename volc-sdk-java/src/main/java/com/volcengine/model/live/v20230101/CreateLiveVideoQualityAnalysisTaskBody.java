package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateLiveVideoQualityAnalysisTaskBody
 */
@lombok.Data
public final class CreateLiveVideoQualityAnalysisTaskBody  {

    /**
     * <p>任务名称，默认为空，任务名称不可重复。由 1 到 50 位数字（0 - 9）、大写小字母（A - Z、a - z）、下划线（_）、短横线（-）和句点（.）组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>待测评的视频流的播放地址，系统将根据该地址获取视频流进行画质测评，支持 FLV、HLS、RTMP 拉流地址。</p>
     *
     * <p>:::tip</p>
     *
     * <p>确保提供的地址是可访问的，并且视频流是可以播放的。如果地址无效或视频流不存在，测评任务将无法正常进行。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SrcURL")
    private String srcURL;

    /**
     * <p>设置画质测评的打点间隔，即系统每隔多长时间对视频流的画质进行一次测评。单位为秒，默认为 10，取值范围为 [3,10]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Interval")
    private Integer interval;

    /**
     * <p>测评任务的持续时长，即任务从开始到结束的时间长度。单位为秒，默认为 180，取值范围为 [60,300]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Integer duration;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
