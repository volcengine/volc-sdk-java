package com.volcengine.model.request.cloudtrail;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class LookupEventsRequest {
    @JSONField(name = "NextToken")
    String nextToken;
    @JSONField(name = "MaxResults")
    int maxResults;
    @JSONField(name = "StartTime")
    Long startTime;
    @JSONField(name = "EndTime")
    Long endTime;
    @JSONField(name = "LookupConditions")
    List<LookupCondition> lookupConditions;

    @Data
    public static class LookupCondition {
        @JSONField(name = "LookupConditionKey")
        String lookupConditionKey;
        @JSONField(name = "LookupConditionValue")
        String lookupConditionValue; 
    }
}
