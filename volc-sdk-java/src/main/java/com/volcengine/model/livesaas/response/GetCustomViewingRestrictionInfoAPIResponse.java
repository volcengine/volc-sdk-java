package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class GetCustomViewingRestrictionInfoAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetCustomViewingRestrictionInfoAPIResponseBody result;

    @Data
    public static class GetCustomViewingRestrictionInfoAPIResponseBody {
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "CustomViewingRestriction")
        List<CustomViewingRestriction> CustomViewingRestriction;
        @JSONField(name = "MainViewingRestrictionButtonTitle")
        String MainViewingRestrictionButtonTitle;
        @JSONField(name = "SubViewingRestrictionButtonTitle")
        String SubViewingRestrictionButtonTitle;
    }

    @Data
    public static class CustomViewingRestriction {
        @JSONField(name = "CustomApp")
        String CustomApp;
        @JSONField(name = "CustomUrl")
        String CustomUrl;
        @JSONField(name = "SecretKey")
        String SecretKey;
        @JSONField(name = "ViewingRestrictionType")
        Integer ViewingRestrictionType;
    }
}