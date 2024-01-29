package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.TeachAssistantAccountResp;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListTeachAssistantAccountsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListTeachAssistantAccountsResponseBody result;

    @Data
    public static class ListTeachAssistantAccountsResponseBody {
        @JSONField(name = "MaxTeachAssistantAccountNumber")
        Integer MaxTeachAssistantAccountNumber;
        @JSONField(name = "TeachAssistantAccounts")
        List<TeachAssistantAccountResp> TeachAssistantAccounts;
    }
}
