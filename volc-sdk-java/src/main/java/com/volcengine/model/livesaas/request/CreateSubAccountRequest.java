package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class CreateSubAccountRequest {
    @JSONField(name = "Type")
    Integer Type;
    @JSONField(name = "Name")
    String Name;

    @JSONField(name = "NickName")
    String NickName;

    @JSONField(name = "OrganizationId")
    Long OrganizationId;

    @JSONField(name = "RoleIds")
    List<Long> RoleIds;
}