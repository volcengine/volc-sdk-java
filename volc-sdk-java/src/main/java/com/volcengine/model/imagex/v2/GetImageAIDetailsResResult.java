package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageAIDetailsResResult
 */
@lombok.Data
public final class GetImageAIDetailsResResult  {

    /**
     * <p>任务中每个条目的执行详情。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExecInfo")
    private List<GetImageAIDetailsResResultExecInfoItem> execInfo;

    /**
     * <p>任务中包含的条目数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Long total;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
