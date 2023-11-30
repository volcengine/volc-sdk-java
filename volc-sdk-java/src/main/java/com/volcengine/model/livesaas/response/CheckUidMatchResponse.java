package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class CheckUidMatchResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CheckUidMatchResponseBody result;

    @Data
    public static class CheckUidMatchResponseBody {
        @JSONField(name = "QueryResult")
        List<QueryUidResult> QueryResult;
    }

    @Data
    public static class QueryUidResult {
        @JSONField(name = "Uid")
        String Uid;
        @JSONField(name = "DouyinId")
        String DouyinId;
        @JSONField(name = "Match")
        Boolean Match;
    }
}