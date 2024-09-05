package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class InsertWhiteListRequest {
    @JSONField(name="ActivityId")
    Long ActivityId;
    @JSONField(name="PermissionOrder")
    Integer PermissionOrder;
    @JSONField(name="WhiteListUser")
    List<WhiteListUser> WhiteListUser;

    @Data
    public static class WhiteListUser {
        @JSONField(name="ExternalUserId")
        String externalUserId;
        @JSONField(name="NickName")
        String nickName;
    }
}
