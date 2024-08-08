package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultJob
 */
@lombok.Data
public final class ResultJob  {

    /**
     * <p>子任务 ID，每个子任务 ID 对应一个实例。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "JobId")
    private String jobId;

    /**
     * <p>实例 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>云机 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HostId")
    private String hostId;

    /**
     * <p>子任务执行状态。取值如下：</p>
     *
     *
     *
     * <p>- `-2`：部分失败</p>
     *
     * <p>- `-1`：全部失败</p>
     *
     * <p>- `10`：执行中</p>
     *
     * <p>- `100`：成功</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>子任务类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "JobAction")
    private String jobAction;

    /**
     * <p>子任务信息，为任务执行过程中，或执行完成后产生的信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "JobMessage")
    private String jobMessage;

    /**
     * <p>打包应用程序的包名, `JobAction` 为 `CreateAppImage` 时返回。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PackageName")
    private String packageName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
