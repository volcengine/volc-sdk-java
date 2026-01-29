package com.volcengine.service.vms.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class QueryRiskDenyInfoResponse {

    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    private Result result;

    @Data
    public static class Result {
        @JSONField(name = "AccountRequestId")
        private String accountRequestId;
        @JSONField(name = "Level")
        private int level;
        @JSONField(name = "Mobile")
        private String mobile;
        @JSONField(name = "Score")
        private int score;
    }
}