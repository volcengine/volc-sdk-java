package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.Organization;
import com.volcengine.model.beans.livesaas.SubAccount;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListSubAccountOrganizationsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListSubAccountsResponseBody result;

    @Data
    public static class ListSubAccountsResponseBody {
        @JSONField(name = "TotalCount")
        Long TotalCount;
        @JSONField(name = "SubAccounts")
        List<Organization> Organizations;
    }
}