package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.beans.livesaas.SelectTagFilterAPI;

import java.util.List;
import java.util.Map;

@Data
public class GetAccountUserTrackDataRequest {
    @JSONField(name = "SelectTags")
    List<SelectTagFilterAPI> SelectTags;
    @JSONField(name = "UserId")
    Long UserId;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "WatchType")
    String WatchType;
    @JSONField(name = "ExternalId")
    String ExternalId;
}