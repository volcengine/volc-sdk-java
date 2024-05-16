package com.volcengine.model.response;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

public class CreateAppResponse {
    @Data
    public static class CommonCreateAppResponse {
        @JSONField(name = "Result")
        private CreateAppResponse.CommonCreateAppResult result;
    }
    @Data
    public static class CommonCreateAppResult {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        CreateAppResponse.CommonCreateAppData data;
    }

    @Data
    public static class CommonCreateAppData {
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
    }
}
