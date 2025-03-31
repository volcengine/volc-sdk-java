package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageAITasksResResult
 */
@lombok.Data
public final class GetImageAITasksResResult  {

    /**
     * <p>指定的队列 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QueueId")
    private String queueId;

    /**
     * <p>AI 图像处理任务的各类信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskInfo")
    private List<GetImageAITasksResResultTaskInfoItem> taskInfo;

    /**
     * <p>是否还有更多任务，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：是，还有任务未列出。</p>
     *
     * <p>- `false`：否，已列出所有任务。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HasMore")
    private Boolean hasMore;

    /**
     * <p>`HasMore` 取值为 `true` 时（即本次查询还有未列举到的任务时），`Marker` 应作为查询起始位置标记，您需要在下一次查询时传入该值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Marker")
    private String marker;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
