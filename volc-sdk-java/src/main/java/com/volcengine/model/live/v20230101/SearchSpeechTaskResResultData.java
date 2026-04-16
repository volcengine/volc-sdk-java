package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * SearchSpeechTaskResResultData
 */
@lombok.Data
public final class SearchSpeechTaskResResultData  {

    /**
     * <p>返回的任务总数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>任务信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tasks")
    private List<SearchSpeechTaskResResultDataTasksItem> tasks;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
