package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class UpdateProductReminderInfoResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateProductReminderInfoResponseBody result;

    @Data
    public static class UpdateProductReminderInfoResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}