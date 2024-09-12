package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetSubAccountListResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "list")
        List<SmsSubAccountInfo> list;
        @JSONField(name = "total")
        int total;
    }

    @Data
    public static class SmsSubAccountInfo {
        @JSONField(name = "subAccountId")
        String subAccountId;
        @JSONField(name = "subAccountName")
        String subAccountName;
        @JSONField(name = "createdTime")
        int createdTime;
        @JSONField(name = "status")
        int status;
        @JSONField(name = "desc")
        String desc;
    }
}
