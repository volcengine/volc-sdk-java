package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DeleteWhiteListRequest {
    @JSONField(name="ActivityId")
    Long ActivityId;
    @JSONField(name="DeleteAll")
    Integer DeleteAll;
    @JSONField(name="DeleteUserList")
    List<String> DeleteUserList;
    @JSONField(name="PermissionOrder")
    Integer PermissionOrder;
}
