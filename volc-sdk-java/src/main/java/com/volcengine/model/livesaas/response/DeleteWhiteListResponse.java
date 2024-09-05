package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteWhiteListResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name="Result")
    DeleteWhiteListResponseBody result;

    @Data
    public static class DeleteWhiteListResponseBody {
        @JSONField(name="ActivityId")
        Long activityId;
        @JSONField(name="Status")
        Integer status;
    }
}
