package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * TranscodingJobStatusResResult
 */
@lombok.Data
public final class TranscodingJobStatusResResult  {

    /**
     * <p>转码任务记录信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<TranscodingJobStatusResResultDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
