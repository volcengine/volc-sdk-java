package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveLogDataBody
 */
@lombok.Data
public final class DescribeLiveLogDataBody  {

    /**
     * <p>查询的开始时间，RFC3339 格式的时间戳，精度为秒。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 当前仅支持查询最近 31 天的日志数据。</p>
     *
     * <p>- 日志文件以整小时进行拆分，请确保查询的开始和结束时间包含所查询时段的整点小时时间。例如，如需查询某日 07:30:00-08:10:00 日志数据，日志查询开始时间应早于 07:00:00，结束时间应晚于 09:00:00。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>域名列表，默认为空，表示查询您视频直播产品下所有域名的日志文件信息。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，获取待查询的域名。</p>
     *
     * <p>:::tip</p>
     *
     * <p>日志类型为拉流转推日志（Type 取值为 `relay`）时，该参数无效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>日志类型，支持的类型如下所示。</p>
     *
     * <p>- `pull`：拉流日志；</p>
     *
     * <p>- `push`：推流日志；</p>
     *
     * <p>- `source`：回源日志；</p>
     *
     * <p>- `relay`：拉流转推日志。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>查询数据的页码，默认为 1，表示查询第一页的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>每页显示的数据条数，默认为 20，最大值为 1000。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
