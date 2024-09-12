package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class UpdateAccountBanStatusResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateAccountBanStatusResponse.UpdateAccountBanStatusModel result;

    @Data
    public static class UpdateAccountBanStatusModel {
        @JSONField(name = "FailedUserIds")
        List<Long> FailedUserIds;
    }
}
