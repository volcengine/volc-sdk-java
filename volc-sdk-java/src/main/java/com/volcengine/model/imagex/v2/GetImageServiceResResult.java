package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageServiceResResult
 */
@lombok.Data
public final class GetImageServiceResResult  {

    /**
     * <p>服务名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceName")
    private String serviceName;

    /**
     * <p>指定的服务 ID。</p>
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
     * <p>服务是否已经配置鉴权 key，取值如下所示：</p>
     *
     * <p>- `true`：已配置</p>
     *
     * <p>- `false`：未配置</p>
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
    private List<GetImageServiceResResultDomainInfosItem> domainInfos;

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
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ObjectAccess")
    private Boolean objectAccess;

    /**
     * <p>是否开启精简 URL，取值如下所示：</p>
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CompactURL")
    private Boolean compactURL;

    /**
     * <p>镜像回源配置，默认关闭。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Mirror")
    private GetImageServiceResResultMirror mirror;

    /**
     * <p>资源配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Storage")
    private GetImageServiceResResultStorage storage;

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
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UploadOverwrite")
    private Boolean uploadOverwrite;

    /**
     * <p>事件通知规则</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EventRules")
    private List<GetImageServiceResResultEventRulesItem> eventRules;

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
     * <p>自定义处理相关配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageYAttribute")
    private GetImageServiceResResultImageYAttribute imageYAttribute;

    /**
     * <p>是否开启自定义处理样式，取值如下所示：</p>
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageY")
    private Boolean imageY;

    /**
     * <p>用于保护「数据加密密钥」的密钥，只有加密上传的图片需要做处理时需要申请。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RsaPublicKey")
    private String rsaPublicKey;

    /**
     * <p>服务绑定的项目，默认为 default。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProjectName")
    private String projectName;

    /**
     * <p>服务绑定的标签。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResourceTags")
    private List<GetImageServiceResResultResourceTagsItem> resourceTags;

    /**
     * <p>绑定的点播空间信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VodSpace")
    private GetImageServiceResResultVodSpace vodSpace;

    /**
     * <p>存储降冷策略</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageRules")
    private List<GetImageServiceResResultStorageRulesItem> storageRules;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResourceLimitedVisit")
    private GetImageServiceResResultResourceLimitedVisit resourceLimitedVisit;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageVersioning")
    private Integer storageVersioning;

    /**
     * <p>存储规则。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageRulesV2")
    private List<GetImageServiceResResultStorageRulesV2Item> storageRulesV2;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
