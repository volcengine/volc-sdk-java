package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageContentTaskDetailRespData {
    @JSONField(name = "Url")
    String url;
    @JSONField(name = "TaskType")
    String taskType;
    @JSONField(name = "State")
    String state;
    @JSONField(name = "Process")
    String process;
    @JSONField(name = "CreateTime")
    Long createTime;
    @JSONField(name = "UpdateTime")
    Long updateTime;
    @JSONField(name = "Msg")
    String msg;
}
