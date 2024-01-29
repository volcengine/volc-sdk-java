package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetResourceURLQuery
 */
@lombok.Data
public final class GetResourceURLQuery  {

    /**
     * <p>服务 ID。</p>
     *
     * <p>- 您可以在 veImageX 控制台 [服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>域名。</p>
     *
     * <p>您可以通过调用 OpenAPI [获取服务下所有域名](https://www.volcengine.com/docs/508/9379)查看 domain 返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>图片资源 Uri。</p>
     *
     * <p>您可以通过调用 OpenAPI [获取文件上传成功信息](https://www.volcengine.com/docs/508/9398)查看 ImageUri 返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "URI")
    private String uRI;

    /**
     * <p>模板名称。缺省情况下表示无模板处理图片。</p>
     *
     * <p>您可以通过调用 OpenAPI [获取服务下所有图片模板](https://www.volcengine.com/docs/508/9386)里查看 TemplateName 返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tpl")
    private String tpl;

    /**
     * <p>协议，默认为 http，隐私图片使用 https，公开图片支持取值 http 以及 https。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Proto")
    private String proto;

    /**
     * <p>创建模板时设置的图片输出格式，默认为 iamge，支持取值有：</p>
     *
     * <p>- image：表示输出原格式；</p>
     *
     * <p>- 静图格式：png、jpeg、heic、avif、webp;</p>
     *
     * <p>- 动图格式：awebp、heif、avis。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Format")
    private String format;

    /**
     * <p>过期时长，最大限制为 1 年，默认1800s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Timestamp")
    private Integer timestamp;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
