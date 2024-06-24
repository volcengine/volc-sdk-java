package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListAudienceGroupUserRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "AudienceGroupId")
    Long AudienceGroupId;
    @JSONField(name = "PageNumber")
    Integer PageNumber;
    @JSONField(name = "PageSize")
    Integer PageSize;
    @JSONField(name = "SearchKeyWord")
    String SearchKeyWord;
}