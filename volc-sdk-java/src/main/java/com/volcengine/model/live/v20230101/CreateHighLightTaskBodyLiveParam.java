package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateHighLightTaskBodyLiveParam
 */
@lombok.Data
public final class CreateHighLightTaskBodyLiveParam  {

    /**
     * <p>指定高光提取任务的开始时间，RFC3339 格式的时间戳，精度为秒。默认为空，表示立即开始。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskStartTime")
    private String taskStartTime;

    /**
     * <p>指定高光提取任务的结束时间，RFC3339 格式的时间戳，精度为秒。默认为空，表示高光提取任务执行到直播流结束。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskEndTime")
    private String taskEndTime;

    /**
     * <p>用于判断直播流的断流时长。当断流时间超过该参数值时，直播流被视为结束。单位为秒，默认值为 `120`，取值范围为 [60,900]。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 该参数仅在 `TaskEndTime` 为空时生效。</p>
     *
     * <p>- 如果 `TaskEndTime` 设置了具体值，则任务会按照 `TaskEndTime` 结束，而不会因断流提前终止，即使发生断流，任务仍将持续运行直至 `TaskEndTime` 到达。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamEndTime")
    private Integer streamEndTime;

    /**
     * <p>用于定义直播流剪辑送检的切片时长，即提供给模型进行剪辑的素材时长。单位为秒，默认值为 `300`，取值范围为 [60,10800]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ClipsDuration")
    private Integer clipsDuration;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
