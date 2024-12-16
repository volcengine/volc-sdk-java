package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetLinkUserAmountResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetLinkUserAmountResponseBody result;

    @Data
    public static class GetLinkUserAmountResponseBody {
        @JSONField(name = "LinkUserAmount")
        Long LinkUserAmount;
    }
}
