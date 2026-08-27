package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateRelaySourceV4Body
 */
@lombok.Data
public final class UpdateRelaySourceV4Body  {

    /**
     * <p>域名空间。</p>
     *
     * <p>通过以下任一方式，获取域名空间：</p>
     *
     *
     *
     * <p>- 调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口，通过返回参数 `Vhost` 获取。</p>
     *
     * <p>- 在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，通过**域名空间**字段获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>视频直播播放地址中的 `AppName`。您可调用 [ListRelaySourceV4](https://docs.volcengine.com/docs/6469/1126878?lang=zh) 并根据返回参数 `App` 获取固定触发回源配置的 `AppName`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>视频直播播放地址中的 `StreamName`。您可调用 [ListRelaySourceV4](https://docs.volcengine.com/docs/6469/1126878?lang=zh) 并根据返回参数 `Stream` 获取固定触发回源配置的 `StreamName`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>回源地址列表，即视频直播从源站拉取直播流时访问的地址列表。支持 RTMP、RTMPS、FLV 或 HLS 协议。</p>
     *
     * <p>通常包含协议、源站的域名或 IP 地址，以及源站直播流的 `AppName` 和 `StreamName`。如果源站要求回源请求携带额外参数，还需包含查询参数。例如 `rtmp://192.*.*.10/live01/test01?token=abc`。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- 支持配置自有源站或第三方源站的回源地址。触发回源后，视频直播会访问您配置的回源地址，从源站拉取直播流。</p>
     *
     * <p>- 如果源站使用非默认端口，需在源站的域名或 IP 地址后填写端口，例如 `rtmp://192.*.*.10:1936/live01/test01?token=abc`，否则系统可能按默认端口访问源站，导致回源失败。</p>
     *
     * <p>- 最多支持传入 10 个回源地址。系统会按照回源地址在数组中的排列顺序依次尝试回源，数组中越靠前的地址优先级越高。如果当前回源地址回源失败，系统会再尝试下一个回源地址。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SrcAddrS")
    private List<String> srcAddrS;

    /**
     * <p>回源开始时间。Unix 时间戳，单位为秒。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- `StartTime` 和 `EndTime` 的时间间隔不可超过 7 天。</p>
     *
     * <p>- `StartTime` 和 `EndTime` 需同时传入或同时不传。传入时，表示更新固定回源类型的回源时间，或将永久回源类型变更为固定回源类型并设置回源时间。不传时，表示更新为永久回源类型。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Integer startTime;

    /**
     * <p>回源结束时间。Unix 时间戳，单位为秒。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- `StartTime` 和 `EndTime` 的时间间隔不可超过 7 天。</p>
     *
     * <p>- `StartTime` 和 `EndTime` 需同时传入或同时不传。传入时，表示更新固定回源类型的回源时间，或将永久回源类型变更为固定回源类型并设置回源时间。不传时，表示更新为永久回源类型。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private Integer endTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
