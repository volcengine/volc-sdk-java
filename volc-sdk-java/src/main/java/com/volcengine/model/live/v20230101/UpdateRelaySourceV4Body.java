package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateRelaySourceV4Body
 */
@lombok.Data
public final class UpdateRelaySourceV4Body  {

    /**
     * <p>开始时间，Unix 时间戳，单位为秒。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 回源开始到结束最大时间跨度为 7 天；</p>
     *
     * <p>- 开始时间与结束时间同时缺省，表示永久回源。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Integer startTime;

    /**
     * <p>结束时间，Unix 时间戳，单位为秒。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 回源开始到结束最大时间跨度为 7 天；</p>
     *
     * <p>- 开始时间与结束时间同时缺省，表示永久回源。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private Integer endTime;

    /**
     * <p>应用名称，拉流域名，您可以调用 [ListRelaySourceV4](https://www.volcengine.com/docs/6469/1126878) 接口，获取待更新固定回源配置的 App 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，您可以调用 [ListRelaySourceV4](https://www.volcengine.com/docs/6469/1126878) 接口，获取待更新固定回源配置的 Domain 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>拉流域名，您可以调用 [ListRelaySourceV4](https://www.volcengine.com/docs/6469/1126878) 接口，获取待更新固定回源配置的 Domain 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>回源地址列表，支持 RTMP、FLV、HLS 和 SRT 回源协议。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- 当源站使用了非默认端口时，支持在回源地址中以`域名:端口`或 `IP:端口`的形式配置端口。</p>
     *
     * <p>- 最多支持添加 10 个回源地址，回源失败时，将按照您添加的地址顺序轮循尝试。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SrcAddrS")
    private List<String> srcAddrS;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
