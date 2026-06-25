package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.KnowledgeClassMeta;
import lombok.Data;

@Data
public class UpdateVideoRoomBasicInfoRequest {
    @JSONField(name = "VideoRoomId")
    Long VideoRoomId;
    @JSONField(name = "Name")
    String Name;
    @JSONField(name = "CoverImage")
    String CoverImage;
    @JSONField(name = "VideoRoomClassification")
    Integer VideoRoomClassification;
    @JSONField(name = "KnowledgeClassMeta")
    KnowledgeClassMeta KnowledgeClassMeta;
}
