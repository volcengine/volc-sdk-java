package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * GetTemplatesFromBinResResultTemplatesItem
 */
@lombok.Data
public final class GetTemplatesFromBinResResultTemplatesItem  {

    /**
     * <p>服务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceID")
    private String serviceID;

    /**
     * <p>模板名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TemplateName")
    private String templateName;

    /**
     * <p>模版 JSON 内容。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Content")
    private String content;

    /**
     * <p>模板创建时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateAt")
    private String createAt;

    /**
     * <p>模板的摘要信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Abstract")
    private List<String> myAbstract;

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
     * <p>对图片编码使用的质量参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OuputQuality")
    private Integer ouputQuality;

    /**
     * <p>该模板计划使用的输出图片格式。</p>
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
     * <p>模版降级格式，仅针对 heic 格式有效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DemotionFormat")
    private String demotionFormat;

    /**
     * <p>是否同步处理，仅针对 heic 格式有效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Sync")
    private Boolean sync;

    /**
     * <p>该模板的使用用例。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Usage")
    private String usage;

    /**
     * <p>对图片的编辑操作。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Filters")
    private List<GetTemplatesFromBinResResultTemplatesItemFiltersItem> filters;

    /**
     * <p>用于图片服务输出时的图片编码。</p>
     *
     * <p>* 取值`png.use_quant`表示是否开启 png quant 压缩，取值为`true`表示开启，取值为`false`表示关闭；</p>
     *
     * <p>* 取值`heic.sync`表示使用 heic 同步编码，取值为`true`表示同步；</p>
     *
     * <p>* 取值`heic.timeout`表示 heic 同步编码的超时时间，比如 20。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutputExtra")
    private Map<String, Object> outputExtra;

    /**
     * <p>指定图像自适应配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AdaptiveFmt")
    private Map<String, Object> adaptiveFmt;

    /**
     * <p>视频截帧配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Snapshot")
    private Map<String, Object> snapshot;

    /**
     * <p>视频转动图配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Animation")
    private Map<String, Object> animation;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
