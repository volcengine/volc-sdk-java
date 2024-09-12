package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ListLLMTasksData;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class ListLLMTasksResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListLLMTasksResponseBody result;

    @Data
    public static class ListLLMTasksResponseBody {
        @JSONField(name = "Code")
        Integer Code;
        @JSONField(name = "Message")
        String Message;
        @JSONField(name = "Data")
        ListLLMTasksData Data;
    }
}
