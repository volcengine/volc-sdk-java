package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetActivityBanUsersResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityBanUsersResponse.GetActivityBanUsersBody result;

    @Data
    public static class GetActivityBanUsersBody {
        @JSONField(name = "UserIds")
        List<Long> UserIds;
        @JSONField(name = "Cookies")
        List<String> Cookies;
    }
}
