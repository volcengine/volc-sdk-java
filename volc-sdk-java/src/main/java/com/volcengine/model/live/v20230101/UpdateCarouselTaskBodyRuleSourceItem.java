package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateCarouselTaskBodyRuleSourceItem
 */
@lombok.Data
public final class UpdateCarouselTaskBodyRuleSourceItem  {

    /**
     * <p>轮播素材的唯一标识符。在同一播放列表中，每个素材的 `ID` 必须唯一，不允许重复。</p>
     *
     * <p>:::tip</p>
     *
     * <p>如果素材的 `ID` 没有变化（即更新的 `ID` 与原素材的 `ID` 相同），只能更新除 `Type` 和 `Url` 以外的其他参数。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private String iD;

    /**
     * <p>轮播素材的文件类型，用于指定素材的文件来源类型。支持以下取值：</p>
     *
     *
     *
     * <p>- `vod`：点播 MP4 或 FLV 文件；</p>
     *
     * <p>- `m3u8`：点播 M3U8 文件。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>如果素材的 `ID` 没有变化（即更新的 `ID` 与原素材的 `ID` 相同），`Type` 取值要和元素材保持一致。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>轮播素材的公网可访问地址。确保提供的地址能够被公网正常访问，以便正确加载轮播素材内容。</p>
     *
     * <p>:::tip</p>
     *
     * <p>如果素材的 `ID` 没有变化（即更新的 `ID` 与原素材的 `ID` 相同），`Url` 取值要和元素材保持一致。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    /**
     * <p>用于控制当前素材播放时跳过开头的一段时间，例如，跳过片头，单位为秒。该字段仅在素材类型为视频点播（`type=vod`）时有效。以下是该字段的使用规则：</p>
     *
     *
     *
     * <p>- 如果 `Seek` 的取值小于等于 `0` 或大于视频的实际时长，则该字段不生效。</p>
     *
     * <p>- 确保根据点播素材的实际长度设置合适的值，以实现跳过片头的效果。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Seek")
    private Integer seek;

    /**
     * <p>指定此素材连续播放的次数。该字段值必须大于等于 `0`，不传时，将保持原有轮播配置。支持的取值及含义如下：</p>
     *
     *
     *
     * <p>- `0`：不循环播放；</p>
     *
     * <p>- 其他正整数：按照指定次数循环播放。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Loop")
    private Integer loop;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
