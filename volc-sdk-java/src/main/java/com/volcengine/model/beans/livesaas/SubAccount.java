package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import java.util.List;

@Data
public class SubAccount {
    @JSONField(name = "NickName")
    String NickName;
    @JSONField(name = "Name")
    String Name;
    @JSONField(name = "Type")
    Integer Type;
    @JSONField(name = "OrganizationId")
    Long OrganizationId;
    @JSONField(name = "OrganizationName")
    String OrganizationName;
    @JSONField(name = "Roles")
    List<Role> Roles;
}