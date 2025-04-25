package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateHighLightTaskBody
 */
@lombok.Data
public final class CreateHighLightTaskBody  {

    /**
     * <p>任务名称，长度限制 1-256 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>数据源类型。缺省情况下，取值为 `0`。</p>
     *
     * <p>- `0`：表示直播流。</p>
     *
     * <p>- `1`：表示点播视频。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private Integer type;

    /**
     * <p>算法模型类型。缺省情况下，取值为 `0`。</p>
     *
     * <p>- `0`：体育足球。</p>
     *
     * <p>- `1`：文娱短剧，仅适用于视频源类型为点播视频的场景，即 `"Type":1`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Model")
    private Integer model;

    /**
     * <p>数据源类型和地址。</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Sources")
    private List<CreateHighLightTaskBodySourcesItem> sources;

    /**
     * <p>高光片段的输出及相关参数设置。</p>
     *
     * <p>:::tip</p>
     *
     * <p>`HLClipsParam` 和 `HLMixParam` 至少需配置一个，支持同时启用。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HLClipsParam")
    private CreateHighLightTaskBodyHLClipsParam hLClipsParam;

    /**
     * <p>高光混剪的输出及相关参数设置。</p>
     *
     * <p>:::tip</p>
     *
     * <p>`HLClipsParam` 和 `HLMixParam` 至少需配置一个，支持同时启用。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HLMixParam")
    private CreateHighLightTaskBodyHLMixParam hLMixParam;

    /**
     * <p>直播流剪辑任务的配置参数，仅在数据源类型为直播（即 `"Type":0`）时生效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LiveParam")
    private CreateHighLightTaskBodyLiveParam liveParam;

    /**
     * <p>高光视频上传至视频点播的相关配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VodParam")
    private CreateHighLightTaskBodyVodParam vodParam;

    /**
     * <p>回调通知参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackParam")
    private CreateHighLightTaskBodyCallbackParam callbackParam;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
