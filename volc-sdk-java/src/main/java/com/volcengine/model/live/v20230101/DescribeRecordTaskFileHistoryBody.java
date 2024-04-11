package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeRecordTaskFileHistoryBody
 */
@lombok.Data
public final class DescribeRecordTaskFileHistoryBody  {

    /**
     * <p>域名空间，即直播流地址的域名所属的域名空间，默认为空表示查询所有录制历史。您可以调用 [`ListDomainDetail`](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console-stable.volcanicengine.com/live/main/domain/list)页面，查看直播流使用的域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，取值与直播流地址的 AppName 字段取值相同，默认为空表示查询 vhost 下的所有录制历史。支持由大小写字母（A - Z、a - z）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，取值与直播流地址的 StreamName 字段取值相同，默认为空表示查询 App 下的所有录制历史。支持由大小写字母（A - Z、a - z）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 100 个字符。</p>
     *
     * <p>:::tip</p>
     *
     * <p>如果指定 `Stream`，必须同时指定 `App` 的值。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>开始录制时间，RFC3339 格式的时间字符串，精度为秒。当您查询指定录制任务详情时，DateFrom 应设置为开始时间之前的任意时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DateFrom")
    private String dateFrom;

    /**
     * <p>结束录制时间，结束时间需晚于 `DateFrom`，且与 `DateFrom` 间隔不超过 7天，RFC3339 格式的时间字符串，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DateTo")
    private String dateTo;

    /**
     * <p>查询数据的页码，默认为 1，表示查询第一页的数据，取值范围为正整数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>每页显示的数据条数，取值范围为正整数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>录制文件保存位置，支持的取值及含义如下所示。</p>
     *
     * <p>- `tos`：存储到 TOS（默认值）；</p>
     *
     * <p>- `vod`：存储到 VOD。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
