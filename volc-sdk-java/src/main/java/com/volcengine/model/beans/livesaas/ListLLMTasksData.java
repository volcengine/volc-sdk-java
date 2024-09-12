package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ListLLMTasksData {
    @JSONField(name = "PageNumber")
    Integer PageNumber;
    @JSONField(name = "PageSize")
    Integer PageSize;
    @JSONField(name = "TotalCount")
    Integer TotalCount;
    @JSONField(name = "Tasks")
    List<LLMTask> Tasks;
}
