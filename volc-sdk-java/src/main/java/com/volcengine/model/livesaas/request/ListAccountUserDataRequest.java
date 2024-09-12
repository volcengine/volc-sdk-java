package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.beans.livesaas.SelectTagFilterAPI;

import java.util.List;
import java.util.Map;

@Data
public class ListAccountUserDataRequest {
    @JSONField(name = "KeyWord")
    String KeyWord;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "PageNumber")
    Integer PageNumber;
    @JSONField(name = "PageSize")
    Integer PageSize;
    @JSONField(name = "SortField")
    String SortField;
    @JSONField(name = "PlayStatus")
    String PlayStatus;
    @JSONField(name = "SelectTags")
    List<SelectTagFilterAPI> SelectTags;
    @JSONField(name = "PageToken")
    String PageToken;
    @JSONField(name = "SortMode")
    String SortMode;
    @JSONField(name = "BanStatus")
    Integer BanStatus;
    @JSONField(name = "UserIds")
    List<Long> UserIds;
}