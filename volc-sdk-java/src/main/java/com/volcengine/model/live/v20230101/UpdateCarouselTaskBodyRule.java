package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateCarouselTaskBodyRule
 */
@lombok.Data
public final class UpdateCarouselTaskBodyRule  {

    /**
     * <p>指定此素材连续播放的次数。该字段值必须大于等于 `0`，不传时，将保持原有轮播配置。支持的取值及含义如下：</p>
     *
     *
     *
     * <p>- `0`：不循环播放；</p>
     *
     * <p>- 其他正整数：按照指定次数循环播放。</p>
     *
     *
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Loop")
    private Integer loop;

    /**
     * <p>轮播素材列表，用于指定在轮播过程中播放的素材资源。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Source")
    private List<UpdateCarouselTaskBodyRuleSourceItem> source;

    /**
     * <p>控制素材更新后的播放行为的配置参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SeekInfo")
    private UpdateCarouselTaskBodyRuleSeekInfo seekInfo;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
