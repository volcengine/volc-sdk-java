package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListActivityUsersRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "PageNumber")
    Integer PageNumber;
    @JSONField(name = "PageSize")
    Integer PageSize;
    @JSONField(name = "SearchName")
    String SearchName;
    @JSONField(name = "SearchStatus")
    Integer SearchStatus;
    @JSONField(name = "SearchAudienceGroupId")
    Long SearchAudienceGroupId;
}
