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
     * <p>域名加速区域，包含以下类型。</p>
     *
     * <p>- `cn`：中国大陆；</p>
     *
     * <p>- `cn-global`：全球；</p>
     *
     * <p>- `cn-oversea`：海外及港澳台。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>域名空间，是一组关联域名的集合，由字母（A - Z、a -z）、数字（0 - 9）和连字符（-） 组成。您可以自定义新的域名空间或调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口查看已有域名使用的域名空间。</p>
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
