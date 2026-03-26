package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.beans.livesaas.PollingChatAPIData;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;

@Data
public class ListUserChatAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListUserChatAPIResponseBody result;

    @Data
    public static class ListUserChatAPIResponseBody {
        @JSONField(name = "Data")
        List<PollingChatAPIData> Data;
    }
}
