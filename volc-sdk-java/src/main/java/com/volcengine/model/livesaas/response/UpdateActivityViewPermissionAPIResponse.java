package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class UpdateActivityViewPermissionAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateActivityViewPermissionAPIResponseBody result;

    @Data
    public static class UpdateActivityViewPermissionAPIResponseBody {
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "ViewRestrictionInfo")
        ViewRestrictionInfoAPI ViewRestrictionInfo;
        @JSONField(name = "SubViewRestrictionInfo")
        ViewRestrictionInfoAPI SubViewRestrictionInfo;
    }

    @Data
    public static class ViewRestrictionInfoAPI {
        @JSONField(name = "ViewingAccountType")
        Integer ViewingAccountType;
        @JSONField(name = "ViewingRestrictionButtonTitle")
        String ViewingRestrictionButtonTitle;
        @JSONField(name = "CustomViewingRestrictionInfo")
        CustomViewingRestrictionInfoAPI CustomViewingRestrictionInfo;
    }

    @Data
    public static class CustomViewingRestrictionInfoAPI {
        @JSONField(name = "CustomApp")
        String CustomApp;
        @JSONField(name = "CustomUrl")
        String CustomUrl;
        @JSONField(name = "SecretKey")
        String SecretKey;
        @JSONField(name = "ErrorRedirectUrl")
        String ErrorRedirectUrl;
    }
}