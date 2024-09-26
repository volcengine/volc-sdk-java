package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateCloudMixTaskBodyMixedRulesInputSourceItem
 */
@lombok.Data
public final class CreateCloudMixTaskBodyMixedRulesInputSourceItem  {

    /**
     * <p>混流素材 ID，一个任务中素材 ID 不能重复，此 ID 用于任务状态回调消息中标识素材。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private String iD;

    /**
     * <p>混流素材的叠放顺序，1 为最底层，2 层在 1 层之上，以此类推，取值范围为[1,9999]。</p>
     *
     * <p>:::tip</p>
     *
     * <p>当前准备使用某个素材作为布局背景时，其叠放顺序应设置为所有素材中的最小值。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Layer")
    private Integer layer;

    /**
     * <p>混流素材类型，支持的取值及含义如下所示。</p>
     *
     * <p>- `vod`：视频点播中的素材，支持 MP4、FLV 格式素材；</p>
     *
     * <p>- `live`：直播源素材，支持 RTMP、FLV 协议拉流地址；</p>
     *
     * <p>- `pic`：图片素材，支持 png、jpg 格式图片。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>混流素材的访问地址。</p>
     *
     * <p>:::tip</p>
     *
     * <p>混流素材的访问地址需与混流素材的类型保持对应关系。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
