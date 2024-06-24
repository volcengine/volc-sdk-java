package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.AudienceGroupUser;
import lombok.Data;

import java.util.List;

@Data
public class UpdateAudienceGroupUserConfigRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "AudienceGroupUsers")
    List<AudienceGroupUser> AudienceGroupUsers;
}