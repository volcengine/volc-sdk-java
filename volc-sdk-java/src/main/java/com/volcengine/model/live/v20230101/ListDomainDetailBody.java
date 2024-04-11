package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListDomainDetailBody
 */
@lombok.Data
public final class ListDomainDetailBody  {

    /**
     * <p>查询数据的页码，取值为 1 时表示查询第一页的数据，取值范围为 [1,1000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>每页显示的数据条数，取值为 10 时表示每页展示 10 条域名信息，取值范围为 [1, 1000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>域名空间列表，缺省情况下表示查询全部域名空间下的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VhostList")
    private List<String> vhostList;

    /**
     * <p>域名状态列表，缺省情况下表示查询全部状态的域名。支持的取值如下所示。</p>
     *
     * <p>- `0`：正常；</p>
     *
     * <p>- `1`：审核中；</p>
     *
     * <p>- `2`：禁用，禁止使用，此时 domain 不生效；</p>
     *
     * <p>- `3`：删除；</p>
     *
     * <p>- `4`：审核被驳回。审核不通过，需要重新创建并审核；</p>
     *
     * <p>- `5`：欠费关停。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainStatusList")
    private List<Integer> domainStatusList;

    /**
     * <p>域名类型列表，缺省情况下表示全部类型的域名。支持的取值如下所示。</p>
     *
     * <p>- `push`：推流域名；</p>
     *
     * <p>- `pull-flv`：拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainTypeList")
    private List<String> domainTypeList;

    /**
     * <p>域名加速区域列表，缺省情况下表示查看全部。支持的取值如下所示。</p>
     *
     * <p>- `cn`：中国大陆；</p>
     *
     * <p>- `cn-global`：全球；</p>
     *
     * <p>- `cn-oversea`：海外及港澳台。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainRegionList")
    private List<String> domainRegionList;

    /**
     * <p>域名名称列表，缺省情况下表示全部域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainNameList")
    private List<String> domainNameList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
