package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetResourceURLQuery
 */
@lombok.Data
public final class GetResourceURLQuery  {

    /**
     * <p>资源所在的服务 ID。</p>
     *
     * <p>- 您可以在 veImageX 控制台 [服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>域名。您可以通过调用 OpenAPI [获取服务下所有域名](https://www.volcengine.com/docs/508/9379)获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>文件存储 Uri。您可以通过调用 OpenAPI [获取服务下的上传文件](https://www.volcengine.com/docs/508/9392)获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "URI")
    private String uRI;

    /**
     * <p>模板名称，缺省情况下表示无模板处理图片。您可以通过调用 OpenAPI [获取服务下所有图片模板](https://www.volcengine.com/docs/508/9386)获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tpl")
    private String tpl;

    /**
     * <p>协议，默认为 http，隐私图片使用 https，公开图片支持取值 http 以及 https。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Proto")
    private String proto;

    /**
     * <p>创建模板时设置的图片输出格式，默认为 image，支持取值有：</p>
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
     * <p>过期时长，最大限制为 1 年，默认为 1800s。</p>
     *
     * <p>:::tip</p>
     *
     * <p>仅当开启 [URL 鉴权](https://www.volcengine.com/docs/508/128828)配置后，`Timestamp` 配置生效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Timestamp")
    private Integer timestamp;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
