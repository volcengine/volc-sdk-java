package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateActivityMenuAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateActivityProductAPIResponse.UpdateActivityProductAPIResultBean result;

    @Data
    public static class UpdateActivityProductAPIResultBean {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
