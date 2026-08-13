package com.volcengine.service.vms.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class QueryTaskListResult {
    @JSONField(name = "Records")
    private List<TaskListItem> records;

    @JSONField(name = "Total")
    private Long total;

    @JSONField(name = "Limit")
    private Integer limit;

    @JSONField(name = "Offset")
    private Integer offset;
}
