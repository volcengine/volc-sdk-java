package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetSubAccountDetailResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    SmsSubAccountDetail result;

    @Data
    public static class SmsSubAccountDetail {
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
        @JSONField(name = "enabledChannelType")
        List<EnabledChannelType> enabledChannelType;
    }

    @Data
    public static class EnabledChannelType {
        @JSONField(name = "name")
        String name;
        @JSONField(name = "value")
        String value;
        @JSONField(name = "area")
        String area;
    }
}
