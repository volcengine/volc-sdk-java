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
        @JSONField(name = "List")
        List<SmsSubAccountInfo> list;
        @JSONField(name = "Total")
        int total;
    }

    @Data
    public static class SmsSubAccountInfo {
        @JSONField(name = "SubAccountId")
        String subAccountId;
        @JSONField(name = "SubAccountName")
        String subAccountName;
        @JSONField(name = "CreatedTime")
        int createdTime;
        @JSONField(name = "Status")
        int status;
        @JSONField(name = "Desc")
        String desc;
    }
}
