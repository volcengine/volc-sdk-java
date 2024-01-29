package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageAnalyzeTasksResResultTasksItem
 */
@lombok.Data
public final class GetImageAnalyzeTasksResResultTasksItem  {

    /**
     * <p>离线评估任务名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>任务描述</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Desc")
    private String desc;

    /**
     * <p>任务类型，取值如下所示：</p>
     *
     * <p>- `UrlFile`：在线提交 URL 离线评估</p>
     *
     * <p>- `UriFile`：在线提交 URI 离线评估</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>所在服务的服务 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SampleRate")
    private Double sampleRate;

    /**
     * <p>`Type` 取值 `UriFile` 时，指定的模版名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tpl")
    private String tpl;

    /**
     * <p>txt 评估文件的 Store URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResUri")
    private List<String> resUri;

    /**
     * <p>是否模拟模板每阶段输出，取值如下所示：</p>
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EvalPerStage")
    private Boolean evalPerStage;

    /**
     * <p>该条评估任务的任务 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>任务状态，取值如下所示：</p>
     *
     * <p>- `Pending`：排队中</p>
     *
     * <p>- `Done`：已完成</p>
     *
     * <p>- `Running`：进行中</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>评估任务创建时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateAt")
    private String createAt;

    /**
     * <p>评估任务更新时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdateAt")
    private String updateAt;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
