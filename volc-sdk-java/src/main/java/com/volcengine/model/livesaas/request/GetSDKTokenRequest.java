package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class GetSDKTokenRequest {
    @JSONField(name = "Mode")
    Integer Mode;
    @JSONField(name = "UserIdStr")
    String UserIdStr;
    @JSONField(name = "Nickname")
    String Nickname;
    @JSONField(name = "InviteToken")
    String InviteToken;
    @JSONField(name = "AvatarUrl")
    String AvatarUrl;
    @JSONField(name = "ActivityId")
    Long ActivityId;
}