package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class PollingChatAPIUser {
    @JSONField(name = "Nickname")
    String Nickname;
    @JSONField(name = "UserId")
    Long UserId;
    @JSONField(name = "Extra")
    String Extra;
    @JSONField(name = "ExternalId")
    String ExternalId;
}
