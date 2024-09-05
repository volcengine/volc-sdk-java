package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetPhoneListRequest {
    @JSONField(name="ActivityId")
    Long ActivityId;
    @JSONField(name="PermissionOrder")
    Integer PermissionOrder;
    @JSONField(name="PageNum")
    Integer PageNum;
    @JSONField(name="PageSize")
    Integer PageSize;
    @JSONField(name="KeyWord")
    String KeyWord;
}
