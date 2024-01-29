package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateImageServiceBody
 */
@lombok.Data
public final class CreateImageServiceBody  {

    /**
     * <p>服务名称，最多不超过 32 个字符。创建成功后，名称和区域不支持变更。建议您使用能够标识业务的服务名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceName")
    private String serviceName;

    /**
     * <p>服务地域，取值如下所示：</p>
     *
     * <p>* `cn`：中国；</p>
     *
     * <p>* `va`：美东；</p>
     *
     * <p>* `sg`：新加坡。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceRegion")
    private String serviceRegion;

    /**
     * <p>服务类型，取值如下所示：</p>
     *
     * <p>* `StaticRc`：素材托管服务，支持任何合法资源的存储和分发。</p>
     *
     * <p>* `Image`：图片处理服务，除支持存储任意合法资源外，还支持对图片进行实时处理。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceType")
    private String serviceType;

    /**
     * <p>创建服务时需要绑定的域名列表，最多支持一次绑定 10 个域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domains")
    private List<CreateImageServiceBodyDomainsItem> domains;

    /**
     * <p>服务的存储有效期。若资源有效期到期，veImageX 将自动删除指定服务内的资源。单位为秒，取值范围为 [600, 7776000]。</p>
     *
     * <p>若取值超过整天，则默认向上取整，例如当`TTL`取值为`86401`时，实际有效期被设置为 2 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageTTL")
    private Long storageTTL;

    /**
     * <p>服务绑定的项目，默认值为 `default`。项目是在火山引擎访问控制中资源分组的概念，您需要将服务加入某一个项目中。您可以在火山引擎控制台[项目管理](https://console.volcengine.com/iam/projcetmanage/)页面中获取项目名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProjectName")
    private String projectName;

    /**
     * <p>服务绑定的标签，默认为空，表示不绑定标签。可用于通过标签将不同业务类别、用途的存储服务进行分类管理，也适用于标签制授权和标签分账等场景。您可以在火山引擎控制台[资源管理](https://console.volcengine.com/resourcemanager/tag/resource_tag)页面新建标签。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResourceTags")
    private List<CreateImageServiceBodyResourceTagsItem> resourceTags;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
