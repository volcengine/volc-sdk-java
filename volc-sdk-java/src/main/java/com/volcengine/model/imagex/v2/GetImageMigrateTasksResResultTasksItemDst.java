package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageMigrateTasksResResultTasksItemDst
 */
@lombok.Data
public final class GetImageMigrateTasksResResultTasksItemDst  {

    /**
     * <p>服务 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>上传配置。取值如下所示：</p>
     *
     *
     *
     * <p>- `0`：直接覆盖同名文件</p>
     *
     * <p>- `1`：增加文件名后缀，后缀为 任务 ID</p>
     *
     * <p>- `2`：跳过同名文件，即不做迁移</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UploadConf")
    private Integer uploadConf;

    /**
     * <p>目标 key 前缀</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Prefix")
    private String prefix;

    /**
     * <p>源 Bucket 名称保留规则</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SkipBucket")
    private Boolean skipBucket;

    /**
     * <p>服务名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceName")
    private String serviceName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
