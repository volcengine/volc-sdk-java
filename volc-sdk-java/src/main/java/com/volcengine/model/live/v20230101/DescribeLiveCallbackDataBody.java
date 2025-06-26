package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveCallbackDataBody
 */
@lombok.Data
public final class DescribeLiveCallbackDataBody  {

    /**
     * <p>需查询的域名列表，缺省情况下表示当前账号下的所有域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>应用名称，需与推流地址中保持一致。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，用于精确定位某一路直播流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>回调事件类型。支持以下取值：</p>
     *
     * <p>			</p>
     *
     * <p>- `push_start`：推流开始				</p>
     *
     * <p>- `push_end`：推流结束									</p>
     *
     * <p>- `snapshot_event`：截图回调				</p>
     *
     * <p>- `record_event`：录制回调</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackEventType")
    private List<String> callbackEventType;

    /**
     * <p>查询数据的页码，默认为 1，表示查询第一页的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>每页显示的数据条数，默认为 100，表示每页最多展示 100 条数据，取值范围为 [1,1000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>查询的开始时间，RFC3339 格式的 UTC 时间，精度为秒。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>单次查询最大时间跨度为 31 天，历史查询最大时间范围为 366 天。</p>
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
     * <p>回调状态。支持以下取值：</p>
     *
     *
     *
     * <p>- `success`：成功。</p>
     *
     * <p>- `fail`：失败。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackStatus")
    private List<String> callbackStatus;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
