package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateDomainV2Body
 */
@lombok.Data
public final class CreateDomainV2Body  {

    /**
     * <p>域名列表，总和最多十个。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domains")
    private List<CreateDomainV2BodyDomainsItem> domains;

    /**
     * <p>区域，包含以下类型。</p>
     *
     * <p>- cn：中国大陆；</p>
     *
     * <p>- cn-global：全球；</p>
     *
     * <p>- cn-oversea：海外及港澳台。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>项目名称，vhost 将归类这个项目里，仅在新创建 vhost 时需要设置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProjectName")
    private String projectName;

    /**
     * <p>标签列表，vhost 将归类这个 tag 里。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tags")
    private List<CreateDomainV2BodyTagsItem> tags;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
