package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeScheduleSqlTaskResponse extends CommonResponse {
    @JSONField(name = "TaskId")
    private String taskId;

    @JSONField(name = "TaskName")
    private String taskName;

    @JSONField(name = "Description")
    private String description;

    @JSONField(name = "SourceProjectID")
    private String sourceProjectID;

    @JSONField(name = "SourceProjectName")
    private String sourceProjectName;

    @JSONField(name = "SourceTopicID")
    private String sourceTopicID;

    @JSONField(name = "SourceTopicName")
    private String sourceTopicName;

    @JSONField(name = "DestRegion")
    private String destRegion;

    @JSONField(name = "DestProjectID")
    private String destProjectID;

    @JSONField(name = "DestTopicID")
    private String destTopicID;

    @JSONField(name = "DestTopicName")
    private String destTopicName;

    @JSONField(name = "Status")
    private Integer status;

    @JSONField(name = "ProcessStartTime")
    private Long processStartTime;

    @JSONField(name = "ProcessEndTime")
    private Long processEndTime;

    @JSONField(name = "ProcessSqlDelay")
    private Long processSqlDelay;

    @JSONField(name = "ProcessTimeWindow")
    private String processTimeWindow;

    @JSONField(name = "Query")
    private String query;

    @JSONField(name = "RequestCycle")
    private RequestCycle requestCycle;

    @JSONField(name = "CreateTimeStamp")
    private Long createTimeStamp;

    @JSONField(name = "ModifyTimeStamp")
    private Long modifyTimeStamp;

    public DescribeScheduleSqlTaskResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeScheduleSqlTaskResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeScheduleSqlTaskResponse response = (DescribeScheduleSqlTaskResponse) super.deSerialize(data, clazz);
        this.setTaskId(response.getTaskId());
        this.setTaskName(response.getTaskName());
        this.setDescription(response.getDescription());
        this.setSourceProjectID(response.getSourceProjectID());
        this.setSourceProjectName(response.getSourceProjectName());
        this.setSourceTopicID(response.getSourceTopicID());
        this.setSourceTopicName(response.getSourceTopicName());
        this.setDestRegion(response.getDestRegion());
        this.setDestProjectID(response.getDestProjectID());
        this.setDestTopicID(response.getDestTopicID());
        this.setDestTopicName(response.getDestTopicName());
        this.setStatus(response.getStatus());
        this.setProcessStartTime(response.getProcessStartTime());
        this.setProcessEndTime(response.getProcessEndTime());
        this.setProcessSqlDelay(response.getProcessSqlDelay());
        this.setProcessTimeWindow(response.getProcessTimeWindow());
        this.setQuery(response.getQuery());
        this.setRequestCycle(response.getRequestCycle());
        this.setCreateTimeStamp(response.getCreateTimeStamp());
        this.setModifyTimeStamp(response.getModifyTimeStamp());
        return this;
    }
}
