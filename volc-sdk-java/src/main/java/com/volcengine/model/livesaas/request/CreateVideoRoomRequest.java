package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.KnowledgeClassSpecifics;
import lombok.Data;

@Data
public class CreateVideoRoomRequest {
    @JSONField(name = "OldVideoRoomId")
    Long OldVideoRoomId;
    @JSONField(name = "Name")
    String Name;
    @JSONField(name = "ViewUrlPath")
    String ViewUrlPath;
    @JSONField(name = "Describe")
    String Describe;
    @JSONField(name = "CoverImage")
    String CoverImage;
    @JSONField(name = "VideoRoomClassification")
    Integer VideoRoomClassification;
    @JSONField(name = "KnowledgeClassSpecifics")
    KnowledgeClassSpecifics KnowledgeClassSpecifics;
}
