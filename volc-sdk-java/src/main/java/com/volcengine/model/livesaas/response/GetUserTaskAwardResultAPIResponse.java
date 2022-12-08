package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetUserTaskAwardResultAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetUserTaskAwardResultAPIBody result;

    @Data
    public static class GetUserTaskAwardResultAPIBody {
        @JSONField(name = "IsWin")
        Boolean IsWin;
    }
}