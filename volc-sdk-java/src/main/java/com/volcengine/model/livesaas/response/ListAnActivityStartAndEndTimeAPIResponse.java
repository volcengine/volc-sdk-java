package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class ListAnActivityStartAndEndTimeAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListAnActivityStartAndEndTimeAPIResponseBody result;

    @Data
    public static class ListAnActivityStartAndEndTimeAPIResponseBody {
        @JSONField(name = "StartAndEndTime")
        List<StartAndEndTime> StartAndEndTime;
    }

    @Data
    public static class StartAndEndTime {
        @JSONField(name = "OrderNumber")
        Integer OrderNumber;
        @JSONField(name = "StartTime")
        Long StartTime;
        @JSONField(name = "EndTime")
        Long EndTime;
    }
}