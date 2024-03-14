package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageTemplateResResult
 */
@lombok.Data
public final class GetImageTemplateResResult  {

    /**
     * <p>服务id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>模板名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TemplateName")
    private String templateName;

    /**
     * <p>是否直接更新模板。如果为true，已有的线上模板会同步更新，直接生效；如果为false，会新增一个模板，已有模板不受影响。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DoUpdate")
    private Boolean doUpdate;

    /**
     * <p>模板是否开启鉴权。</p>
     *
     * <p>* 取值为`true`，表示开启鉴权。</p>
     *
     * <p>* 取值为`false`，表示关闭鉴权。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WithSig")
    private Boolean withSig;

    /**
     * <p>图片模板的参数列表，URL 中下发参数的顺序需要跟列表中的保持一致。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Parameters")
    private List<String> parameters;

    /**
     * <p>URL 的失效期，为 Unix 时间戳。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReqDeadline")
    private String reqDeadline;

    /**
     * <p>对图片编码使用的质量参数，取值范围为 [1,100]，默认为 75。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OuputQuality")
    private Double ouputQuality;

    /**
     * <p>默认为空，使用绝对质��；传relative，使用相对质量，原图为JPEG有效</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QualityMode")
    private String qualityMode;

    /**
     * <p>该模板计划使用的输出格式.</p>
     *
     * <p>* 取值为`image`，表示输出原格式。</p>
     *
     * <p>* 支持输出的静图格式：png、jpeg、heic、avif、webp。</p>
     *
     * <p>* 支持输出的动图格式：awebp、heif、avis。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutputFormat")
    private String outputFormat;

    /**
     * <p>模板计划使用的降级格式，仅对 heic 静图有效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DemotionFormat")
    private String demotionFormat;

    /**
     * <p>是否同步处理，仅对 heic 图有效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Sync")
    private String sync;

    /**
     * <p>对图片的编辑操作。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Filters")
    private List<GetImageTemplateResResultFiltersItem> filters;

    /**
     * <p>编码自定义参数，键值均为 String。</p>
     *
     * <p>* 取值`png.use_quant`表示是否开启 png quant 压缩，取值为`true`表示开启，取值为`false`表示关闭；</p>
     *
     * <p>* 取值`heic.sync`表示使用 heic 同步编码，取值为`true`表示同步；</p>
     *
     * <p>* 取值`heic.timeout`表示 heic 同步编码的超时时间，比如 20。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutputExtra")
    private GetImageTemplateResResultOutputExtra outputExtra;

    /**
     * <p>指定图像自适应配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AdaptiveFmt")
    private GetImageTemplateResResultAdaptiveFmt adaptiveFmt;

    /**
     * <p>视频截帧配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Snapshot")
    private GetImageTemplateResResultSnapshot snapshot;

    /**
     * <p>视频转动图配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Animation")
    private GetImageTemplateResResultAnimation animation;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
