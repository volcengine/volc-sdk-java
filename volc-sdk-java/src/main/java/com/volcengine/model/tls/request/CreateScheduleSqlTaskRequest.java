package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class CreateScheduleSqlTaskRequest {
    @JSONField(name = TASK_NAME)
    private String taskName;
    @JSONField(name = TOPIC_ID)
    private String topicId;
    @JSONField(name = DEST_REGION)
    private String destRegion;
    @JSONField(name = DEST_TOPIC_ID)
    private String destTopicId;
    @JSONField(name = PROCESS_START_TIME)
    private Long processStartTime;
    @JSONField(name = PROCESS_END_TIME)
    private Long processEndTime;
    @JSONField(name = PROCESS_TIME_WINDOW)
    private String processTimeWindow;
    @JSONField(name = QUERY)
    private String query;
    @JSONField(name = REQUEST_CYCLE)
    private RequestCycle requestCycle;
    @JSONField(name = STATUS)
    private Integer status;
    @JSONField(name = PROCESS_SQL_DELAY)
    private Integer processSqlDelay;
    @JSONField(name = DESCRIPTION)
    private String description;

    /**
     * @param taskName 定时 SQL 分析任务名称
     * @param topicId 待进行定时 SQL 分析的原始日志所在的日志主题 ID
     * @param destTopicId 用于存储定时 SQL 分析结果数据的目标日志主题ID
     * @param processStartTime 调度定时 SQL 分析任务的开始时间，即创建第一个实例的时间。格式为秒级时间戳
     * @param processTimeWindow SQL 时间窗口，即定时 SQL 分析任务运行时，日志检索与分析的时间范围，左闭右开格式
     * @param query 定时 SQL 分析任务定期执行的检索与分析语句
     * @param requestCycle 定时 SQL 分析任务的调度周期
     * @param status 完成任务配置后是否立即启动定时 SQL 分析任务。0：关闭任务，后续需手动启动任务；1：立即启动
     */
    public CreateScheduleSqlTaskRequest(String taskName, String topicId, String destTopicId, 
                                       Long processStartTime, String processTimeWindow, String query, 
                                       RequestCycle requestCycle, Integer status) {
        this.taskName = taskName;
        this.topicId = topicId;
        this.destTopicId = destTopicId;
        this.processStartTime = processStartTime;
        this.processTimeWindow = processTimeWindow;
        this.query = query;
        this.requestCycle = requestCycle;
        this.status = status;
    }

    /**
     * @return 定时 SQL 分析任务名称
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * @param taskName 定时 SQL 分析任务名称
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * @return 待进行定时 SQL 分析的原始日志所在的日志主题 ID
     */
    public String getTopicId() {
        return topicId;
    }

    /**
     * @param topicId 待进行定时 SQL 分析的原始日志所在的日志主题 ID
     */
    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    /**
     * @return 目标日志主题所属地域
     */
    public String getDestRegion() {
        return destRegion;
    }

    /**
     * @param destRegion 目标日志主题所属地域
     */
    public void setDestRegion(String destRegion) {
        this.destRegion = destRegion;
    }

    /**
     * @return 用于存储定时 SQL 分析结果数据的目标日志主题ID
     */
    public String getDestTopicId() {
        return destTopicId;
    }

    /**
     * @param destTopicId 用于存储定时 SQL 分析结果数据的目标日志主题ID
     */
    public void setDestTopicId(String destTopicId) {
        this.destTopicId = destTopicId;
    }

    /**
     * @return 调度定时 SQL 分析任务的开始时间
     */
    public Long getProcessStartTime() {
        return processStartTime;
    }

    /**
     * @param processStartTime 调度定时 SQL 分析任务的开始时间
     */
    public void setProcessStartTime(Long processStartTime) {
        this.processStartTime = processStartTime;
    }

    /**
     * @return 调度定时 SQL 分析任务的结束时间
     */
    public Long getProcessEndTime() {
        return processEndTime;
    }

    /**
     * @param processEndTime 调度定时 SQL 分析任务的结束时间
     */
    public void setProcessEndTime(Long processEndTime) {
        this.processEndTime = processEndTime;
    }

    /**
     * @return SQL 时间窗口
     */
    public String getProcessTimeWindow() {
        return processTimeWindow;
    }

    /**
     * @param processTimeWindow SQL 时间窗口
     */
    public void setProcessTimeWindow(String processTimeWindow) {
        this.processTimeWindow = processTimeWindow;
    }

    /**
     * @return 定时 SQL 分析任务定期执行的检索与分析语句
     */
    public String getQuery() {
        return query;
    }

    /**
     * @param query 定时 SQL 分析任务定期执行的检索与分析语句
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * @return 定时 SQL 分析任务的调度周期
     */
    public RequestCycle getRequestCycle() {
        return requestCycle;
    }

    /**
     * @param requestCycle 定时 SQL 分析任务的调度周期
     */
    public void setRequestCycle(RequestCycle requestCycle) {
        this.requestCycle = requestCycle;
    }

    /**
     * @return 完成任务配置后是否立即启动定时 SQL 分析任务
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status 完成任务配置后是否立即启动定时 SQL 分析任务
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return 每次调度的延迟时间
     */
    public Integer getProcessSqlDelay() {
        return processSqlDelay;
    }

    /**
     * @param processSqlDelay 每次调度的延迟时间
     */
    public void setProcessSqlDelay(Integer processSqlDelay) {
        this.processSqlDelay = processSqlDelay;
    }

    /**
     * @return 定时 SQL 分析任务的简单描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description 定时 SQL 分析任务的简单描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        return this.taskName != null && this.topicId != null && this.destTopicId != null 
                && this.processStartTime != null && this.processTimeWindow != null 
                && this.query != null && this.requestCycle != null && this.status != null;
    }
}
