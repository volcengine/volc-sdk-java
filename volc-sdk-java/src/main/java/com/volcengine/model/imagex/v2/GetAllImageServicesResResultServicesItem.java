package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetAllImageServicesResResultServicesItem
 */
@lombok.Data
public final class GetAllImageServicesResResultServicesItem  {

    /**
     * <p>服务名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceName")
    private String serviceName;

    /**
     * <p>服务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>服务地域，取值如下所示：</p>
     *
     * <p>* `cn`：中国</p>
     *
     * <p>* `va`：美东</p>
     *
     * <p>* `sg`：新加坡</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceRegion")
    private String serviceRegion;

    /**
     * <p>服务类型，取值如下所示：</p>
     *
     * <p>* `StaticRc`：素材托管服务</p>
     *
     * <p>* `Image`：图片处理服务</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceType")
    private String serviceType;

    /**
     * <p>服务状态。状态分为未审核、审核未通过、正常、禁用。</p>
     *
     * <p>:::tip</p>
     *
     * <p>* 只有服务状态为正常时，该服务才可用。</p>
     *
     * <p>* 如果是其他异常状态，请参考[服务管理](https://www.volcengine.com/docs/508/8086)进行处理。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceStatus")
    private String serviceStatus;

    /**
     * <p>服务创建时间，即创建时当地服务器时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateAt")
    private String createAt;

    /**
     * <p>是否配置鉴权 key，取值如下所示：</p>
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HasSigkey")
    private Boolean hasSigkey;

    /**
     * <p>该服务的图片模板固定前缀。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TemplatePrefix")
    private String templatePrefix;

    /**
     * <p>绑定域名的相关信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainInfos")
    private List<GetAllImageServicesResResultServicesItemDomainInfosItem> domainInfos;

    /**
     * <p>主鉴权 Key。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PrimaryKey")
    private String primaryKey;

    /**
     * <p>备鉴权 Key。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SecondaryKey")
    private String secondaryKey;

    /**
     * <p>是否开启源地址访问，取值如下所示：</p>
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ObjectAccess")
    private Boolean objectAccess;

    /**
     * <p>是否开启精简 URL，取值如下所示：</p>
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CompactURL")
    private Boolean compactURL;

    /**
     * <p>镜像回源配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Mirror")
    private GetAllImageServicesResResultServicesItemMirror mirror;

    /**
     * <p>资源配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Storage")
    private GetAllImageServicesResResultServicesItemStorage storage;

    /**
     * <p>服务的授权 Bucket 列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AllowBkts")
    private List<String> allowBkts;

    /**
     * <p>是否开启覆盖上传，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UploadOverwrite")
    private Boolean uploadOverwrite;

    /**
     * <p>事件通知配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EventRules")
    private List<GetAllImageServicesResResultServicesItemEventRulesItem> eventRules;

    /**
     * <p>自定义处理样式具体配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageYAttribute")
    private GetAllImageServicesResResultServicesItemImageYAttribute imageYAttribute;

    /**
     * <p>是否允许配置其他镜像站类型，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AllowMirrorTypes")
    private Boolean allowMirrorTypes;

    /**
     * <p>服务绑定的项目</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProjectName")
    private String projectName;

    /**
     * <p>服务绑定的标签</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResourceTags")
    private List<GetAllImageServicesResResultServicesItemResourceTagsItem> resourceTags;

    /**
     * <p>降冷存储配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageRules")
    private List<GetAllImageServicesResResultServicesItemStorageRulesItem> storageRules;

    /**
     * <p>绑定点播空间配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VodSpace")
    private GetAllImageServicesResResultServicesItemVodSpace vodSpace;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResourceLimitedVisit")
    private GetAllImageServicesResResultServicesItemResourceLimitedVisit resourceLimitedVisit;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
