package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateHTTPHeaderConfigBody
 */
@lombok.Data
public final class UpdateHTTPHeaderConfigBody  {

    /**
     * <p>域名空间，即直播流地址的域名所属的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看需要域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>拉流域名。默认为空，表示 Vhost 下的全部拉流域名。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看配置的拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>HTTP Header 的类型，支持的取值及含义如下所示。</p>
     *
     * <p>- `0`：请求响应头；</p>
     *
     * <p>- `1`：回源请求头。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Phase")
    private Integer phase;

    /**
     * <p>Header 具体字段配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderConfigList")
    private List<UpdateHTTPHeaderConfigBodyHeaderConfigListItem> headerConfigList;

    /**
     * <p>是否保留原 Header 配置，取值及含义如下所示。</p>
     *
     * <p>- `0`：保留（默认值）；</p>
     *
     * <p>- `1`：不保留。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BlockOriginal")
    private Integer blockOriginal;

    /**
     * <p>配置完成后是否启用，取值及含义如下所示。</p>
     *
     * <p>- `true`：启用；</p>
     *
     * <p>- `false`：禁用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
