package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultRunSyncCommandStatus
 */
@lombok.Data
public final class ResultRunSyncCommandStatus  {

    /**
     * <p>实例 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>命令执行结果详情</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Detail")
    private String detail;

    /**
     * <p>命令是否执行成功</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Success")
    private Boolean success;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
