package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListActivityAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListActivityAPIResp result;

    @Data
    public static class ListActivityAPIResp {
        @JSONField(name = "PageItemCount")
        Integer PageItemCount;
        @JSONField(name = "TotalItemCount")
        Integer TotalItemCount;
        @JSONField(name = "Activities")
        List<ListActivityAPIForm> Activities;
        @JSONField(name = "PageNo")
        Integer PageNo;
    }

    @Data
    public static class ListActivityAPIForm {
        @JSONField(name = "SiteTags")
        List<SiteActivityTag> SiteTags;
        @JSONField(name = "IsLockPreview")
        Integer IsLockPreview;
        @JSONField(name = "HostAccountId")
        Long HostAccountId;
        @JSONField(name = "TextSiteTags")
        List<SiteActivityTag> TextSiteTags;
        @JSONField(name = "Id")
        Long Id;
        @JSONField(name = "Name")
        String Name;
        @JSONField(name = "CoverImage")
        String CoverImage;
        @JSONField(name = "CreateTime")
        Long CreateTime;
        @JSONField(name = "HostAccountName")
        String HostAccountName;
        @JSONField(name = "ViewUrl")
        String ViewUrl;
        @JSONField(name = "Status")
        Integer Status;
        @JSONField(name = "LiveTime")
        Long LiveTime;
        @JSONField(name = "StreamStartTime")
        Long StreamStartTime;
        @JSONField(name = "LiveReviewStatus")
        Integer LiveReviewStatus;
        @JSONField(name = "LiveMode")
        Integer LiveMode;
    }

    @Data
    public static class SiteActivityTag {
        @JSONField(name = "Index")
        Integer Index;
        @JSONField(name = "Value")
        String Value;
        @JSONField(name = "Name")
        String Name;
    }
}
