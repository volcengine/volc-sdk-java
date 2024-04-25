package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.beans.livesaas.SelectTagFilterAPI;
import java.util.List;
import java.util.Map;

@Data
public class ListAccountActivityHistoryDataRequest {
    @JSONField(name = "PageSize")
    Integer PageSize;
    @JSONField(name = "SortMode")
    String SortMode;
    @JSONField(name = "ActivityName")
    String ActivityName;
    @JSONField(name = "StartLiveTime")
    Long StartLiveTime;
    @JSONField(name = "PageNumber")
    Integer PageNumber;
    @JSONField(name = "EndLiveTime")
    Long EndLiveTime;
    @JSONField(name = "PlayStatus")
    String PlayStatus;
    @JSONField(name = "SelectTags")
    List<SelectTagFilterAPI> SelectTags;
    @JSONField(name = "SortField")
    String SortField;
}