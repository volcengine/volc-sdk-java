package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * ListTaskQuery
 */
@lombok.Data
public final class ListTaskQuery  {

    /**
     * <p>筛选条件，业务ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>筛选条件，任务 ID，在任务创建后返回。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>筛选条件，任务类型，一般为创建任务接口的 Action，如：</p>
     *
     *
     *
     * <p>- 创建实例并部署应用：`CreatePodOneStep`</p>
     *
     * <p>	</p>
     *
     * <p>- 实例重置：`ResetPod`</p>
     *
     * <p>	</p>
     *
     * <p>- 实例数据迁移：`PodDataTransfer`</p>
     *
     * <p>	</p>
     *
     * <p>- 清理用户数据：`PodDataDelete`</p>
     *
     * <p>	</p>
     *
     * <p>- 应用上传：`UploadApp`</p>
     *
     * <p>	</p>
     *
     * <p>- 应用安装：`InstallApp`</p>
     *
     * <p>	</p>
     *
     * <p>- 启动应用：`LaunchApp`</p>
     *
     * <p>	</p>
     *
     * <p>- 关闭应用：`CloseApp`</p>
     *
     * <p>	</p>
     *
     * <p>- 应用卸载：`UninstallApp`</p>
     *
     * <p>	</p>
     *
     * <p>- 推送文件：`PushFile`</p>
     *
     * <p>	</p>
     *
     * <p>- 下载文件：`PullFile`</p>
     *
     * <p>	</p>
     *
     * <p>- 开始指令同步：`StartPodEventSync`</p>
     *
     * <p>	</p>
     *
     * <p>- 更新指令同步：`UpdatePodEventSync`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskAction")
    private String taskAction;

    /**
     * <p>筛选条件，任务状态；任务进度，0~100，100 为任务完成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskResult")
    private Long taskResult;

    /**
     * <p>筛选条件，分页参数，偏移量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Long offset;

    /**
     * <p>筛选条件，分页参数，查询数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Long count;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
