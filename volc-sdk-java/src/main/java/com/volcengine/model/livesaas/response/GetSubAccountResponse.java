package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.Role;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetSubAccountResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetSubAccountResponseBody result;

    @Data
    public static class GetSubAccountResponseBody {
        @JSONField(name = "Type")
        Integer Type;

        @JSONField(name = "Name")
        String Name;

        @JSONField(name = "NickName")
        String NickName;

        @JSONField(name = "OrganizationId")
        Long OrganizationId;

        @JSONField(name = "OrganizationName")
        String OrganizationName;

        @JSONField(name = "Roles")
        List<Role> Roles;
    }
}