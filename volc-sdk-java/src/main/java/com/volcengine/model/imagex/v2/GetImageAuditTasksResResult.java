package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageAuditTasksResResult
 */
@lombok.Data
public final class GetImageAuditTasksResResult  {

    /**
     * <p>审核任务详情</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tasks")
    private List<GetImageAuditTasksResResultTasksItem> tasks;

    /**
     * <p>符合请求的审核任务数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
