package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageAuditTasksResResultTasksItem
 */
@lombok.Data
public final class GetImageAuditTasksResResultTasksItem  {

    /**
     * <p>该审核任务所在的服务 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>审核任务 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Id")
    private String id;

    /**
     * <p>该条审核任务的状态，取值如下所示：</p>
     *
     *
     *
     * <p>- `Running`：审核中</p>
     *
     * <p>- `Suspend`：已暂停</p>
     *
     * <p>- `Done`：已完成</p>
     *
     * <p>- `Failed`：审核失败</p>
     *
     * <p>- `Cancel`：已取消</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>该审核任务的更新时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdateAt")
    private String updateAt;

    /**
     * <p>该审核任务的创建时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateAt")
    private String createAt;

    /**
     * <p>审核任务</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditTask")
    private GetImageAuditTasksResResultTasksItemAuditTask auditTask;

    /**
     * <p>仅当 `Type` 值为 `UrlFile` 时，有返回值。表示 txt 审核文件的存储 URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResUri")
    private List<String> resUri;

    /**
     * <p>审核场景，取值如下所示：</p>
     *
     *
     *
     * <p>- `UrlFile`：上传 txt 审核文件处理场景</p>
     *
     * <p>- `Url`：上传审核图片 URL 处理场景</p>
     *
     * <p>- `Upload`：图片上传场景</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>审核任务类型，当前仅支持取值为 `audit`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskType")
    private String taskType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
