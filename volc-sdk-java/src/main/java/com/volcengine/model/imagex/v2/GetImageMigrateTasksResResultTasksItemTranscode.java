package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageMigrateTasksResResultTasksItemTranscode
 */
@lombok.Data
public final class GetImageMigrateTasksResResultTasksItemTranscode  {

    /**
     * <p>目标转码格式。支持的格式有 png、jpeg、heic、avif、webp、vvic。 </p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Format")
    private String format;

    /**
     * <p>降级编码格式。支持的格式有 png、jpeg、heic、avif、webp、vvic。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DemotionFmt")
    private String demotionFmt;

    /**
     * <p>包含透明通道的图片是否编码为降级格式。取值如下所示：</p>
     *
     * <p>- `true`：降级</p>
     *
     * <p>- `false`：不降级</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AlphaDemotion")
    private Boolean alphaDemotion;

    /**
     * <p>转码质量参数。对于 PNG 为无损压缩，其他格式下其值越小，压缩率越高，画质越差。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Quality")
    private Integer quality;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
