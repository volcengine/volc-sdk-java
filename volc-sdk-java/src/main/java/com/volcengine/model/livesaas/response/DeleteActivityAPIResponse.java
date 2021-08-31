package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteActivityAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeleteActivityAPIResponse.DeleteActivityAPIResultBean result;

    @Data
    public static class DeleteActivityAPIResultBean {
        @JSONField(name = "ActivityId")
        Long activityId;
    }
}
