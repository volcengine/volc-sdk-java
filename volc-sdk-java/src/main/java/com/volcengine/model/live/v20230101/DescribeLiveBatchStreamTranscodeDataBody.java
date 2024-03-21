package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveBatchStreamTranscodeDataBody
 */
@lombok.Data
public final class DescribeLiveBatchStreamTranscodeDataBody  {

    /**
     * <p>域名列表，缺省情况下表示当前账号下的所有推拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>查询的开始时间，RFC3339 格式的 UTC 时间，精度为秒。</p>
     *
     * <p>:::tip</p>
     *
     * <p>查询历史数据的时间范围为 366 天。</p>
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
     * <p>每页显示的数据条数，默认值为 1000，取值范围为 [100,1000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>查询数据的页码，默认值为 1，表示查询第一页的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
