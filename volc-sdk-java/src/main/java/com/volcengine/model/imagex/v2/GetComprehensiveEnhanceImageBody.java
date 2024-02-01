package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetComprehensiveEnhanceImageBody
 */
@lombok.Data
public final class GetComprehensiveEnhanceImageBody  {

    /**
     * <p>服务 ID。</p>
     *
     *
     *
     * <p>- 您可以在 veImageX 控制台 [服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>图片存储 URI 或访问 URL。</p>
     *
     *
     *
     * <p>- 图片 URI 格式，例如：tos-example/7a7979974.jpeg</p>
     *
     * <p>- 图片 URL 格式，可公网访问。例如：https://example.org/tos-example/7a7979974.jpeg~tplv.png</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUri")
    private String imageUri;

    /**
     * <p>优化策略，取值如下所示：</p>
     *
     * <p>- `0`：通用画质提升</p>
     *
     * <p>- `1`：显著画质提升</p>
     *
     * <p>:::tip</p>
     *
     * <p>推荐优先使用通用方案，显著画质提升方案画质分提高 10% 左右，但体积会有一定浮动提升。以上幅度变化基于测试集总结，具体以使用场景为准。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Mode")
    private Integer mode;

    /**
     * <p>内是否启用高级配置，取值如下所示：</p>
     *
     * <p>- `true`：开启。开启后，下述高级配置才会生效。</p>
     *
     * <p>- `false`：（默认）关闭。</p>
     *
     * <p>:::tip</p>
     *
     * <p>适用于 8000 x 8000 以分辨率图像的画质增强。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableConfig")
    private Boolean enableConfig;

    /**
     * <p>去压缩失真强度，取值范围为[0,1]。取值为`0`时表示不处理，取值越大去压缩失真强度越大。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ArStrength")
    private Double arStrength;

    /**
     * <p>去模糊强度，取值范围为[0,1]。取值为`0`时表示不处理，取值越大去模糊强度越大。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DeblurStrength")
    private Double deblurStrength;

    /**
     * <p>降噪强度，取值范围为[0,1]。取值为`0`时表示不降噪，取值越大降噪强度越大。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DenoiseStrength")
    private Double denoiseStrength;

    /**
     * <p>是否开启超分配置，仅满足图像输入边界的图像执行超分处理。取值如下所示：</p>
     *
     * <p>- `true`：开启。仅当开启后，下述超分配置才会生效。</p>
     *
     * <p>- `false`：（默认）关闭。</p>
     *
     * <p>:::tip</p>
     *
     * <p>适用于 8000 x 8000 以内分辨率图像的画质增强。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableSuperResolution")
    private Boolean enableSuperResolution;

    /**
     * <p>超分倍率，仅支持 2 倍和 4 倍。</p>
     *
     * <p>:::tip</p>
     *
     * <p>4 倍超分辨率只适用于 4000 x 4000 以内分辨率图像的画质增强。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Multiple")
    private Integer multiple;

    /**
     * <p>执行超分处理的短边范围最小值，仅当满足图像边界输入的图像执行超分处理。单位为 px。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ShortMin")
    private Integer shortMin;

    /**
     * <p>执行超分处理的短边范围最大值，仅当满足图像边界输入的图像执行超分处理。单位为 px。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ShortMax")
    private Integer shortMax;

    /**
     * <p>执行超分处理的长边范围最小值，仅当满足图像边界输入的图像执行超分处理。单位为 px。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LongMin")
    private Integer longMin;

    /**
     * <p>执行超分处理的长边范围最大值，仅当满足图像边界输入的图像执行超分处理。单位为 px。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LongMax")
    private Integer longMax;

    /**
     * <p>是否开启下采样，即图片在执行增强效果的同时可自定义输出图片分辨率大小。取值如下所示：</p>
     *
     * <p>- `true`：开启。仅当开启后，下述下采样配置才会生效。</p>
     *
     * <p>- `false`：（默认）关闭。</p>
     *
     * <p>:::tip</p>
     *
     * <p>适用于 8000 x 8000 以内分辨率图像的画质增强。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableDownsample")
    private Boolean enableDownsample;

    /**
     * <p>下采样输出图片宽度，图片将适配对应大小。单位为 px。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownsampleOutWidth")
    private Integer downsampleOutWidth;

    /**
     * <p>下采样输出图片高度，图片将适配对应大小。单位为 px。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownsampleOutHeight")
    private Integer downsampleOutHeight;

    /**
     * <p>下采样模式，取值如下所示：</p>
     *
     * <p>- `0`: 仅缩小，图片大于设置的“宽/高”时，将缩小图片</p>
     *
     * <p>- `1`: 仅放大，图片小于设置的“宽/高”时，将放大图片</p>
     *
     * <p>- `2`: 既缩小又放大，即按照自定义“宽/高”输出结果图，该操作可能导致图片变形</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownsampleMode")
    private Integer downsampleMode;

    /**
     * <p>饱和度，取值范围为[0,2]。取值大于 `1` 表示提升饱和度，取值小于 `1` 表示降低饱和度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Saturation")
    private Double saturation;

    /**
     * <p>亮度，取值范围为[90,100]。取值越小，亮度提升越明显。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Brightness")
    private Integer brightness;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
