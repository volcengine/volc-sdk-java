package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListUserChatAPIRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "UserId")
    Long UserId;
    @JSONField(name = "ExternalUserId")
    String ExternalUserId;
    @JSONField(name = "ChatId")
    Long ChatId;
    @JSONField(name = "Count")
    Integer Count;
    @JSONField(name = "PollingOrder")
    Integer PollingOrder;
    @JSONField(name = "ReviewStatus")
    Integer ReviewStatus;
}
