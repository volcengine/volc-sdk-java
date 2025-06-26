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
     * <p>算法模型类型，缺省情况下取值为 `0`。</p>
     *
     * <p>- `0`：体育足球；</p>
     *
     * <p>- `1`：文娱短剧，仅适用于视频源类型为点播视频的场景，即 `"Type":1`；</p>
     *
     * <p>- `2`：电商，仅适用于视频源类型为点播视频的场景，即 `"Type":1`。</p>
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
     * <p>回调通知参数配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackParam")
    private CreateHighLightTaskBodyCallbackParam callbackParam;

    /**
     * <p>电商场景下使用的卖点效果配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SellPointParam")
    private CreateHighLightTaskBodySellPointParam sellPointParam;

    /**
     * <p>算法模型的子类型，根据任务类型和场景进行选择，具体取值如下所示。</p>
     *
     * <p>- 体育足球：`0` 表示默认类型剪辑；</p>
     *
     * <p>- 文娱短剧：`0` 表示默认类型剪辑；</p>
     *
     * <p>- 电商：`0` 表示默认类型剪辑，`1` 表示电商视频提取分镜转场素材。默认值为 `0`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SubModel")
    private Integer subModel;

    /**
     * <p>音频生成字幕的相关配置，包括字幕的位置、描边和字体样式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SubtitleParam")
    private CreateHighLightTaskBodySubtitleParam subtitleParam;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
