package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListCertV2Body
 */
@lombok.Data
public final class ListCertV2Body  {

    /**
     * <p>证书是否启用，默认值为 `true`，支持的取值及含义如下所示。</p>
     *
     * <p>- `true`：启用证书；</p>
     *
     * <p>- `false`：禁用证书。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Available")
    private Boolean available;

    /**
     * <p>域名，查询该域名对应的证书，支持精确查询。默认为空，您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>证书是否过期，默认值为 false，支持的取值及含义如下所示。</p>
     *
     * <p>- `false`：查询未过期的证书；</p>
     *
     * <p>- `true`：查询已过期的证书。</p>
     *
     * <p>:::tip</p>
     *
     * <p>查看证书是否过期时，必须同时传入 Available 参数。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Expiring")
    private Boolean expiring;

    /**
     * <p>证书名称，支持输入证书名称中的关键字，进行模糊查询.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertName")
    private String certName;

    /**
     * <p>分页查询时的页码，不填默认返回所有数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>分页大小，用于指定每页返回的证书数量。不填默认返回所有数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>项目名称，用于筛选指定项目下的证书。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProjectName")
    private String projectName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
