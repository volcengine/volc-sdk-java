package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class UpdateActivityViewPermissionAPIRequest {
    @JSONField(name = "IsSubViewingRestrictionEnable")
    Boolean IsSubViewingRestrictionEnable;
    @JSONField(name = "ViewingRestriction")
    ViewingRestrictionAPI ViewingRestriction;
    @JSONField(name = "SubViewingRestriction")
    ViewingRestrictionAPI SubViewingRestriction;
    @JSONField(name = "ActivityId")
    Long ActivityId;

    @Data
    public static class ViewingRestrictionAPI {
        @JSONField(name = "ViewingAccountType")
        Integer ViewingAccountType;
        @JSONField(name = "ViewingRestrictionButtonTitle")
        String ViewingRestrictionButtonTitle;
        @JSONField(name = "CustomViewingRestriction")
        CustomViewingRestrictionAPI CustomViewingRestriction;
    }

    @Data
    public static class CustomViewingRestrictionAPI {
        @JSONField(name = "CustomApp")
        String CustomApp;
        @JSONField(name = "CustomUrl")
        String CustomUrl;
        @JSONField(name = "ErrorRedirectUrl")
        String ErrorRedirectUrl;
    }
}