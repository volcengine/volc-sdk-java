package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageMigrateTasksResResultTasksItem
 */
@lombok.Data
public final class GetImageMigrateTasksResResultTasksItem  {

    /**
     * <p>任务 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private String iD;

    /**
     * <p>任务名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>源信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Source")
    private GetImageMigrateTasksResResultTasksItemSource source;

    /**
     * <p>迁移进度信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Progress")
    private GetImageMigrateTasksResResultTasksItemProgress progress;

    /**
     * <p>迁移策略</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RunStrategy")
    private GetImageMigrateTasksResResultTasksItemRunStrategy runStrategy;

    /**
     * <p>转码配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Transcode")
    private GetImageMigrateTasksResResultTasksItemTranscode transcode;

    /**
     * <p>目标信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Dst")
    private GetImageMigrateTasksResResultTasksItemDst dst;

    /**
     * <p>运行时长信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Run")
    private List<GetImageMigrateTasksResResultTasksItemRunItem> run;

    /**
     * <p>任务状态。取值如下所示：</p>
     *
     *
     *
     * <p>- `Initial`：创建中</p>
     *
     * <p>- `Running`：运行中</p>
     *
     * <p>- `Done`：全部迁移完成</p>
     *
     * <p>- `Partial`：部分迁移完成</p>
     *
     * <p>- `Failed`：迁移失败</p>
     *
     * <p>- `Terminated`：中止</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
