package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ListVideoTasksRequest {
    @JSONField(name = "ProjectName")
    String ProjectName;
    @JSONField(name = "PageNumber")
    Integer PageNumber;
    @JSONField(name = "PageSize")
    Integer PageSize;
    @JSONField(name = "SortOrder")
    String SortOrder;
    @JSONField(name = "SortBy")
    String SortBy;
    @JSONField(name = "TaskName")
    String TaskName;
    @JSONField(name = "ScenarioId")
    Long ScenarioId;
    @JSONField(name = "StartTime")
    Long StartTime;
    @JSONField(name = "EndTime")
    Long EndTime;
    @JSONField(name = "TaskStatus")
    List<Integer> TaskStatus;
    @JSONField(name = "MachineStatus")
    List<Integer> MachineStatus;
    @JSONField(name = "ManualStatus")
    List<Integer> ManualStatus;
    @JSONField(name = "TagIds")
    List<Long> TagIds;
    @JSONField(name = "TaskIds")
    List<Long> TaskIds;
}
