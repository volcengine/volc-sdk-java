package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ListScenariosRequest {
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
    @JSONField(name = "ScenarioType")
    Integer ScenarioType;
    @JSONField(name = "ScenarioName")
    String ScenarioName;
}