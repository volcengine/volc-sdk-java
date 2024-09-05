package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class InsertPhoneListRequest {
    @JSONField(name="ActivityId")
    Long ActivityId;
    @JSONField(name="PermissionOrder")
    Integer PermissionOrder;
    @JSONField(name="PhoneList")
    List<String> PhoneList;

}
