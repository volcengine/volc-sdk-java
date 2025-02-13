package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetPullRecordTaskResResult
 */
@lombok.Data
public final class GetPullRecordTaskResResult  {

    /**
     * <p>任务详情。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskDetail")
    private GetPullRecordTaskResResultTaskDetail taskDetail;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
