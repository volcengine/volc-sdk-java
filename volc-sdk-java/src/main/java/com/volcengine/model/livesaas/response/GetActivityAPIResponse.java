package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class GetActivityAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityAPIBody result;

    @Data
    public static class GetActivityAPIBody {
        @JSONField(name = "Name")
        String Name;
        @JSONField(name = "LiveTime")
        Long LiveTime;
        @JSONField(name = "ViewUrl")
        String ViewUrl;
        @JSONField(name = "OwnerSubAccount")
        String OwnerSubAccount;
        @JSONField(name = "Status")
        Integer Status;
        @JSONField(name = "CoverImage")
        String CoverImage;
        @JSONField(name = "IsLockPreview")
        Integer IsLockPreview;
        @JSONField(name = "Id")
        Long Id;
    }
}