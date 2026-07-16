package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DescribeLogBackFlowTasksRequest {
    @JSONField(name = PAGE_NUMBER)
    private Integer pageNumber;
    @JSONField(name = PAGE_SIZE)
    private Integer pageSize;
    @JSONField(name = TOPIC_ID_LIST)
    private List<String> topicIDList;
    @JSONField(name = TASK_ID)
    private String taskId;
    @JSONField(name = TASK_NAME)
    private String taskName;
    @JSONField(name = STATUS)
    private String status;
    @JSONField(name = ETL_TASK_ID)
    private String etlTaskId;
    @Deprecated
    @JSONField(name = SCHEDULE_SQL_TASK_ID_UPPER, serialize = false, deserialize = false)
    private String scheduleSQLTaskId;
    @JSONField(name = SHIPPER_ID)
    private String shipperId;

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<String> getTopicIDList() {
        return topicIDList;
    }

    public void setTopicIDList(List<String> topicIDList) {
        this.topicIDList = topicIDList;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEtlTaskId() {
        return etlTaskId;
    }

    public void setEtlTaskId(String etlTaskId) {
        this.etlTaskId = etlTaskId;
    }

    public String getScheduleSQLTaskId() {
        return scheduleSQLTaskId;
    }

    public void setScheduleSQLTaskId(String scheduleSQLTaskId) {
        this.scheduleSQLTaskId = scheduleSQLTaskId;
    }

    public String getShipperId() {
        return shipperId;
    }

    public void setShipperId(String shipperId) {
        this.shipperId = shipperId;
    }

    public boolean CheckValidation() {
        return this.scheduleSQLTaskId == null && (this.status == null
                || LOG_BACK_FLOW_STATUS_DONE.equals(this.status)
                || LOG_BACK_FLOW_STATUS_CREATING.equals(this.status)
                || LOG_BACK_FLOW_STATUS_FINISHED.equals(this.status)
                || LOG_BACK_FLOW_STATUS_DELETING.equals(this.status)
                || LOG_BACK_FLOW_STATUS_CREATE_FAILED.equals(this.status)
                || LOG_BACK_FLOW_STATUS_RUN_FAILED.equals(this.status));
    }
}
