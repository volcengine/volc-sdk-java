package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.CallbackEvent;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListCallbackEventsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    ListCallbackEventsResponseBody result;

    @Data
    public static class ListCallbackEventsResponseBody {
        @JSONField(name = "CallbackEvents")
        List<CallbackEvent> CallbackEvents;

        @JSONField(name = "TotalCount")
        Long TotalCount;
    }
}