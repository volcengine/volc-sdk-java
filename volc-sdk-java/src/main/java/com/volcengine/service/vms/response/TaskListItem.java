package com.volcengine.service.vms.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

@Data
public class TaskListItem {
    @JSONField(name = "TaskOpenId")
    private String taskOpenId;

    @JSONField(name = "Name")
    private String name;

    @JSONField(name = "Resource")
    private String resource;

    @JSONField(name = "ResourceType")
    private Integer resourceType;

    @JSONField(name = "ResourceName")
    private String resourceName;

    @JSONField(name = "State")
    private Integer state;

    @JSONField(name = "StartTime", format = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    @JSONField(name = "EndTime", format = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    @JSONField(name = "ListNum")
    private Integer listNum;

    @JSONField(name = "CalledNum")
    private Integer calledNum;

    @JSONField(name = "ThroughNum")
    private Integer throughNum;

    @JSONField(name = "ThroughRate")
    private Double throughRate;

    @JSONField(name = "FinishRate")
    private Double finishRate;
}
