package com.volcengine.model.response;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

public class RiskStatResponse {
    @Data
    public static class CommonRiskStatResponse {
        @JSONField(name = "Result")
        CommonRiskStatResult result;
    }
    
    @Data
    public static class CommonRiskStatResult {
        @JSONField(name = "RequestId")
        String requestId;
        @JSONField(name = "Code")
        int code;
        @JSONField(name = "Message")
        String message;
        @JSONField(name = "Data")
        CommonProductStatisticsResult data;
    }

    @Data
    public static class CommonProductStatisticsResult {
        @JSONField(name = "Total")
        JSONObject total;
        @JSONField(name = "Detail")
        JSONArray detail;
    }
}
