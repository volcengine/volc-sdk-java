package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetActivityBanIpsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityBanIpsResponse.GetActivityBanIpsBody result;

    @Data
    public static class GetActivityBanIpsBody {
        @JSONField(name = "Ips")
        List<String> Ips;
    }
}
