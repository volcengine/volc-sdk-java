package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListHighLightTaskBody
 */
@lombok.Data
public final class ListHighLightTaskBody  {

    /**
     * <p>若干高光剪辑任务的唯一标识符列表，用于指定需要查询的具体任务。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskIds")
    private List<String> taskIds;

    /**
     * <p>高光剪辑任务的状态列表，用于筛选指定状态的任务，默认查询所有状态的任务。支持的状态包括：</p>
     *
     * <p>- `init`：任务初始化状态；</p>
     *
     * <p>- `pending`：任务等待启动阶段；</p>
     *
     * <p>- `prepare`：任务启动状态；</p>
     *
     * <p>- `running`：任务生产状态；</p>
     *
     * <p>- `prestop`：任务准备结束状态；</p>
     *
     * <p>- `done`：任务完成状态；</p>
     *
     * <p>- `error`：任务报错状态。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskStatus")
    private List<String> taskStatus;

    /**
     * <p>遍历在某个时间范围内创建的高光剪辑任务，时间范围的起始时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTimeSt")
    private String createTimeSt;

    /**
     * <p>遍历在某个时间范围内创建的高光剪辑任务，时间范围的截止时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTimeEd")
    private String createTimeEd;

    /**
     * <p>遍历在某个时间范围内停止的高光剪辑任务，时间范围的起始时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StopTimeSt")
    private String stopTimeSt;

    /**
     * <p>遍历在某个时间范围内停止的高光剪辑任务，时间范围的截止时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StopTimeEd")
    private String stopTimeEd;

    /**
     * <p>遍历任务的分页数，用于指定查询结果的页码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Page")
    private Integer page;

    /**
     * <p>遍历任务单页的任务数量，用于指定每页返回的任务记录数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>遍历结果任务的排序方式，默认值为 `desc`。支持的取值如下所示。</p>
     *
     * <p>- `asc`：升序；</p>
     *
     * <p>- `desc`：降序。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Order")
    private String order;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
