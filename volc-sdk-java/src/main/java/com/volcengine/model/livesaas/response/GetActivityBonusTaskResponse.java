package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ActivityBonusTask;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetActivityBonusTaskResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    GetActivityBonusTaskResponseBody result;

    @Data
    public static class GetActivityBonusTaskResponseBody {
        @JSONField(name = "ActivityBonusTask")
        ActivityBonusTask ActivityBonusTask;
    }
}

