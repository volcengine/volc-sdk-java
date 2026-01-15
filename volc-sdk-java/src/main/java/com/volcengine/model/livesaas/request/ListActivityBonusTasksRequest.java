package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ListActivityBonusTasksRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;

    @JSONField(name = "PageNumber")
    Integer PageNumber;

    @JSONField(name = "PageSize")
    Integer PageSize;

    @JSONField(name = "StatusList")
    List<Integer> StatusList;
}

