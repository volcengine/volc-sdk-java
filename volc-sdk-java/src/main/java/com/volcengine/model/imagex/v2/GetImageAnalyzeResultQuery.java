package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAnalyzeResultQuery
 */
@lombok.Data
public final class GetImageAnalyzeResultQuery  {

    /**
     * <p>任务 ID，您可以通过调用 [GetImageAnalyzeTasks](https://www.volcengine.com/docs/508/1160417) 获取指定地区全部离线评估任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>任务运行开始时间，Unix 时间戳。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Long startTime;

    /**
     * <p>任务运行结束时间，Unix 时间戳。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private Long endTime;

    /**
     * <p>任务执行 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RunId")
    private String runId;

    /**
     * <p>分页条数。默认值为 10。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Integer limit;

    /**
     * <p>分页偏移量，默认为 0。取值为 1 时，表示跳过第一条数据，从第二条数��取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Integer offset;

    /**
     * <p>文件名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "File")
    private String file;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
