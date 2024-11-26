package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class UpdateSubAccountRequest {
    @JSONField(name = "Name")
    String Name;

    @JSONField(name = "NickName")
    String NickName;

    @JSONField(name = "OrganizationId")
    Long OrganizationId;

    @JSONField(name = "RoleIds")
    List<Long> RoleIds;
}