package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageMigrateTaskBodyTask
 */
@lombok.Data
public final class CreateImageMigrateTaskBodyTask  {

    /**
     * <p>自定义迁移任务名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>迁移源信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Source")
    private CreateImageMigrateTaskBodyTaskSource source;

    /**
     * <p>转码配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Transcode")
    private CreateImageMigrateTaskBodyTaskTranscode transcode;

    /**
     * <p>目的信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Dst")
    private CreateImageMigrateTaskBodyTaskDst dst;

    /**
     * <p>迁移策略</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RunStrategy")
    private CreateImageMigrateTaskBodyTaskRunStrategy runStrategy;

    /**
     * <p>回调信息。配置后，当任务执行完成时，将往该回调配置地址发送任务回调信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackCfg")
    private CreateImageMigrateTaskBodyTaskCallbackCfg callbackCfg;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
