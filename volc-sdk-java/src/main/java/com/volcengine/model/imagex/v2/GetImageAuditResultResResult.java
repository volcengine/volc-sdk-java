package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageAuditResultResResult
 */
@lombok.Data
public final class GetImageAuditResultResResult  {

    /**
     * <p>任务结果</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Results")
    private List<GetImageAuditResultResResultResultsItem> results;

    /**
     * <p>是否还有更多任务，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：是，还有其他任务未列举</p>
     *
     * <p>- `false`：否，已列举所有任务</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HaveMore")
    private Boolean haveMore;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
