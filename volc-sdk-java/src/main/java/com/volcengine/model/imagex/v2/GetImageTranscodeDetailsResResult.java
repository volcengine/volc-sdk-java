package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageTranscodeDetailsResResult
 */
@lombok.Data
public final class GetImageTranscodeDetailsResResult  {

    /**
     * <p>执行任务详情</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExecInfo")
    private List<GetImageTranscodeDetailsResResultExecInfoItem> execInfo;

    /**
     * <p>总数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Long total;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
