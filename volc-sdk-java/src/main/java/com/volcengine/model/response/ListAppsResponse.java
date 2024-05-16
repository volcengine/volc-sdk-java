package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

public class ListAppsResponse {
    @Data
    public static class CommonListAppsResponse {
        @JSONField(name = "Result")
        private ListAppsResponse.CommonListAppsResult result;
    }
    @Data
    public static class CommonListAppsResult {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private ListAppsResponse.CommonListAppsData data;
    }

    @Data
    public static class CommonListAppsData {
        @JSONField(name = "Limit")
        private String limit;
        @JSONField(name = "Offset")
        private String offset;
        @JSONField(name = "Total")
        private String total;
        @JSONField(name = "Apps")
        ListAppsAppModel[] apps;
    }
    @Data
    public static class ListAppsAppModel{
        @JSONField(name = "AppId")
        private Integer appId;
        @JSONField(name = "AppName")
        private String appName;
        @JSONField(name = "AppNameZh")
        private String appNameZh;
        @JSONField(name = "AppType")
        private String appType;
        @JSONField(name = "Description")
        private String description;
        @JSONField(name = "CreatedTime")
        private String createdTime;
        @JSONField(name = "UpdatedTime")
        private String updatedTime;
        @JSONField(name = "IsFavor")
        private Boolean isFavor;
    }
}
