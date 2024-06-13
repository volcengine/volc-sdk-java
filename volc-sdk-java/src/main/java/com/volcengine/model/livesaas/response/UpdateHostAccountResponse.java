package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;


@Data
public class UpdateHostAccountResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateHostAccountResponseBody result;

    @Data
    public static class UpdateHostAccountResponseBody {
        @JSONField(name = "HostAccountId")
        Long HostAccountId;
    }
}
