package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageTranscodeQueuesResResult
 */
@lombok.Data
public final class GetImageTranscodeQueuesResResult  {

    /**
     * <p>当前分页队列详细信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Queues")
    private List<GetImageTranscodeQueuesResResultQueuesItem> queues;

    /**
     * <p>符合条件的队列总数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Long total;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
