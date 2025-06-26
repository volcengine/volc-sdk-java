package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * HLClip
 */
@lombok.Data
public final class HLClip  {

    /**
     * <p>高光剪辑片段相对所属原始视频的截止时间位置，单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SEnd")
    private Long sEnd;

    /**
     * <p>高光剪辑片段相对高光片段或者高光混剪的截止时间位置，单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HLEnd")
    private Long hLEnd;

    /**
     * <p>高光剪辑片段所属原始视频的序号，用于标识该片段在原始视频中的顺序位置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Index")
    private Integer index;

    /**
     * <p>高光片段的类型标识。当前仅用于体育足球场景，可能的取值如下所示。</p>
     *
     * <p>- `0`：无标签；</p>
     *
     * <p>- `1`：背景；</p>
     *
     * <p>- `2`：进球；</p>
     *
     * <p>- `3`：角球；</p>
     *
     * <p>- `4`：点球；</p>
     *
     * <p>- `5`：黄牌；</p>
     *
     * <p>- `6`：红牌；</p>
     *
     * <p>- `7`：犯规；</p>
     *
     * <p>- `8`：射门；</p>
     *
     * <p>- `9`：任意球。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Label")
    private Integer label;

    /**
     * <p>高光剪辑片段的高光分数，用于评估该片段在原始视频中的精彩程度。分数越高表示该片段越精彩，分数区间范围为 [0, 10]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Score")
    private Float score;

    /**
     * <p>高光剪辑片段相对所属原始视频的起始时间位置，单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SStart")
    private Long sStart;

    /**
     * <p>高光剪辑片段上传至视频点播（VOD）服务后的视频唯一标识符 `vid`（Video ID），用于唯一标识该视频文件。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ClipUrl")
    private String clipUrl;

    /**
     * <p>高光剪辑片段相对高光片段或者高光混剪的起始时间位置，单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HLStart")
    private Long hLStart;

    /**
     * <p>高光剪辑片段时长，单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Long duration;

    /**
     * <p>高光剪辑片段所属的原始视频 URL 地址，用于标识该片段是从哪个原始视频中提取的。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SourceUrl")
    private String sourceUrl;

    /**
     * <p>高光片段类型标识（即 `Label`）的置信度，用于表示该类型标识的可靠程度。仅适用于体育足球场景，取值范围为 [0,1]，数值越大表示置信度越高。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Confidence")
    private Float confidence;

    /**
     * <p>高光片段内容描述。仅适用于体育足球。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Description")
    private String description;

    /**
     * <p>高光剪辑片段的卖点信息结果。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SellPointsRes")
    private List<SellPointsRes> sellPointsRes;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
