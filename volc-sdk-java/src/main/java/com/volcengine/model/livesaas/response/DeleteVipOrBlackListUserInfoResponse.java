package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;
import java.util.List;

@Data
public class DeleteVipOrBlackListUserInfoResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata ResponseMetadata;
    @JSONField(name = "Result")
    Result Result;

    @Data
    public static class Result {
        @JSONField(name = "Status")
        Integer Status;
    }
}
