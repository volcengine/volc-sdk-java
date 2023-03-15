package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageContentTaskDetailReq {
    @JSONField(name = "ServiceId")
    String serviceId;
    @JSONField(name = "TaskType")
    String taskType;
    @JSONField(name = "State")
    String state;
    @JSONField(name = "Order")
    String order;
    @JSONField(name = "StartTime")
    Long startTime;
    @JSONField(name = "EndTime")
    Long endTime;
    @JSONField(name = "Url")
    String url;
    @JSONField(name = "PageNum")
    Integer pageNum;
    @JSONField(name = "PageSize")
    Integer pageSize;

}
