package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListVideoScenariosRequest {
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
    @JSONField(name = "ScenarioName")
    String ScenarioName;
}
