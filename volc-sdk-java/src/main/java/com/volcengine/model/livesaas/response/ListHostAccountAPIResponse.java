package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class ListHostAccountAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListHostAccountInfoResponseBody result;

    @Data
    public static class ListHostAccountInfoResponseBody {
        @JSONField(name = "HostAccount")
        List<HostAccountInfo> HostAccount;
        @JSONField(name = "PageNo")
        Integer PageNo;
        @JSONField(name = "PageItemCount")
        Integer PageItemCount;
        @JSONField(name = "TotalItemCount")
        Integer TotalItemCount;
    }

    @Data
    public static class HostAccountInfo {
        @JSONField(name = "Id")
        Long Id;
        @JSONField(name = "Name")
        String Name;
        @JSONField(name = "AvatarUrl")
        String AvatarUrl;
        @JSONField(name = "HomeUrl")
        String HomeUrl;
        @JSONField(name = "IsFollowEnable")
        Integer IsFollowEnable;
        @JSONField(name = "CreateTime")
        Long CreateTime;
    }
}