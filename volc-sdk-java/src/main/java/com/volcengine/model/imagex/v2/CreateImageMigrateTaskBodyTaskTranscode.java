package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageMigrateTaskBodyTaskTranscode
 */
@lombok.Data
public final class CreateImageMigrateTaskBodyTaskTranscode  {

    /**
     * <p>目标转码格式，仅针对静图执行转码策略。支持的格式有 png、jpeg、heic、avif、webp、vvic。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Format")
    private String format;

    /**
     * <p>转码质量参数，取值范围为 \[1,100\]。对于 PNG 为无损压缩，其他格式下其值越小，压缩率越高，画质越差。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Quality")
    private Integer quality;

    /**
     * <p>包含透明通道的图片是否编码为降级格式。取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：降级</p>
     *
     * <p>- `false`：（默认）不降级</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AlphaDemotion")
    private Boolean alphaDemotion;

    /**
     * <p>降级编码格式，仅当`AlphaDemotion`为`true`时必填。支持的格式有 png、jpeg、heic、avif、webp、vvic。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DemotionFmt")
    private String demotionFmt;

    /**
     * <p>转码是否保留 exif 信息。取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：保留</p>
     *
     * <p>- `false`：（默认）不保留</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableExif")
    private Boolean enableExif;

    /**
     * <p>对带有 CMYK 色彩空间的图片，是否跳过转码处理直接存储原图。取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：（默认）否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SkipCMYK")
    private Boolean skipCMYK;

    /**
     * <p>仅当转码/降级格式为 heic、webp、jpeg 时生效。</p>
     *
     *
     *
     * <p>是否开启自适应转码。</p>
     *
     * <p>- `true`：开启。开启后，将根据 `Format` 或者 `DemotionFmt` 指定格式进行自适应转码处理。</p>
     *
     * <p>- `false`：（默认）关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Adapt")
    private Boolean adapt;

    /**
     * <p>当 jpeg 原图在迁移中指定转码为 heic 图时， heic 图是否需要存储原图大小的数据。</p>
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：（默认）否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReserveJpegSize")
    private Boolean reserveJpegSize;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
