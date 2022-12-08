package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class ListMediasAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListMediasAPIResp result;

    @Data
    public static class ListMediasAPIResp {
        @JSONField(name = "TotalItemCount")
        Integer TotalItemCount;
        @JSONField(name = "Medias")
        List<ListMediasAPIForm> Medias;
        @JSONField(name = "PageNo")
        Integer PageNo;
        @JSONField(name = "PageItemCount")
        Integer PageItemCount;
    }

    @Data
    public static class ListMediasAPIForm {
        @JSONField(name = "Duration")
        Integer Duration;
        @JSONField(name = "Vid")
        String Vid;
        @JSONField(name = "OnlineStatus")
        Integer OnlineStatus;
        @JSONField(name = "CreateTime")
        Long CreateTime;
        @JSONField(name = "CoverImage")
        String CoverImage;
        @JSONField(name = "MediaId")
        Long MediaId;
        @JSONField(name = "Name")
        String Name;
        @JSONField(name = "SourceType")
        Integer SourceType;
    }
}