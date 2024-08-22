package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * RunSyncCommandResResult
 */
@lombok.Data
public final class RunSyncCommandResResult  {

    /**
     * <p>实例所归属的业务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>对指定的实例执行的命令。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Command")
    private String command;

    /**
     * <p>命令执行状态，参考 [RunSyncCommandStatus](#runsynccommandstatus) 数据格式说明。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private List<com.volcengine.model.acep.v20231030.ResultRunSyncCommandStatus> status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
