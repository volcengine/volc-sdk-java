package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AudienceGroupUser {
    @JSONField(name = "FlagId")
    String FlagId;
    @JSONField(name = "UserId")
    Long UserId;
    @JSONField(name = "AudienceGroupName")
    String AudienceGroupName;
    @JSONField(name = "AudienceGroupId")
    Long AudienceGroupId;
}
