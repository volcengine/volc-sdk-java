package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateRefererBody
 */
@lombok.Data
public final class UpdateRefererBody  {

    /**
     * <p>应用名称，取值与直播流地址中 AppName 字段取值相同，默认为空，表示所有应用名称。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     *
     * <p>:::tip</p>
     *
     * <p>参数 `Domain` 和 `App` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>拉流域名，您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console-stable.volcanicengine.com/live/main/domain/list)页面，查看直播流使用的拉流域名。</p>
     *
     * <p>:::tip</p>
     *
     * <p>参数 `Domain` 和 `App` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>Referer 防盗链规则列表。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 同一个 Vhost 下，默认支持配置不超过 100 个 Referer 规则，如需提升限额请[创建工单](https://console.volcengine.com/workorder/create?step=2&SubProductID=P00000076)获取技术支持；</p>
     *
     * <p>- 单次请求最多支持配置 100 个 Referer 规则。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RefererInfoList")
    private List<UpdateRefererBodyRefererInfoListItem> refererInfoList;

    /**
     * <p>域名空间，即直播流地址的域名所属的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console-stable.volcanicengine.com/live/main/domain/list)页面，查看需要查询的直播流使用的域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
