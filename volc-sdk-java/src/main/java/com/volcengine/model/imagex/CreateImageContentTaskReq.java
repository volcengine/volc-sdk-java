package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class CreateImageContentTaskReq {
    @JSONField(name = "ServiceId")
    String serviceId;
    @JSONField(name = "TaskType")
    String taskType;
    @JSONField(name = "Urls")
    List<String> urls;
}

