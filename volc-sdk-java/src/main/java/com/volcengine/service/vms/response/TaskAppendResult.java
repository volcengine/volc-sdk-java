package com.volcengine.service.vms.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class TaskAppendResult {
    @JSONField(name = "TaskOpenId")
    private String taskOpenId;

    @JSONField(name = "FailList")
    private List<FailItem> failList;
}
