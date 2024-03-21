package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveCustomizedLogDataBody
 */
@lombok.Data
public final class DescribeLiveCustomizedLogDataBody  {

    /**
     * <p>查询的开始时间，RFC3339 格式的 UTC 时间，精度为秒。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 当前仅支持查询最近 31 天的日志数据。</p>
     *
     * <p>- 日志文件按设置的拆分粒度进行拆分（以按 1 小时为拆分粒度为例），请确保查询的开始和结束时间包含所查询时段的所有粒度时间。例如，日志文件按 1 小时拆分时，如需查询某日 07:30:00-08:10:00 日志数据，日志查询开始时间应早于 07:00:00，结束时间应晚于 09:00:00。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>日志类型，请联系技术支持同学获取参数值。</p>
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

    /**
     * <p>域名列表，缺省情况下表示当前用户的所有推流域名和拉流域名。</p>
     *
     * <p>:::tip</p>
     *
     * <p>日志类型为拉流转推日志（Type=relay）时，该参数无效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
