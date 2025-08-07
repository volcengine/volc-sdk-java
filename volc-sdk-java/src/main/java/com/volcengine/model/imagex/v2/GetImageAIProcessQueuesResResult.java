package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageAIProcessQueuesResResult
 */
@lombok.Data
public final class GetImageAIProcessQueuesResResult  {

    /**
     * <p>符合条件的队列总数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    /**
     * <p>当前分页队列详细信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Queues")
    private List<GetImageAIProcessQueuesResResultQueuesItem> queues;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
