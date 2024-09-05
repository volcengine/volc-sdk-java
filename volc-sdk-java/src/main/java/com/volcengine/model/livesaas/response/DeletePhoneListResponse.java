package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeletePhoneListResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeletePhoneListResponseBody result;

    @Data
    public static class DeletePhoneListResponseBody {
        @JSONField(name="ActivityId")
        Long ActivityId;
        @JSONField(name="Status")
        Integer Status;
    }
}
