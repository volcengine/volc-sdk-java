package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * BatchImageAuditResResult
 */
@lombok.Data
public final class BatchImageAuditResResult  {

    /**
     * <p>包含图片批量审核的结果数组，每个元素代表一张图片的审核结果。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Outputs")
    private List<BatchImageAuditResResultOutputsItem> outputs;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
