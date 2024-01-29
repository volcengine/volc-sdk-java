package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateImageTemplateBody
 */
@lombok.Data
public final class CreateImageTemplateBody  {

    /**
     * <p>模板名称，必须使用该服务的图片模板固定前缀。模板名称能包含的字符正则集合为[a-zA-Z0-9_-]。</p>
     *
     * <p>:::tip</p>
     *
     * <p>您可以通过调用[获取单个服务信息](https://www.volcengine.com/docs/508/9358)接口的查看返回参数`TemplatePrefix`的值。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TemplateName")
    private String templateName;

    /**
     * <p>是否为临时使用，取值如下所示：</p>
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Temporary")
    private Boolean temporary;

    /**
     * <p>仅当指定输出格式非动图时，配置有效。</p>
     *
     * <p>保留 EXIF 信息配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Exif")
    private CreateImageTemplateBodyExif exif;

    /**
     * <p>对结果图片执行的画质评估配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Evals")
    private List<CreateImageTemplateBodyEvalsItem> evals;

    /**
     * <p>是否直接更新模板，取值如下所示：</p>
     *
     * <p>* `true`：已有的线上模板会同步更新，该操作直接生效；</p>
     *
     * <p>* `false`：新增一个模板，已有模板不受影响。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DoUpdate")
    private Boolean doUpdate;

    /**
     * <p>是否开启鉴权，取值如下所示：</p>
     *
     * <p>* `true`：开启鉴权。</p>
     *
     * <p>* `false`：（默认）关闭鉴权。</p>
     *
     * <p>:::tip</p>
     *
     * <p>一般当通过模板参数下发敏感信息时，比如文字水印内容、URL 失效期，需要对图片 URL 鉴权保护，防止内容被篡改。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WithSig")
    private Boolean withSig;

    /**
     * <p>图片模板使用的参数列表，URL 中下发参数的顺序需要跟列表中的保持一致。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Parameters")
    private List<String> parameters;

    /**
     * <p>URL 的失效期，为 Unix 时间戳，一般配置为在 URL 中通过模板参数动态下发。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReqDeadline")
    private String reqDeadline;

    /**
     * <p>对图片编码使用的质量参数，取值范围为 [1,100]，默认为 75。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OuputQuality")
    private Integer ouputQuality;

    /**
     * <p>压缩质量模型，默认为空，表示使用绝对质量。取值 `relative` 时，表示使用相对质量，原图为 JPEG 有效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QualityMode")
    private String qualityMode;

    /**
     * <p>是否对图片结果缓存，默认为空。取值如下所示：</p>
     *
     * <p>- `read_write`：对结果读写</p>
     *
     * <p>- `read_only`：对结果只读</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Persistence")
    private String persistence;

    /**
     * <p>该模板计划使用的输出格式。</p>
     *
     * <p>* 取值为`image`，表示输出原格式。</p>
     *
     * <p>* 支持输出的静图格式：`png`、`jpeg`、`heic`、`avif`、`webp`、`vvic`。</p>
     *
     * <p>* 支持输出的动图格式：`awebp`、`heif`、`avis`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutputFormat")
    private String outputFormat;

    /**
     * <p>模板计划使用的降级格式，仅对 heic 静图有效。取值如下所示：</p>
     *
     * <p>- `webp`</p>
     *
     * <p>- `jpeg`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DemotionFormat")
    private String demotionFormat;

    /**
     * <p>是否同步处理，仅对 heic 静图有效。取值如下所示：</p>
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Sync")
    private Boolean sync;

    /**
     * <p>对图片的编辑操作。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Filters")
    private List<CreateImageTemplateBodyFiltersItem> filters;

    /**
     * <p>用于图片服务输出时的图片编码自定义参数，键值均为 string。</p>
     *
     * <p>* 取值`png.use_quant`表示是否开启 png quant 压缩，取值为`true`表示开启，取值为`false`表示关闭；</p>
     *
     * <p>* 取值`heic.sync`表示使用 heic 同步编码，取值为`true`表示同步；</p>
     *
     * <p>* 取值`heic.timeout`表示 heic 同步编码的超时时间，比如 20。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutputExtra")
    private CreateImageTemplateBodyOutputExtra outputExtra;

    /**
     * <p>指定图像自适应配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AdaptiveFmt")
    private CreateImageTemplateBodyAdaptiveFmt adaptiveFmt;

    /**
     * <p>仅当指定输出格式为静图时，配置有效。</p>
     *
     * <p>视频截帧配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Snapshot")
    private CreateImageTemplateBodySnapshot snapshot;

    /**
     * <p>仅当指定输出格式为动图时，配置有效。</p>
     *
     * <p>视频转动图配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Animation")
    private CreateImageTemplateBodyAnimation animation;

    /**
     * <p>仅当指定输出格式为静图时，配置有效。</p>
     *
     * <p>动图截帧配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AnimExtract")
    private CreateImageTemplateBodyAnimExtract animExtract;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
