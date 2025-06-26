package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListHighLightTaskResResultDataResultItem
 */
@lombok.Data
public final class ListHighLightTaskResResultDataResultItem  {

    /**
     * <p>高光剪辑任务所属的账号 ID，用于标识任务所属的账号。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>高光剪辑任务的名称，用于标识和区分不同的任务。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>高光剪辑任务的状态，可能的取值如下所示。</p>
     *
     * <p>- `init`：任务初始化状态；</p>
     *
     * <p>- `pending`：任务等待启动阶段；</p>
     *
     * <p>- `prepare`：任务启动状态；</p>
     *
     * <p>- `running`：任务生产状态；</p>
     *
     * <p>- `prestop`：任务准备结束状态；</p>
     *
     * <p>- `done`：任务完成状态；</p>
     *
     * <p>- `error`：任务报错状态。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>高光剪辑任务的唯一标识符，由系统在任务创建时返回。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
