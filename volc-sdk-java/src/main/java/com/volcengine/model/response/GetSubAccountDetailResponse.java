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
        @JSONField(name = "EnabledChannelType")
        List<EnabledChannelType> enabledChannelType;
    }

    @Data
    public static class EnabledChannelType {
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "Value")
        String value;
        @JSONField(name = "Area")
        String area;
    }
}
