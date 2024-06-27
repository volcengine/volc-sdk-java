package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateDomainV2Body
 */
@lombok.Data
public final class CreateDomainV2Body  {

    /**
     * <p>待添加到视频直播服务进行加速的域名列表信息。</p>
     *
     * <p>:::tip</p>
     *
     * <p>一个域名空间下最多包含 10 个域名。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domains")
    private List<CreateDomainV2BodyDomainsItem> domains;

    /**
     * <p>域名空间，是一组关联域名的集合，由字母（A - Z、a -z）、数字（0 - 9）和连字符（-） 组成。您可以自定义新的域名空间或调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口获取已有域名使用的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>为域名空间设置所属项目，默认为空表示归属到 `default` 项目，</p>
     *
     * <p>新建域名空间时需要为域名空间绑定项目，您可以在[访问控制-项目列表](https://console.volcengine.com/iam/resourcemanage/project)查看已有项目并对项目进行管理。</p>
     *
     *
     *
     * <p>项目是火山引擎提供的一种资源管理方式，您可以对不同业务或项目使用的云资源进行分组管理，以实现基于项目的账单查看、子账号授权等功能。</p>
     *
     *
     *
     * <p>- 新建域名空间时，需为域名空间设置所属项目。每个域名空间只能属于一个项目，选择已有的域名空间时，项目不可配置；</p>
     *
     * <p>- 使用基于项目的账单查看需提前开通分账服务，请前往[账单管理-分账账单](https://console.volcengine.com/finance/bill/split-bill/)进行服务开通；</p>
     *
     * <p>- 使用基于项目的子账号授权请参见[使用 IAM 用户进行项目权限划分](https://www.volcengine.com/docs/6469/1166573)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProjectName")
    private String projectName;

    /**
     * <p>为域名空间设置资源标签。您可以通过资源标签从不同维度对云资源进行分类和聚合管理，如资源分账等场景。</p>
     *
     * <p>:::tip</p>
     *
     * <p>如需使用标签进行资源分账，可以在可以在[账单管理-费用标签](https://console.volcengine.com/finance/bill/tag/)处管理启用标签，将对应标签运用到账单明细等数据中。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tags")
    private List<CreateDomainV2BodyTagsItem> tags;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
