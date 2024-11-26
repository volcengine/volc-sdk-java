package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.Role;
import com.volcengine.model.beans.livesaas.SubAccount;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListSubAccountRolesResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListSubAccountRolesResponseBody result;

    @Data
    public static class ListSubAccountRolesResponseBody {
        @JSONField(name = "TotalCount")
        Long TotalCount;
        @JSONField(name = "SubAccounts")
        List<Role> Roles;
    }
}