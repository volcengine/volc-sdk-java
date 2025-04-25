package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteTaskByAccountIDResResult
 */
@lombok.Data
public final class DeleteTaskByAccountIDResResult  {

    /**
     * <p>任务删除操作的详细信息。</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private String data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
