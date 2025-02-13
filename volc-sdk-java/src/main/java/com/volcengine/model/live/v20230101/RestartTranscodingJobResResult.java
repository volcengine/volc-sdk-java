package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * RestartTranscodingJobResResult
 */
@lombok.Data
public final class RestartTranscodingJobResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Code")
    private Integer code;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<RestartTranscodingJobResResultDataItem> data;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Msg")
    private String msg;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
