package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.KnowledgeClassMeta;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetVideoRoomBasicInfoResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetVideoRoomBasicInfoResponseBody result;

    @Data
    public static class GetVideoRoomBasicInfoResponseBody {
        @JSONField(name = "Name")
        String Name;
        @JSONField(name = "CoverImage")
        String CoverImage;
        @JSONField(name = "VideoRoomClassification")
        Integer VideoRoomClassification;
        @JSONField(name = "KnowledgeClassMeta")
        KnowledgeClassMeta KnowledgeClassMeta;
        @JSONField(name = "ViewUrlPath")
        String ViewUrlPath;
        @JSONField(name = "ViewUrlNameSpace")
        String ViewUrlNameSpace;
        @JSONField(name = "CreateTime")
        Long CreateTime;
        @JSONField(name = "ViewUrl")
        String ViewUrl;
    }
}
